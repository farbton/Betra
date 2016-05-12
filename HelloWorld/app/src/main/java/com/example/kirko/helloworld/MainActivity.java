package com.example.kirko.helloworld;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int counter = 0;
    private static final String TAG = "MyActivity";
    //DecimalFormat
    DecimalFormat df = new DecimalFormat("#0.000");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        textView = findViewById(R.id.editText);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void rechne(View view) {
       TextView tview = (TextView) findViewById(R.id.editText);
       counter = counter +1;
        tview.setText(String.valueOf(counter));
    }
    public void rechneRunter(View view) {
        TextView tview = (TextView) findViewById(R.id.editText);
        counter = counter -1;
        tview.setText(String.valueOf(counter));
    }
    public void calculate(View view){

        double alpha = 0.0167;//in Grad=1 winkelminute

        TextView zollview = (TextView) findViewById(R.id.zoll);
        //zollview.setText("72");
        zollview.setGravity(Gravity.CENTER_HORIZONTAL);

        TextView distanceview = (TextView) findViewById(R.id.distance);
       // distanceview.setText("2,3");
        distanceview.setGravity(Gravity.CENTER_HORIZONTAL);

        TextView resolutionview = (TextView) findViewById(R.id.resolution);
        resolutionview.setText("575");
        resolutionview.setGravity(Gravity.CENTER_HORIZONTAL);

        double relation = 4/3;
        double high     = Math.sqrt((Math.pow(Integer.valueOf(zollview.getText().toString()),2)  * 9 ) / 25);
        double width    = relation * high;

        double row_high = high / Integer.valueOf(resolutionview.getText().toString());

        double distance = row_high / (100 * Math.tan(Math.toRadians(alpha)));


        distanceview.setText(String.valueOf(df.format(distance)));
        System.out.print(high + width + row_high + distance);

        Log.i(TAG,String.valueOf(Math.tan(Math.toRadians(alpha))));
    }


}
