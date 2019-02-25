package com.example.latihanpam1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String TAG =MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        Bundle bundle = new Bundle();
        Student student1 = new Student(1316018,"Jason Sorongan","Du100",3.6);
        intent.putExtra("student1",student1);

        /*bundle.putInt("NIM",1316018);
        bundle.putBoolean("isFemale",true);
        bundle.putString("name","Jason MyMan");
        intent.putExtras(bundle);*/
        Log.d(TAG,"Flag1 Reached");
        startActivity(intent);
    }

}
