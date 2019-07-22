package com.example.hotelhealthy;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class tips7 extends AppCompatActivity {
    private Button backtips7;
    private Button hometips7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips7);


        backtips7 = findViewById(R.id.btnbktips7);
        hometips7 = findViewById(R.id.btnhometips7);

        backtips7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tips7.this.finish();
            }
        });

        hometips7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips6 = new Intent(tips7.this , MainActivity.class);
                startActivity(hometips6);
            }
        });
    }
}
