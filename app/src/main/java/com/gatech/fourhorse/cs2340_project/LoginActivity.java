package com.gatech.fourhorse.cs2340_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText passwd;

    //TODO actually set up proper MVP with interfaces
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        passwd = (EditText)findViewById(R.id.passwdText);
        username = (EditText)findViewById(R.id.usernameText);

        configureCancelButton();
        configureLoginButton();
    }
    private void configureCancelButton(){
        Button cancelButton = (Button) findViewById(R.id.cancelButton);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    private void configureLoginButton(){
        Button loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(LoggedInPresenter.login(username.getText().toString(), passwd.getText().toString())){
                    //more inefficiency!
                    startActivity(new Intent(LoginActivity.this, LoggedInActivity.class));
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong Username or Password",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
