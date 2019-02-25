package com.example.latihanpam1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView displayOne;
    TextView displayTwo;
    TextView displayThree;
    TextView displayFour;
    String TAG="com.example.latihanpam1";
    int nim;
    String nama,alamat;
    double ipk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG,"Flag 1 reached");
        Intent intent = getIntent();
        Log.d(TAG,"Flag2 reached");
        Student student2 = intent.getParcelableExtra("student1");

        displayOne=findViewById(R.id.nama2);
        displayTwo=findViewById(R.id.nim2);
        displayThree=findViewById(R.id.alamat2);
        displayFour=findViewById(R.id.ipk2);

        nim=student2.getNim();
        nama=student2.getNama();
        alamat=student2.getAlamat();
        ipk=student2.getIpk();

        displayOne.setText(nama+" first intent");
        displayTwo.setText(Integer.toString(nim)+" first intent");
        displayThree.setText(alamat+" first intent");
        displayFour.setText(Double.toString(ipk)+" first intent");



  /*      Bundle bundle = intent.getExtras();
        int nim= bundle.getInt("NIM");
        Boolean boon=bundle.getBoolean("isFemale",false);
        String nama= bundle.getString("name");
        int nim2=intent.getIntExtra("key1",0);
        String nama2=intent.getStringExtra("key2");*/

        /*Log.d("Tag1",Integer.toString(student2.getNim()));
        Log.d("Tag2",student2.getNama());
        Log.d("Tag3",student2.getAlamat());
        Log.d("Tag3",Double.toString(student2.getIpk()));*/
        }


    public void onClick(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        Student student2 = new Student(nim,nama,alamat,ipk);
        intent.putExtra("student2",student2);


        startActivity(intent);
    }
}
