package mainactivity.katherineosorio.com.sanrafael;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        /*int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.aboutUs) {
            Intent i = new Intent(this, AboutActivity.class);
            startActivity(i);
            return true;
        }*/

        switch(item.getItemId()){
            case R.id.aboutUs:
                Intent i = new Intent(this,AcercaActivity.class);
                startActivity(i);
                return true;
            case R.id.hoteles:
                Intent j = new Intent(this,HotelActivity.class);
                startActivity(j);
                return true;
            case R.id.bares:
                Intent k = new Intent(this,BarActivity.class);
                startActivity(k);
                return true;
            case R.id.turisticos:
                Intent t = new Intent(this,TurismoActivity.class);
                startActivity(t);
                return true;
            case R.id.demografia:
                Intent l = new Intent(this,DemografiaActivity.class);
                startActivity(l);
                return true;
            /*case R.id.settings:
                Intent s = new Intent(this,SettingsActivity.class);
                s.putExtra("pQuiz",15);
                s.putExtra("pExp",10);
                s.putExtra("pPra",40);
                s.putExtra("pPro",35);
                startActivityForResult(s, 1234);
                return true;*/

        }


        return super.onOptionsItemSelected(item);
    }

}
