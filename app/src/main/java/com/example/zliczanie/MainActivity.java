package com.example.zliczanie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button przycisk;
    EditText tekst;
    TextView pokaz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        przycisk=findViewById(R.id.Przycisk);
        tekst=findViewById(R.id.input_text);
        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count=tekst.length();
                String litery="abcdefghijklmnoprstuvwyz";
                String znakispecjalne="!@#$%^&*";
                pokaz.findViewById(R.id.count);
                pokaz.setText("liczba znaków wynosi"+count);

            }
        });
    }
}