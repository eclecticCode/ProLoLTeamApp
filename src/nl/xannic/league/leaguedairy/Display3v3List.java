package nl.xannic.league.leaguedairy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jsonRequests.HttpURLConnectionLeague;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import data.LeagueEntryDto;

public class Display3v3List extends ActionBarActivity {
	String APIKEY;// = "api_key=a7b9cf77-b3fd-447e-bd8d-9b3fbdf1bc78";
	String TERMS;// = "lol/"+ REGION +"/v2.5/league/challenger?type=RANKED_TEAM_3x3";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_3v3);
		
		//setup listview
		final ListView mainListView = (ListView) findViewById(R.id.mainListView);
		HttpURLConnectionLeague http = new HttpURLConnectionLeague();
		getUrlData();
		List<LeagueEntryDto> list = http.getJson(APIKEY, TERMS).getEntries();
		ArrayList<String> l = new ArrayList<String>();
		
		list = sortOnLp(list);
		//voor debugg en sorting l normaal moet hier list staan en de arrayadapter heeft een type LeagueEntryDto
		ArrayAdapter<LeagueEntryDto> listAdapter = new ArrayAdapter<LeagueEntryDto>(this,
				R.layout.simplerow, list);
		mainListView.setAdapter(listAdapter);
		mainListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// ListView Clicked item index
                int itemPosition     = position;
                
                //Onclick request this --> https://euw.api.pvp.net/api/lol/euw/v2.4/team/TEAM-851cd9e0-0e5f-11e4-ad10-c81f66db920c?APIKEY
                //Lijst met games
                //Pak gameId example --> 1674111851
                //onclick request this --> https://euw.api.pvp.net/api/lol/euw/v2.2/match/1674111851?APIKEY
                // ListView Clicked item value
                String  itemValue    = (String) parent.getItemAtPosition(position);
                
                LeagueEntryDto lol = (LeagueEntryDto) mainListView.getItemAtPosition(position);
                
                //intent naar volgende scherm...geeft TeamId mee
//				Intent intent = new Intent(Display3v3List.this,RetrieveMatchHistory.class);
//				String lolId = lol.getPlayerOrTeamId();
//				intent.putExtra("id", lolId);
//				startActivity(intent);
			}
		});
	}

	private void getUrlData() {
		// TODO Auto-generated method stub
		Bundle extras = getIntent().getExtras();
		if(extras == null){
			Log.e("Nullpointer : ", "de basket is LEEGG!!!!");
		}
		APIKEY = extras.getString("APIKEY");
		TERMS = extras.getString("TERMS");
	}

	private List<LeagueEntryDto> sortOnLp(List<LeagueEntryDto> list) {
		ArrayList<LeagueEntryDto> l = new ArrayList<LeagueEntryDto>();
		int i = 0;
		int a = list.get(0).getLeaguePoints();
		int b;
		int positie = 0;
		while(!(list.size()==0)){
			b = list.get(i).getLeaguePoints();
			if(a<=b){
				positie = i;
				a = b;
			}
			i++;
			if(i==list.size()){
				l.add(list.get(positie));
				list.remove(positie);
				i = 0;
				a = 0;
			}
		}
		return l;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display3v3_list, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
