package com.example.latihanpam1;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_third);
        Intent intent = getIntent();
        Student student3 = intent.getParcelableExtra("student2");

        android.support.v7.app.ActionBar actionBar =getSupportActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(true);

        displayOne=findViewById(R.id.nama3);
        displayTwo=findViewById(R.id.nim3);
        displayThree=findViewById(R.id.alamat3);
        displayFour=findViewById(R.id.ipk3);

        nim=student3.getNim();
        nama=student3.getNama();
        alamat=student3.getAlamat();
        ipk=student3.getIpk();

        displayOne.setText(nama+" second intent");
        displayTwo.setText(Integer.toString(nim)+" second intent");
        displayThree.setText(alamat+" second intent");
        displayFour.setText(Double.toString(ipk)+" second intent");
    }
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;
    }
}
