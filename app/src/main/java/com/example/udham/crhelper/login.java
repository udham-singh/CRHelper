package com.example.udham.crhelper;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.parse.LogInCallback;
import com.parse.ParseUser;

import java.text.ParseException;


public class login extends ActionBarActivity {
    AutoCompleteTextView username=null;
    EditText password=null;
    Button login;
    Button Sign_up;
    public static String uname,pwd;
    TextView out;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

            out = (TextView) findViewById(R.id.textView);
            username = (AutoCompleteTextView) findViewById(R.id.email);
            password = (EditText) findViewById(R.id.password);


            login = (Button) findViewById(R.id.sign_in);
        Sign_up = (Button) findViewById(R.id.action_sign_up);
        Sign_up.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login.this, sign_up.class);
                startActivity(intent);

            }
        });


           login.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    uname=username.getText().toString();
                    pwd=password.getText().toString();

                    ParseUser.logInInBackground(uname,pwd,new LogInCallback() {
                        public void done(ParseUser user, com.parse.ParseException e) {
                            if (user != null) {

                               Intent intent=new Intent(login.this,StudentActivity.class);
                                startActivity(intent);
                } else {
                                out.setText(e.toString());
                            }
                        }

                    });





                }
            });

    }

}
