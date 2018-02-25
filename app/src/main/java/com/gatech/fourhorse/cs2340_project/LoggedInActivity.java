package com.gatech.fourhorse.cs2340_project;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoggedInActivity extends AppCompatActivity {


    //TODO change the presenter's user to null or something on logout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);
        System.out.println(LoggedInPresenter._user.getPasswd());
        TextView tv1 = (TextView)findViewById(R.id.show_user);
        tv1.setText(LoggedInPresenter._user.getUsername()); //change this to current user username
        TextView tv2 = (TextView)findViewById(R.id.show_type);
        tv2.setText(LoggedInPresenter._user.getType().toString()); //change textview to current type

        configureLogoutButton();
    }

    private void configureLogoutButton(){
        Button logoutButton = (Button) findViewById(R.id.logoutButton);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

