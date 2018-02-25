package com.gatech.fourhorse.cs2340_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private EditText username;
    private EditText passwd;
    private Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        passwd = (EditText)findViewById(R.id.passwdText);
        username = (EditText)findViewById(R.id.usernameText);

        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.types_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);


        configureCancelButton();
        configureRegisterButton();
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
    private void configureRegisterButton(){
        Button registerButton = (Button) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Things We Need To Do:
                //Make sure there is a username and passwd
                if(!username.getText().toString().isEmpty()
                        && !passwd.getText().toString().isEmpty()) {
                    //Now we need to send this off to make sure username isn't taken
                    boolean b = CommonPresenter.createUser(username.getText().toString(),
                            passwd.getText().toString(), spinner.getSelectedItem().toString()); //is this how you're supposed to do it? No but i'm busy
                    if(b) {
                        Toast.makeText(getApplicationContext(), "Registered",
                                Toast.LENGTH_SHORT).show();
                        finish(); //Go back to start screen
                    } else {
                        Toast.makeText(getApplicationContext(), "Username taken",
                                Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Please make a username and password",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
