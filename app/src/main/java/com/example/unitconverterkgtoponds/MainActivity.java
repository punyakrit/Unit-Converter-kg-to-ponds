package com.example.unitconverterkgtoponds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Widgets
        EditText kg = findViewById(R.id.input);
        Button b1 = findViewById(R.id.button);
        TextView textview= findViewById(R.id.output);




        //convert kg to pounds

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kilograms = kg.getText().toString();

                float kilo = Float.parseFloat(kilograms);

                float pounds = (float) (kilo * 2.20462);

                textview.setText(""+pounds);

                Toast.makeText(MainActivity.this, "Weight in pounds is : "+pounds, Toast.LENGTH_SHORT).show();
            }
        });

    }
}