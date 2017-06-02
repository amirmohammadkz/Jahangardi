package com.coldfire.backyard.jahangardi;

import android.support.v7.app.AppCompatActivity;

import java.util.Random;

class Question extends AppCompatActivity {
    String question;
    boolean answer;
    String option0,option1;
    boolean asked=false;
}
class QuestionMaker {
    Question[][] questions = new Question[31][2];
    QuestionMaker(){
        for (int j=0;j<31;j++)
        for (int i=0; i<2; i++){
            questions[j][i]=new Question();

        }
        for (int i=0;i<31;i++) {
            questions[i][0].question = "ایران چند استان دارد؟"+Integer.toString(i);
            questions[i][0].answer = true;
            questions[i][0].option0 = "پاسخ 1";
            questions[i][0].option1 = "پاسخ 2";


            questions[i][1].question = "سوغات اصلی این استان کدام است؟"+Integer.toString(i);
            questions[i][1].answer = false;
            questions[i][1].option0 = "گزینه اول";
            questions[i][1].option1 = "گزینه دوم";

        }
        shuffleArray(questions);

    }

    static void shuffleArray(Question[][] ar)
    {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = new Random();
        for (int j=0;j<ar.length;j++) {
            for (int i = ar[j].length - 1; i > 0; i--) {
                int index = rnd.nextInt(i + 1);
                // Simple swap
                Question a = ar[j][index];
                ar[j][index] = ar[j][i];
                ar[j][i] = a;
            }
        }
    }
}
