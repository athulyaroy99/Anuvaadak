package com.example.anuvaadak;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class imagepage extends AppCompatActivity {
    private EditText Email;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_page);
        Email=(EditText)findViewById(R.id.etEmail);
        Password=(EditText)findViewById(R.id.etPass);
        Info=(TextView)findViewById(R.id.inTv);
        Login=(Button)findViewById(R.id.button);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Email.getText().toString(),Password.getText().toString());
            }
        });

    }
    private void validate(String userEmail,String userPassword){
        if((userEmail.equals("Admin"))&&(userPassword.equals("1234"))){
            Intent intent=new Intent(imagepage.this,gridpage.class);
            startActivity(intent);
        }
        else {
            counter--;

            Info.setText("No. of attempts remaining: "+String.valueOf(counter));
            if(counter==0){
                Login.setEnabled(false);
            }
        }
    }
}

