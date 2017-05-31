package com.coldfire.backyard.jahangardi;

import android.support.v7.app.AppCompatActivity;

import java.util.Random;

class Question extends AppCompatActivity {
    String question;
    boolean answer;
    String option0,option1;
}
class QuestionMaker {
    Question[] questions = new Question[2];
    QuestionMaker(){
        for (int i=0; i<2; i++){
            questions[i]=new Question();

        }
        questions[0].question="ایران چند استان دارد؟";
        questions[0].answer=true;
        questions[0].option0="پاسخ 1";
        questions[0].option1="پاسخ 2";

        questions[1].question="سوغات اصلی این استان کدام است؟";
        questions[1].answer=false;
        questions[1].option0="گزینه اول";
        questions[1].option1="گزینه دوم";


        shuffleArray(questions);

    }

    static void shuffleArray(Question[] ar)
    {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            Question a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
