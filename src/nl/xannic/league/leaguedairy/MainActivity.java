package nl.xannic.league.leaguedairy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.regionscreen);
		setUpScreen();
	}
	
	//setup buttons en onclicks
	//onclicks kunnen ook in een switch case
	private void setUpScreen() {
		//Button bt3v3 = (Button) findViewById(R.id.bt3s);
		//bt3v3.setOnClickListener(button1);
		Button btBR = (Button) findViewById(R.id.btBR);
		Button btEUNE = (Button) findViewById(R.id.btEUNE);
		Button btEUW = (Button) findViewById(R.id.btEUW);
		Button btKR = (Button) findViewById(R.id.btKR);
		Button btLAN = (Button) findViewById(R.id.btLAN);
		Button btLAS = (Button) findViewById(R.id.btLAS);
		Button btNA = (Button) findViewById(R.id.btNA);
		Button btOCE = (Button) findViewById(R.id.btOCE);
		Button btRU = (Button) findViewById(R.id.btRU);
		Button btTR = (Button) findViewById(R.id.btTR);

		btBR.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,ChooseQueueType.class);
				intent.putExtra("REGION", "br");
				startActivity(intent);
			}});
		btEUNE.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,ChooseQueueType.class);
				intent.putExtra("REGION", "eune");
				startActivity(intent);
			}});
		btEUW.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,ChooseQueueType.class);
				intent.putExtra("REGION", "euw");
				startActivity(intent);
			}});
		btKR.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,ChooseQueueType.class);
				intent.putExtra("REGION", "kr");
				startActivity(intent);
			}});
		btLAN.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,ChooseQueueType.class);
				intent.putExtra("REGION", "lan");
				startActivity(intent);
			}});
		btLAS.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,ChooseQueueType.class);
				intent.putExtra("REGION", "las");
				startActivity(intent);
			}});
		btNA.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,ChooseQueueType.class);
				intent.putExtra("REGION", "na");
				startActivity(intent);
			}});
		btOCE.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,ChooseQueueType.class);
				intent.putExtra("REGION", "oce");
				startActivity(intent);
			}});
		btRU.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,ChooseQueueType.class);
				intent.putExtra("REGION", "ru");
				startActivity(intent);
			}});
		btTR.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,ChooseQueueType.class);
				intent.putExtra("REGION", "tr");
				startActivity(intent);
			}});
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