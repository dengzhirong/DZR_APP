package com.dzrapp.myapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.io.PrintWriter;


public class LoginInTest extends ActionBarActivity {
    TextView connectionInfo;
    String username;
    String psw;
    EditText dzr_loginInTest_username_input;
    EditText dzr_loginInTest_psw_input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_in_test);

        dzr_loginInTest_username_input = (EditText) findViewById(R.id.dzr_loginInTest_username_input);
        dzr_loginInTest_psw_input = (EditText) findViewById(R.id.dzr_loginInTest_psw_input);
        Button dzr_loginInTest_login_btn = (Button) findViewById(R.id.dzr_loginInTest_login_btn);
        connectionInfo = (TextView) findViewById(R.id.connectionInfo);


        dzr_loginInTest_login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = dzr_loginInTest_username_input.getText().toString();
                psw = dzr_loginInTest_psw_input.getText().toString();
                if(username=="test" && psw=="test") {
                    connectionInfo.setText(username + " ; " + psw + "successful");
                }

            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login_in_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
