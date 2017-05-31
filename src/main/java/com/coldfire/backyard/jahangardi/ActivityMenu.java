package com.coldfire.backyard.jahangardi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnStart=(Button) findViewById(R.id.btnStart);
        Button btnAbout=(Button) findViewById(R.id.btnAbout);
        Button btnExit=(Button) findViewById(R.id.btnExit);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ActivityMenu.this,ActivityGame.class);
                ActivityMenu.this.startActivity(intent);

            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ActivityMenu.this,ActivityAbout.class);
                ActivityMenu.this.startActivity(intent);

            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    while(true){
                        finish();
                        System.exit(0);
                    }


                }
                catch (Exception e){
                    Log.i("FinishCLICKER","DONE");
                }


            }
        });

    }
}
