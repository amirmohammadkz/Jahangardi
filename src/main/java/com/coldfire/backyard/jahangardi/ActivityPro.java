package com.coldfire.backyard.jahangardi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by User1 on 6/2/2017.
 */
public class ActivityPro extends AppCompatActivity {


    String name="x";
    String qNum="x";
    String sTime="x";
    String correctNum="x";
    String degree="x";
    String state="x";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        TextView t=(TextView) findViewById(R.id.name);
        t.setText(name);
        t=(TextView) findViewById(R.id.qNum);
        t.setText(qNum);
        t=(TextView) findViewById(R.id.sTime);
        t.setText(sTime);
        t=(TextView) findViewById(R.id.correctNum);
        t.setText(correctNum);
        t=(TextView) findViewById(R.id.degree);
        t.setText(degree);
        t=(TextView) findViewById(R.id.state);
        t.setText(state);


    }
/*
    @Override
    protected void onStart() {
        super.onStart();

        TextView t=(TextView) findViewById(R.id.name);
        t.setText(name);
        t=(TextView) findViewById(R.id.qNum);
        t.setText(qNum);
        t=(TextView) findViewById(R.id.sTime);
        t.setText(sTime);
        t=(TextView) findViewById(R.id.correctNum);
        t.setText(correctNum);
        t=(TextView) findViewById(R.id.degree);
        t.setText(degree);
        t=(TextView) findViewById(R.id.state);
        t.setText(state);



    }
*/

}
