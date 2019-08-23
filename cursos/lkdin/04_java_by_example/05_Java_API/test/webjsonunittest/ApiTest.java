package webjson;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Test;

import data.ResultData;
import parsers.JacksonJsonParser;
import parsers.JsonParser;
import parsers.JsonpJsonParser;
import webjson.StckQuery.SortBy;
import webjson.StckQuery.SortOrder;

public class ApiTest {
	@Test
	public void testConnection() throws IOException {
		StckQuery query = new StckQuery();
		
		query.setSearchTerm("Hello World");
		query.setSortBy(SortBy.RELEVANCE);
		query.setSortBy(SortOrder.ASCENDING);
		
		//System.out.println(query.buildUrl());
		List<ResultData> result = query.execute();
		//System.out.println("Result count = " + result.size());
		assertNotEquals(0, result.size());
	}
	
	public static void main(String[] args) {
		ApiTest test = new ApiTest();
		try {
			test.testConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testUrl() throws MalformedURLException {
		StckQuery query = new StckQuery();
		
		query.setSearchTerm("Hello World");
		query.setSortOrder(SortOrder.ASCENDING);
		query.setSortBy(SortBy.RELEVANCE);
		
		URL url = query.buildUrl();
		String goodUrl = "https://api.stackexchange.com/2.2/search?" + 
				"site=stackoverflow&pagesize=5&order=asc&sortrelevance&" + 
				"tagged=java&intitle=Hello%20World";
		assertEquals(goodUrl, url.toString());
	}
	
	@Test
	public void jsonpParserTest() throws IOException {
		JsonParser parser = new JsonpJsonParser();
		try (FileInputStream in = new FileInputStream("JSON Example.js")) {
			List<ResultData> results = parser.parseJson(in);
			checkTestParse(results);
		}
	}
	
	public void checkTestParse(List<ResultData> results) {
		// test against local Json Example.js file
		assertNotNull(results);
		assertEquals(2, results.size());
		
		ResultData result1 = results.get(0);
		assertEquals("java", result1.getTags()[0]);
		assertEquals("urlconnection", result1.getTags()[1]);
		assertEquals(1234, result1.getOwner().getReputation());
		// ...etc.
	}

	@Test
	public void jacksonParserTest() throws IOException {
		JsonParser parser = new JacksonJsonParser();
		try (FileInputStream in = new FileInputStream("JSON Example.js")) {
			List<ResultData> results = parser.parseJson(in);
			checkTestParse(results);
		}
	}	
	
}