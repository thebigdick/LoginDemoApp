package com.example.hlywwf.myapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hlywwf.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.login);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=((EditText)findViewById(R.id.user)).getText().toString();
                String pwd=((EditText)findViewById(R.id.pwd)).getText().toString();
                if (username.equals("17023132") || pwd.equals("password17023132")) {
                    Intent i = new Intent(MainActivity.this, ResultActivity.class);
                    startActivity(i);
                }else{
                    Toast.makeText(MainActivity.this,"抱歉，无法登陆", Toast.LENGTH_LONG).show();

                }
            }


        });
    }
}
