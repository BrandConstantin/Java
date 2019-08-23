package parsers;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import data.ResultData;

public interface JsonParser {

	List<ResultData> parseJson(InputStream in) throws IOException;

}