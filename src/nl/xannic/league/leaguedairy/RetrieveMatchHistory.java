package nl.xannic.league.leaguedairy;

import java.util.ArrayList;
import java.util.List;

import jsonRequests.HttpURLConnectionLeague;
import data.LeagueEntryDto;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RetrieveMatchHistory extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.simplerow);
		
		//setup listview
				final ListView mainListView = (ListView) findViewById(R.id.mainListView);
				HttpURLConnectionLeague http = new HttpURLConnectionLeague();
				getUrlData();
				List<LeagueEntryDto> list = null;//http.getMatchHistory ofzo
				ArrayList<String> l = new ArrayList<String>();
				
				for(int i = 0;i<list.size();i++){
					l.add(list.get(i).getPlayerOrTeamName());
					//voor debugg
					//Log.e("list number : " + i + " , ",  Integer.toString(list.get(i).getLeaguePoints()));
				}
				//voor debugg en sorting l normaal moet hier list staan en de arrayadapter heeft een type LeagueEntryDto
				ArrayAdapter<LeagueEntryDto> listAdapter = new ArrayAdapter<LeagueEntryDto>(this,
						R.layout.simplerow, list);
				mainListView.setAdapter(listAdapter);
	}

	private void getUrlData() {
		// TODO Auto-generated method stub
		
	}
}
