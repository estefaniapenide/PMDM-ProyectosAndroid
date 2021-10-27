package com.example.javakotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton1 = findViewById(R.id.boton1);
        Button boton2 = findViewById(R.id.boton2);

        boton1.setOnClickListener(v -> {
                    Intent intent = new Intent(MainActivity.this, MainActivityKotlin.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this,"Pinchando en el botón",Toast.LENGTH_SHORT).show();
                }
        );

        boton2.setOnClickListener(v -> {
                    Intent intent = new Intent(MainActivity.this, MainActivityKotlinOtra.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this,"Pinchando en el botón",Toast.LENGTH_SHORT).show();
                }
        );


        TextView tv1 = findViewById(R.id.tv1);

        tv1.setOnClickListener(
                v-> {
                    Toast.makeText(MainActivity.this,"Pinchando en el texto",Toast.LENGTH_SHORT).show();
                }
        );
    }
}