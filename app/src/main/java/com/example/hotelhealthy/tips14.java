package com.example.hotelhealthy;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class tips14 extends AppCompatActivity {
    private Button backtips14;
    private Button hometips14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips14);


        backtips14 = findViewById(R.id.btnbktips14);
        hometips14 = findViewById(R.id.btnhometips14);

        backtips14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tips14.this.finish();
            }
        });

        hometips14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips14 = new Intent(tips14.this , MainActivity.class);
                startActivity(hometips14);
            }
        });
    }
}
