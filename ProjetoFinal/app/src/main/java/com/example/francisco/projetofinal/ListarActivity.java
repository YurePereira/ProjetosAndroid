package com.example.francisco.projetofinal;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class ListarActivity extends AppCompatActivity {

    ListView lvlista;
    Button btnVoltar;
    private DBHelper dh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        lvlista = (ListView) findViewById(R.id.lvLista);
        btnVoltar = (Button) findViewById(R.id.btnVoltar);
        this.dh = new DBHelper(this);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                voltar();

            }
        });

        List<Pessoa> pessoas = dh.listar();

        if (pessoas == null) {

            AlertDialog.Builder alert = new AlertDialog.Builder(ListarActivity.this);
            alert.setTitle("Mensagem");
            alert.setMessage("Não há registros cadastrados!");
            alert.show();

        } else {

            ArrayAdapter<Pessoa> adapter = new ArrayAdapter<Pessoa>(this, android.R.layout.simple_list_item_1, pessoas);
            lvlista.setAdapter(adapter);

        }

    }

    void voltar() {

        Intent intent = new Intent();
        intent.setClass(ListarActivity.this, InserirActivity.class);
        startActivity(intent);
        finish();

    }

}
