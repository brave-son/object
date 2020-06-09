package Email;

import org.json.JSONArray;
import org.json.JSONObject;

public class exam1212 {
	public static void main(String[] args) {
		
		NetworkUtil nu = new NetworkUtil();
		String url ="http://ggoreb.com/python/json/data3.jsp";
		String result = nu.get(url);
		JSONArray json = new JSONArray(result);
		
		for (int i = 0; i < json.length(); i++) {
			JSONObject obj = json.getJSONObject(i);
			JSONArray address = obj.getJSONArray("address");
			String add = address.getString(0);
			System.out.println(add);
			
			
		}
		
	}

}
