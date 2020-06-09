package Email;

import org.json.JSONArray;
import org.json.JSONObject;

public class Http6 {
	public static void main(String[] args) {
		NetworkUtil nu = new NetworkUtil();
		String url1 = "http://api.visitkorea.or.kr";
		String url2 = "/openapi/service/rest/KorService/searchFestival";
		String param = "?serviceKey=A2usf4txsthrBPXx7%2FckSjISrlOOF3DR";
		param += "CXlpwxFKcl1KPyvOOWSD%2FUhcapvCkM51AdZOieoo";
		param += "IvkMdz2XQCt33w%3D%3D";
		param += "&MobileOS=ETC";
		param += "&MobileApp=AppTest";
		param += "&eventStartDate=20191101";
		param += "&_type=json";
		String result = nu.get(url1 + url2 + param);
		
		JSONObject json = new JSONObject(result);
		JSONObject response = json.getJSONObject("response");
		JSONObject body = response.getJSONObject("body");
		JSONObject items = body.getJSONObject("items");
		JSONArray item = items.getJSONArray("item");

		for (int i = 0; i < item.length(); i++) {

			JSONObject it = item.getJSONObject(i);
			String addr1 = it.getString("addr1");
			String title = it.getString("title");
			int eventstartdate = it.getInt("eventstartdate");
			System.out.printf(" %s, %s, %d", addr1, title, eventstartdate);

		}

	}
}
