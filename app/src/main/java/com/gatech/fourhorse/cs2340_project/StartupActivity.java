package com.gatech.fourhorse.cs2340_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartupActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);

        configureLoginButton();
        configureRegisterButton();
    }
    private void  configureLoginButton(){
        Button loginButton = (Button) findViewById(R.id.button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(StartupActivity.this, LoginActivity.class));
            }
        }) ;
    }
    private void  configureRegisterButton(){
        Button registerButton = (Button) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                startActivity(new Intent(StartupActivity.this, RegisterActivity.class));
            }
        }) ;
    }
}
