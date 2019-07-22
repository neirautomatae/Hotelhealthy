package com.example.hotelhealthy;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class tips1 extends AppCompatActivity {

    private Button backtips1;
    private Button hometips1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips1);


        backtips1 = findViewById(R.id.btnbktips1);
        hometips1 = findViewById(R.id.btnhometips1);

        backtips1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               tips1.this.finish();
            }
        });

        hometips1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hometips1 = new Intent(tips1.this , MainActivity.class);
                startActivity(hometips1);
            }
        });
    }
}
