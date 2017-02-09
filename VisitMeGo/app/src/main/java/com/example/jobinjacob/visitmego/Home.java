package com.example.jobinjacob.visitmego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button tapButton, signInButton, oldUserButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Declaring Buttons
        tapButton =(Button)findViewById(R.id.tapButton);
        signInButton =(Button)findViewById(R.id.signInButton);
        oldUserButton =(Button)findViewById(R.id.oldUserButton);

        //This is tap to sign in button
        tapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this, Details.class);
                startActivity(i);
            }
        });
        //This is the sign in button for the company
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //This is for the user who is previously registered in the system
        oldUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}
