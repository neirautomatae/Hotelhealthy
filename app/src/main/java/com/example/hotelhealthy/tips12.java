package com.example.hotelhealthy;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class tips12 extends AppCompatActivity {
    private Button backtips12;
    private Button hometips12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips12);


        backtips12 = findViewById(R.id.btnbktips12);
        hometips12 = findViewById(R.id.btnhometips12);

        backtips12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tips12.this.finish();
            }
        });

        hometips12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips12 = new Intent(tips12.this , MainActivity.class);
                startActivity(hometips12);
            }
        });
    }
}
