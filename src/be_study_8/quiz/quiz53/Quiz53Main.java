package be_study_8.quiz.quiz53;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class Quiz53Main {

	public static void main(String[] args) {

		ApiExplorer api = new ApiExplorer();

		try {
			String jsonString = api.requestApi();
			JSONParser parser = new JSONParser();
			JSONObject obj = (JSONObject) parser.parse(jsonString);
			
			ResponseDTO responseDTO = new ResponseDTO();
			
			JSONObject response = (JSONObject)obj.get("response");
			
			JSONObject r_body = (JSONObject)response.get("body");
			Body body = new Body();
			body.setTotalCount(objectToInt(r_body.get("totalCount")));
			
			JSONArray r_items = (JSONArray)r_body.get("items");
			List<Item> items = new ArrayList<Item>();
			Item item = new Item();
			
			JSONObject item0 = (JSONObject)r_items.get(0);
			item.setFrcstFourDt(objectToString(item0.get("frcstFourDt")));
			item.setFrcstThreeDt(objectToString(item0.get("frcstThreeDt")));
			item.setFrcstTwoCn(objectToString(item0.get("frcstTwoCn")));
			item.setGwthcnd(objectToString(item0.get("gwthcnd")));
			item.setFrcstTwoDt(objectToString(item0.get("frcstTwoDt")));
			item.setFrcstFourCn(objectToString(item0.get("frcstFourCn")));
			item.setFrcstThreeCn(objectToString(item0.get("frcstThreeCn")));
			item.setFrcstOneDt(objectToString(item0.get("frcstOneDt")));
			item.setFrcstOneCn(objectToString(item0.get("frcstOneCn")));
			item.setPresnatnDt(objectToString(item0.get("presnatnDt")));
			
			items.add(item);
			
			body.setItems(items);
			
			body.setPageNo((objectToInt(r_body.get("pageNo"))));
			body.setNumOfRows((objectToInt(r_body.get("numOfRows"))));
			
			responseDTO.setBody(body);
			
			

			JSONObject r_header = (JSONObject)response.get("header");
			Header header = new Header();
			header.setResultMsg(objectToString(r_header.get("presnatnDt")));
			header.setResultCode(objectToInt(r_header.get("resultCode")));
			
			responseDTO.setHeader(header);
			
			System.out.println(responseDTO.toString());
			
			ResponseDAO responseDAO = new ResponseDAO();
			
			responseDAO.saveResponse(responseDTO);
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	
	
	
	public static int objectToInt(Object obj) {
		return Integer.parseInt(obj.toString());
	}

	public static String objectToString(Object obj) {
		if (obj == null)
			return null; // return "";
		else
			return obj.toString();
	}

}
