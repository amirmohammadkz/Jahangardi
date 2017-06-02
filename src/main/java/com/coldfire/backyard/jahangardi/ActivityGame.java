package com.coldfire.backyard.jahangardi;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ActivityGame extends AppCompatActivity {
    QuestionMaker questionMaker = new QuestionMaker();
    int counter = 0;
    int[] sortCity=new int[62];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Button btnKerman = (Button) findViewById(R.id.btnKerman);
        Button btnZahedan = (Button) findViewById(R.id.btnZahedan);
        sortCity=randomCity();

        btnKerman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ask(questionMaker.questions[counter % 2]);
                counter++;


            }
        });

        btnZahedan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ask(questionMaker.questions[counter % 2]);
                counter++;


            }
        });


    }

    public void ask(final Question question) {
        Log.i("1", "1");

        final Dialog ask = new Dialog(ActivityGame.this);
        Log.i("1", "2");
        ask.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        Log.i("1", "3");
        ask.setContentView(R.layout.ask);
        ask.setCancelable(false);
        ask.setCanceledOnTouchOutside(false);

        Log.i("1", "4");
        TextView txtquestion = (TextView) ask.findViewById(R.id.txtquestion);
        Button btnoption0 = (Button) ask.findViewById(R.id.btnoption0);
        Button btnoption1 = (Button) ask.findViewById(R.id.btnoption1);
        txtquestion.setText(question.question);
        btnoption0.setText(question.option0);
        btnoption1.setText(question.option1);
        btnoption0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!question.answer) {
                    Toast.makeText(ActivityGame.this, "پاسخ درست", Toast.LENGTH_LONG).show();

                    ask.dismiss();
                } else {
                    Toast.makeText(ActivityGame.this, "پاسخ غلط", Toast.LENGTH_LONG).show();

                    ask.dismiss();


                }

            }
        });

        btnoption1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (question.answer) {
                    Toast.makeText(ActivityGame.this, "پاسخ درست", Toast.LENGTH_LONG).show();

                    ask.dismiss();
                } else {
                    Toast.makeText(ActivityGame.this, "پاسخ غلط", Toast.LENGTH_LONG).show();

                    ask.dismiss();
                }
            }
        });

        ask.show();
        Log.i("asktesting", "test done yeahhhhhh");

    }

    static int[] randomCity() {
        Random rnd = new Random();
        int[] source = new int[62];
        for (int i = 0; i < 62; i++) {
            source[i] = i / 2;
        }

        for (int i = source.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = source[index];
            source[index] = source[i];
            source[i] = a;
        }
        return source;

    }
}
