package com.example.hotelhealthy;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class tips6 extends AppCompatActivity {
    private Button backtips6;
    private Button hometips6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips6);


        backtips6 = findViewById(R.id.btnbktips6);
        hometips6 = findViewById(R.id.btnhometips6);

        backtips6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tips6.this.finish();
            }
        });

        hometips6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips6 = new Intent(tips6.this , MainActivity.class);
                startActivity(hometips6);
            }
        });
    }
}
