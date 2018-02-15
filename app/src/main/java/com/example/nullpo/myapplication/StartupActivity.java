package com.example.nullpo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StartupActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statup);

        configureLoginButton();

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
}
