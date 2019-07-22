package com.example.hotelhealthy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class tips5 extends AppCompatActivity {
    private Button backtips5;
    private Button hometips5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips5);


        backtips5 = findViewById(R.id.btnbktips5);
        hometips5 = findViewById(R.id.btnhometips5);

        backtips5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tips5.this.finish();
            }
        });

        hometips5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips5 = new Intent(tips5.this , MainActivity.class);
                startActivity(hometips5);
            }
        });
    }
}
