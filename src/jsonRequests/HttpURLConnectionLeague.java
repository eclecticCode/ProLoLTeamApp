package jsonRequests;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;

import data.LeagueDto;
 
public class HttpURLConnectionLeague extends AsyncTask<String,Void,String>{
	//Deze word wel hier geset
	String URL = "https://euw.api.pvp.net/api/";
	
	Gson gson = new Gson();
	public LeagueDto getJson(String APIKEY, String TERMS){
		LeagueDto d = null;
		try {
			String output = null;
	        output = new HttpURLConnectionLeague().execute(URL + TERMS + "&"+ APIKEY).get();
			String json = output;
			d = gson.fromJson(json,LeagueDto.class);
		} catch (Exception e) {
			Log.e("exeption log", e.toString());
			e.printStackTrace();
		}
		return d;
	}
	
	//TODO Moet ik nog maken
	public void getTeamById(String APIKEY, String TERMS){
		
	}

	@Override
	protected String doInBackground(String... params) {
		String line = null;
		try{
			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpGet httpPost = new HttpGet(params[0]);
			HttpResponse httpResponse = httpClient.execute(httpPost);
			HttpEntity httpEntity = httpResponse.getEntity();
			line = EntityUtils.toString(httpEntity);
		}catch(Exception e){
			Log.e("http exception : ", e.toString());
		}
		return line;
	}
}

