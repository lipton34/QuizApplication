package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static android.widget.Toast.LENGTH_LONG;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
    }

    @Override
    protected void onStart() {
        super.onStart();
        final Button btn2 = findViewById(R.id.button2);
        final Button btn3 = findViewById(R.id.button3);
        final Button btn4 = findViewById(R.id.button4);
        final Button btn5 = findViewById(R.id.button5);
        String[] btnName = {"鰹", "鮪", "鮭", "鮫"};

        List list = Arrays.asList(btnName.clone());
        Collections.shuffle(list);


        btn2.setText(list.get(0).toString());
        btn3.setText(list.get(1).toString());
        btn4.setText(list.get(2).toString());
        btn5.setText(list.get(3).toString());

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn2.getText().toString()=="鰹"){
                    Intent intent = new Intent(PlayActivity.this,ResultActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(PlayActivity.this,"不正解です",LENGTH_LONG).show();
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn3.getText().toString()=="鰹"){
                    Intent intent = new Intent(PlayActivity.this,ResultActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(PlayActivity.this,"不正解です",LENGTH_LONG).show();
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn4.getText().toString()=="鰹"){
                    Intent intent = new Intent(PlayActivity.this,ResultActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(PlayActivity.this,"不正解です",LENGTH_LONG).show();
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn5.getText().toString()=="鰹"){
                    Intent intent = new Intent(PlayActivity.this,ResultActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(PlayActivity.this,"不正解です",LENGTH_LONG).show();
                }
            }
        });
    }
}
