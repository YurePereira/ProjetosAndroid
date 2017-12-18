package com.example.francisco.projetofinal;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InserirActivity extends AppCompatActivity {

    Button btnVoltar, btnInserir, bntListar;
    private DBHelper dh;
    EditText txtNome, txtCPF, txtIdade, txtTelefone, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserir);

        btnVoltar = (Button) findViewById(R.id.btnVoltar);
        btnInserir = (Button) findViewById(R.id.btnInserir);
        bntListar = (Button) findViewById(R.id.btnListar);

        this.dh = new DBHelper(this);
        txtNome = (EditText) findViewById(R.id.txtNome);
        txtCPF = (EditText) findViewById(R.id.txtCPF);
        txtIdade = (EditText) findViewById(R.id.txtIdade);
        txtTelefone = (EditText) findViewById(R.id.txtTelefone);
        txtEmail = (EditText) findViewById(R.id.txtEmail);

        btnInserir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                inserir();

            }
        });

        bntListar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                listar();

            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                voltar();

            }
        });

    }

    void inserir() {

        String nome = txtNome.getText().toString();
        String cpf = txtCPF.getText().toString();
        String idade = txtIdade.getText().toString();
        String telefone = txtTelefone.getText().toString();
        String email = txtEmail.getText().toString();

        if (nome.length() > 0 && cpf.length() > 0 && idade.length() > 0 && telefone.length() > 0 && email.length() > 0) {

            dh.insert(nome, cpf, idade, telefone, email);
            AlertDialog.Builder alert = new AlertDialog.Builder(InserirActivity.this);
            alert.setTitle("Mensagem");
            alert.setMessage("Registro realizado com sucesso!");
            alert.show();

            txtNome.setText("");
            txtCPF.setText("");
            txtIdade.setText("");
            txtTelefone.setText("");
            txtEmail.setText("");

        } else {

            AlertDialog.Builder alert = new AlertDialog.Builder(InserirActivity.this);
            alert.setTitle("Mensagem");
            alert.setMessage("Erro: Todos os campos devem ser preenchidos corretamente!");
            alert.show();

            txtNome.setText("");
            txtCPF.setText("");
            txtIdade.setText("");
            txtTelefone.setText("");
            txtEmail.setText("");

        }

    }

    void listar() {

        Intent intent = new Intent();
        intent.setClass(InserirActivity.this, ListarActivity.class);
        startActivity(intent);
        finish();

    }

    void voltar() {

        Intent intent = new Intent();
        intent.setClass(InserirActivity.this, MainActivity.class);
        startActivity(intent);
        finish();

    }

}
