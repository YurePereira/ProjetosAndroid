package com.example.francisco.helloyure;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtHello = (TextView) findViewById(R.id.txtHello);
        txtHello.setText("Hello Yure Pereira");

        final TextView txtResult = (TextView) findViewById(R.id.textResult);

        final EditText editFirstName = (EditText) findViewById(R.id.textFirst);
        final EditText editLastName = (EditText) findViewById(R.id.textLastName);

        Button btnSend = (Button) findViewById(R.id.buttonSend);
        Button btnClean = (Button) findViewById(R.id.buttonClean);
        Button btnTela2 = (Button) findViewById(R.id.buttonTela2);

        btnSend.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                String firstName = editFirstName.getText().toString();
                String lastName = editLastName.getText().toString();

                txtResult.setText("Result: " + firstName + " " + lastName);

            }
        });

        btnClean.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                editFirstName.setText("");
                editLastName.setText("");
                txtResult.setText(R.string.text_result);

            }
        });

        btnTela2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {

                Intent tela2 = new Intent(MainActivity.this, Tela2.class);
                startActivity(tela2);

            }
        });

    }

}
