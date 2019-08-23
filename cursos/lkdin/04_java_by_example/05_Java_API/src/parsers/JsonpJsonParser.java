package parsers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonNumber;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

import data.OwnerData;
import data.ResultData;

public class JsonpJsonParser implements JsonParser {
	public static void main(String[] args) {
		JsonParser parser = new JsonpJsonParser();
		try (FileInputStream in = new FileInputStream("JSON Example.js")) {
			List<ResultData> results = parser.parseJson(in);
			for (ResultData result : results) {
				System.out.println(result.getTitle());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/* (non-Javadoc)
	 * @see webjson.IStackJsonParser#parseJson(java.io.InputStream)
	 */
	@Override
	public List<ResultData> parseJson(InputStream in) {
		JsonReader reader = Json.createReader(in);
		JsonObject json = reader.readObject();
		reader.close();
	
		// parse the json object, return something
		List<ResultData> results = new ArrayList<ResultData>();
		JsonArray items = json.getJsonArray("items");
		for (JsonValue item : items) {
			if (item instanceof JsonObject) {
				ResultData result = createBean((JsonObject)item);
				results.add(result);
			}
		}
		
		return results;
	}
	
	public ResultData createBean(JsonObject json) {
		ResultData bean = new ResultData();
		
		// you could also change tags to a List
		JsonArray array = json.getJsonArray("tags");
		String[] tags = new String[array.size()];
		for (int i = 0; i < tags.length; i++) {
			tags[i] = array.getString(i);
		}
		bean.setTags(tags);
		
		bean.setIs_answered( json.getBoolean("is_answered", false) );
		bean.setView_count( json.getInt("view_count", 0) );
		bean.setAccepted_answer_id( json.getInt("accepted_answer_id", 0) );
		bean.setAnswer_count( json.getInt("answer_count", 0) );
		bean.setScore( json.getInt("score", 0) );
		
		// you could also convert these long values to dates
		bean.setLast_activity_date( getLong(json, "last_activity_date", 0) );
		bean.setCreation_date( getLong(json, "creation_date", 0) );
		bean.setLast_edit_date( getLong(json, "last_edit_date", 0) );
		
		bean.setQuestion_id( json.getJsonNumber("question_id").longValue() );
		bean.setLink( json.getString("link", null) );
		bean.setTitle( json.getString("title", null) );
		
		OwnerData owner = new OwnerData();
		JsonObject ownerJson = json.getJsonObject("owner");
		owner.setReputation( ownerJson.getInt("reputation", 0) );
		owner.setUser_id( ownerJson.getInt("user_id", 0) );
		owner.setUser_type( ownerJson.getString("user_type", null) );
		owner.setAccept_rate( ownerJson.getInt("accept_rate", 0) );
		owner.setProfile_image( ownerJson.getString("profile_image", null) );
		owner.setDisplay_name( ownerJson.getString("display_name", null) );
		owner.setLink( ownerJson.getString("link", null) );
		
		bean.setOwner(owner);
		
		return bean;
	}

	private long getLong(JsonObject json, String key, long defaultValue) {
		JsonNumber num = json.getJsonNumber(key);
		return (num == null) ? defaultValue : num.longValue();
	}
}
