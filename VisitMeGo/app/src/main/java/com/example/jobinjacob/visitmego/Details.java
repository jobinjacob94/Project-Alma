package com.example.jobinjacob.visitmego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Details extends AppCompatActivity {

    Button continueButton;
    EditText name, email,company;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //Declaring components
        name =(EditText)findViewById(R.id.nameText);
        email =(EditText)findViewById(R.id.emailText);
        company =(EditText)findViewById(R.id.companyText);
        continueButton =(Button)findViewById(R.id.continueButton);


        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Details.this, Home.class);
                startActivity(i);
            }
        });




    }
}
