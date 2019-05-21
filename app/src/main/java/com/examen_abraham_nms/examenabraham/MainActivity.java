package com.examen_abraham_nms.examenabraham;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button b1,b2,b3,b4,b5,b6,b7,b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.fat);
        b1.setOnClickListener(this);
        b2 = (Button)findViewById(R.id.cas);
        b2.setOnClickListener(this);
        b3 = (Button)findViewById(R.id.vaf);
        b3.setOnClickListener(this);
        b4 = (Button)findViewById(R.id.kac);
        b4.setOnClickListener(this);
        b5 = (Button)findViewById(R.id.mac);
        b5.setOnClickListener(this);
        b6 = (Button)findViewById(R.id.cam);
        b6.setOnClickListener(this);
        b7 = (Button)findViewById(R.id.cap);
        b7.setOnClickListener(this);
        b8 = (Button)findViewById(R.id.pac);
        b8.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);

    }
}
