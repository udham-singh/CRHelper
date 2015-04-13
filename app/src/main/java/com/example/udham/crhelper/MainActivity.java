package com.example.udham.crhelper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;




public class MainActivity extends Activity {

    Button b1,b2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        b1 = (Button) findViewById(R.id.stu_button);

        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, StudentActivity.class);
                startActivity(intent);

            }
        });

        b2= (Button) findViewById(R.id.tch_button);

        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, teachersActivity.class);
                startActivity(intent);

            }
        });
    }

}
