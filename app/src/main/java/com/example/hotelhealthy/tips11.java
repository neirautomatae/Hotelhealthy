package com.example.hotelhealthy;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class tips11 extends AppCompatActivity {
    private Button backtips11;
    private Button hometips11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips11);


        backtips11 = findViewById(R.id.btnbktips11);
        hometips11 = findViewById(R.id.btnhometips11);

        backtips11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tips11.this.finish();
            }
        });

        hometips11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips11 = new Intent(tips11.this , MainActivity.class);
                startActivity(hometips11);
            }
        });
    }
}
