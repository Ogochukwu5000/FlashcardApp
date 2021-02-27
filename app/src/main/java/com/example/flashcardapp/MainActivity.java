package com.example.flashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView questionTextview=findViewById(R.id.question);
        TextView answerTextview=findViewById(R.id.answer);
        questionTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionTextview.setVisibility(View.INVISIBLE);
                answerTextview.setVisibility(View.VISIBLE);

            }
        });


    }
}
