package nl.xannic.league.leaguedairy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ChooseQueueType extends ActionBarActivity {
	//moet worden meegegeven in hoger scherm
	String REGION = "euw";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//maby methode voor maken? met meer knoppen word het wat rommelig
		Button bt3v3 = (Button) findViewById(R.id.bt3s);
		bt3v3.setOnClickListener(button1);
		Button bt5v5 = (Button) findViewById(R.id.bt5s);
		bt5v5.setOnClickListener(button2);
	}
	
	//lelijke 3v3 knop
	//knoppen moeten info gaan doorgeven welke url er word gepakt dan hoef je geen 20 shermen te makn
	View.OnClickListener button1 = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			Intent intent = new Intent(ChooseQueueType.this, Display3v3List.class);
			intent.putExtra("APIKEY", "api_key=a7b9cf77-b3fd-447e-bd8d-9b3fbdf1bc78");
			intent.putExtra("TERMS", "lol/"+ REGION +"/v2.5/league/challenger?type=RANKED_TEAM_3x3");
			startActivity(intent);
		}
	};
	
	View.OnClickListener button2 = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			Intent intent = new Intent(ChooseQueueType.this, Display3v3List.class);
			intent.putExtra("APIKEY", "api_key=a7b9cf77-b3fd-447e-bd8d-9b3fbdf1bc78");
			intent.putExtra("TERMS", "lol/"+ REGION +"/v2.5/league/challenger?type=RANKED_TEAM_5x5");
			startActivity(intent);
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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

