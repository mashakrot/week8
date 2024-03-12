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

public class MainActivity extends AppCompatActivity {

    private EditText textInput;
    private TextView textOutput;
    private int fontSize;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInput = findViewById(R.id.editTextInput);
        textOutput = findViewById(R.id.textViewOutput);

        fontSize = 14;
    }

    public void transformText(View view) {
        Log.d("Transformer application", textInput.getText().toString());


        StringBuilder sb = new StringBuilder(textInput.getText().toString());
        sb.reverse();

        Toast.makeText(this, sb.toString(), Toast.LENGTH_LONG).show();

        textOutput.setText(sb.toString());
    }

    public void increaseTextSize(View view) {
        textOutput.setTextSize(++fontSize);
    }

    public void decreaseTextSize(View view) {
        textOutput.setTextSize(--fontSize);
    }
}