package com.example.anuvaadak;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class language extends AppCompatActivity {
    ImageButton imageButtonAlpha;
    ImageButton imageButtonNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language_page);
        imageButtonAlpha=(ImageButton) findViewById(R.id.ImageButtonAlpha);
        imageButtonNumber=(ImageButton) findViewById(R.id.ImageButtonNumber);
        imageButtonAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity= new Intent(language.this,alphabets.class);
                startActivity(intentLoadNewActivity);
            }
        });
        imageButtonNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity= new Intent(language.this,number.class);
                startActivity(intentLoadNewActivity);
            }
        });


    }
}