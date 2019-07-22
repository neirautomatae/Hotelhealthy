package com.example.hotelhealthy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tips extends AppCompatActivity {
    private Button graphic1;
    private Button graphic2;
    private Button graphic3;
    private Button graphic4;
    private Button graphic5;
    private Button graphic6;
    private Button graphic7;
    private Button graphic8;
    private Button graphic9;
    private Button graphic10;
    private Button graphic11;
    private Button graphic12;
    private Button graphic13;
    private Button graphic14;
    private Button graphic15;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        graphic1 = findViewById(R.id.tips1);
        graphic2 = findViewById(R.id.tips2);
        graphic3 = findViewById(R.id.tips3);
        graphic4 = findViewById(R.id.tips4);
        graphic5 = findViewById(R.id.tips5);
        graphic6 = findViewById(R.id.tips6);
        graphic7 = findViewById(R.id.tips7);
        graphic8 = findViewById(R.id.tips8);
        graphic9 = findViewById(R.id.tips9);
        graphic10 = findViewById(R.id.tips10);
        graphic11 = findViewById(R.id.tips11);
        graphic12 = findViewById(R.id.tips12);
        graphic13 = findViewById(R.id.tips13);
        graphic14 = findViewById(R.id.tips14);
        graphic15 = findViewById(R.id.tips15);

        graphic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent graphic1 = new Intent(Tips.this , tips1.class);
                startActivity(graphic1);
            }
        });

        graphic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent graphic2 = new Intent(Tips.this , tips2.class);
                startActivity(graphic2);
            }
        });

        graphic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent graphic3 = new Intent(Tips.this , tips3.class);
                startActivity(graphic3);
            }
        });

        graphic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent graphic4 = new Intent(Tips.this , tips4.class);
                startActivity(graphic4);
            }
        });

        graphic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent graphic5 = new Intent(Tips.this , tips5.class);
                startActivity(graphic5);
            }
        });

        graphic6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent graphic6 = new Intent(Tips.this , tips6.class);
                startActivity(graphic6);
            }
        });

        graphic7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent graphic7 = new Intent(Tips.this , tips7.class);
                startActivity(graphic7);
            }
        });

        graphic8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent graphic8 = new Intent(Tips.this , tips8.class);
                startActivity(graphic8);
            }
        });

        graphic9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent graphic9 = new Intent(Tips.this , tips9.class);
                startActivity(graphic9);
            }
        });

        graphic10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent graphic10 = new Intent(Tips.this , tips10.class);
                startActivity(graphic10);
            }
        });

        graphic11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent graphic11 = new Intent(Tips.this , tips11.class);
                startActivity(graphic11);
            }
        });

        graphic12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent graphic12 = new Intent(Tips.this , tips12.class);
                startActivity(graphic12);
            }
        });

        graphic13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent graphic13 = new Intent(Tips.this , tips13.class);
                startActivity(graphic13);
            }
        });

        graphic14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent graphic14 = new Intent(Tips.this , tips14.class);
                startActivity(graphic14);
            }
        });

        graphic15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent graphic15 = new Intent(Tips.this , tips15.class);
                startActivity(graphic15);
            }
        });

    }



    public void clickbackh(View view) {

        Tips.this.finish();

    }
}
