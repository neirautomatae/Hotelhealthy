package com.example.hotelhealthy;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class tips2 extends AppCompatActivity {

    private Button backtips2;
    private Button hometips2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips2);


        backtips2 = findViewById(R.id.btnbktips2);
        hometips2 = findViewById(R.id.btnhometips2);

        backtips2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tips2.this.finish();
            }
        });

        hometips2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips2 = new Intent(tips2.this , MainActivity.class);
                startActivity(hometips2);
            }
        });
    }
}
