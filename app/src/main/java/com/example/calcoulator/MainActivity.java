package com.example.calcoulator;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.media.MediaPlayer.create;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button[] buttons = new Button[17];
    int[] buttonIds = {R.id.b1, R.id.b2, R.id.b3, R.id.add, R.id.b4, R.id.b5,
            R.id.b6, R.id.min, R.id.b7, R.id.b8, R.id.b9, R.id.mul, R.id.dut,
            R.id.b0, R.id.equal, R.id.div, R.id.cl};
    TextView resultTextView;
    double value;
    char op = 'c';
    boolean opJustClicked = false, equalJustClicked = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTextView = findViewById(R.id.view);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = findViewById(buttonIds[i]);
            buttons[i].setOnClickListener(this);
        }
    }



    @Override
    public void onClick(View v) {


        Button b = (Button) v;
        Toast.makeText(this, "Clicked " + b.getText().toString(), Toast.LENGTH_SHORT).show();
        switch (b.getText().toString()) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case ".":
                if (equalJustClicked || opJustClicked || resultTextView.getText().toString().equals("0")) {
                    resultTextView.setText(b.getText().toString());
                    opJustClicked = false;
                    equalJustClicked = false;
                } else {
                    resultTextView.append(b.getText().toString());
                }
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                if (opJustClicked) {
                    op = b.getText().toString().charAt(0);
                    return;
                }
                opJustClicked = true;
                if (op != 'c') {
                    value = operation(Double.parseDouble(resultTextView.getText().toString()));
                    resultTextView.setText("" + value);
                } else {
                    value = Double.parseDouble(resultTextView.getText().toString());
                }
                op = b.getText().toString().charAt(0);
                break;
            case "=":
                equalJustClicked = true;
                value = operation(Double.parseDouble(resultTextView.getText().toString()));

                resultTextView.setText("" + value);
                value = 0;
                op = 'c';
                break;
            case "C":
                resultTextView.setText("0");
                value = 0;
                op = 'c';
                break;

        }
    }

    public double operation(double newValue) {

        switch (op) {
            case '+':
                return value + newValue;
            case '-':
                return value - newValue;
            case '*':
                return value * newValue;
            case '/':
                return (newValue == 0) ? 0 : value / newValue;
        }
        return 0;
    }
}



