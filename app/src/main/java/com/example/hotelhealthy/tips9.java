package com.example.hotelhealthy;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class tips9 extends AppCompatActivity {
    private Button backtips9;
    private Button hometips9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips9);


        backtips9 = findViewById(R.id.btnbktips9);
        hometips9 = findViewById(R.id.btnhometips9);

        backtips9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tips9.this.finish();
            }
        });

        hometips9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips9 = new Intent(tips9.this , MainActivity.class);
                startActivity(hometips9);
            }
        });
    }
}
