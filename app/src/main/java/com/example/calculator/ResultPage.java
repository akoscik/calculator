package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultPage extends AppCompatActivity {

    int resultToPrint;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);

        resultText = (TextView) findViewById(R.id.resultText);
        Intent intent = getIntent();
        resultToPrint = intent.getIntExtra("result", resultToPrint);
        resultText.setText(Integer.toString(resultToPrint));

    }
}