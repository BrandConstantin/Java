package parsers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.jr.ob.JSON;

import data.ResultData;
import data.ResultArray;

public class JacksonJsonParser implements JsonParser {
	
	public static void main(String[] args) {
		JsonParser parser = new JacksonJsonParser();
		try (FileInputStream in = new FileInputStream("JSON Example.js")) {
			List<ResultData> results = parser.parseJson(in);
			for (ResultData result : results) {
				System.out.println(result.getTitle());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<ResultData> parseJson(InputStream in) throws IOException {
		ResultArray items = JSON.std.beanFrom(ResultArray.class, in);
		return items.getItems();
	}

}
