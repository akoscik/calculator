package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView firstVar;
    TextView secondVar;

    int firstVarInt;
    int secondVarInt;

    String firstVarString;
    String secondVarString;

    int result;

    public void onAdd(View view){
        firstVar = (EditText) findViewById(R.id.firstVar);
        secondVar = (EditText) findViewById(R.id.secondVar);

        firstVarString = firstVar.getText().toString();
        secondVarString = secondVar.getText().toString();

        firstVarInt = Integer.parseInt(firstVarString);
        secondVarInt = Integer.parseInt(secondVarString);

        Log.d("info", "addition pressed");

        result = firstVarInt + secondVarInt;

        goToResultPage(result);
    }

    public void onSubtract(View view){
        firstVar = (EditText) findViewById(R.id.firstVar);
        secondVar = (EditText) findViewById(R.id.secondVar);

        firstVarString = firstVar.getText().toString();
        secondVarString = secondVar.getText().toString();

        firstVarInt = Integer.parseInt(firstVarString);
        secondVarInt = Integer.parseInt(secondVarString);

        result = firstVarInt - secondVarInt;

        goToResultPage(result);
    }

    public void onMultiply(View view){
        firstVar = (EditText) findViewById(R.id.firstVar);
        secondVar = (EditText) findViewById(R.id.secondVar);

        firstVarString = firstVar.getText().toString();
        secondVarString = secondVar.getText().toString();

        firstVarInt = Integer.parseInt(firstVarString);
        secondVarInt = Integer.parseInt(secondVarString);

        result = firstVarInt * secondVarInt;

        goToResultPage(result);
    }

    public void onDivide(View view){
        firstVar = (EditText) findViewById(R.id.firstVar);
        secondVar = (EditText) findViewById(R.id.secondVar);

        firstVarString = firstVar.getText().toString();
        secondVarString = secondVar.getText().toString();

        firstVarInt = Integer.parseInt(firstVarString);
        secondVarInt = Integer.parseInt(secondVarString);

        result = firstVarInt / secondVarInt;

        goToResultPage(result);
    }

    public void goToResultPage(int r){
        Intent intent = new Intent(this, ResultPage.class);
        intent.putExtra("result", r);
        startActivity(intent);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}