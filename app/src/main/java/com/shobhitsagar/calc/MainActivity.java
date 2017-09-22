package com.shobhitsagar.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView totaltext;
    EditText percentagetext;
    EditText numbertext;
    Button calculate;
    TextView msgtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totaltext = (TextView) findViewById(R.id.totaltext);
        percentagetext = (EditText) findViewById(R.id.percentagetext);
        numbertext = (EditText) findViewById(R.id.numbertext);
        calculate = (Button) findViewById(R.id.calculate);
        msgtxt = (TextView) findViewById(R.id.msgtxt);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Float p = Float.parseFloat(percentagetext.getText().toString());

                Float n = Float.parseFloat(numbertext.getText().toString());
                float t = (p/100)*n;
                totaltext.setText(String.valueOf(t));
            }
        });
    }
}
