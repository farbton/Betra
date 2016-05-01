package com.example.kirko.helloworld;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int counter = 0;


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
        TextView zollview = (TextView) findViewById(R.id.zoll);
        zollview.setText("28");
        zollview.setGravity(Gravity.CENTER_HORIZONTAL);

        TextView distanceview = (TextView) findViewById(R.id.distance);
        distanceview.setText("2,3");
        distanceview.setGravity(Gravity.CENTER_HORIZONTAL);

        TextView resolutionview = (TextView) findViewById(R.id.resolution);
        resolutionview.setText("1080x1920");
        resolutionview.setGravity(Gravity.CENTER_HORIZONTAL);


    }
}
