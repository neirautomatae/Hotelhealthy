package com.example.hotelhealthy;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class tips3 extends AppCompatActivity {

    private Button backtips3;
    private Button hometips3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips3);


        backtips3 = findViewById(R.id.btnbktips3);
        hometips3 = findViewById(R.id.btnhometips3);

        backtips3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tips3.this.finish();
            }
        });

        hometips3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips3 = new Intent(tips3.this , MainActivity.class);
                startActivity(hometips3);
            }
        });
    }
}

