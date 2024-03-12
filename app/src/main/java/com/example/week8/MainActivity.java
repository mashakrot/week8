package com.example.week8;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private EditText no1, no2;
    private TextView answer;
    private Button add, sub, mul, div;
    private double result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1 = findViewById(R.id.editFirstNumber);
        no2 = findViewById(R.id.editSecondNumber);

        add = findViewById(R.id.plusButton);
        sub = findViewById(R.id.minusButton);
        mul = findViewById(R.id.multiplyButton);
        div = findViewById(R.id.divideButton);

        answer = findViewById(R.id.textSeeResult);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(no1.getText().toString());
                double b = Double.parseDouble(no2.getText().toString());
                result = a + b;
                String outputText = String.valueOf(result);
                answer.setText(outputText);
                result = 0;
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(no1.getText().toString());
                double b = Double.parseDouble(no2.getText().toString());
                result = a - b;
                String outputText = String.valueOf(result);
                answer.setText(outputText);
                result = 0;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(no1.getText().toString());
                double b = Double.parseDouble(no2.getText().toString());
                result = a*b;
                String outputText = String.valueOf(result);
                answer.setText(outputText);
                result = 0;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(no1.getText().toString());
                double b = Double.parseDouble(no2.getText().toString());
                result = a/b;
                String outputText = String.valueOf(result);
                answer.setText(outputText);
                result = 0;
            }
        });
    }
}