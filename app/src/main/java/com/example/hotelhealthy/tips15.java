package com.example.hotelhealthy;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class tips15 extends AppCompatActivity {

    private Button backtips15;
    private Button hometips15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips15);


        backtips15 = findViewById(R.id.btnbktips15);
        hometips15 = findViewById(R.id.btnhometips15);

        backtips15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tips15.this.finish();
            }
        });

        hometips15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips15 = new Intent(tips15.this , MainActivity.class);
                startActivity(hometips15);
            }
        });
    }
}
