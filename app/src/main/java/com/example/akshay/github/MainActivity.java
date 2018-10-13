package com.example.akshay.github;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void doSomeWork(){
        int i=22;
        int k=77;


        if(i<=100){
            i=50;
        }
    }
}
