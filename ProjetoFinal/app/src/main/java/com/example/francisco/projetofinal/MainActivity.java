package com.example.francisco.projetofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnInserir = (Button) findViewById(R.id.btnInserir);
        btnInserir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                abrirInseir();

            }
        });

    }

    void abrirInseir() {

        Intent intent = new Intent();
        intent.setClass(MainActivity.this, InserirActivity.class);
        startActivity(intent);
        finish();

    }

}
