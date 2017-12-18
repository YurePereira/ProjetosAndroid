package com.example.francisco.percentofx;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textPercent = (TextView) findViewById(R.id.txt_what_is);
        final TextView textValue = (TextView) findViewById(R.id.txt_of);

        Button buttonSend = (Button) findViewById(R.id.btn_send);
        Button buttonClean = (Button) findViewById(R.id.btn_clean);

        buttonSend.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {

                double percent = Double.parseDouble(textPercent.getText().toString());
                double value = Double.parseDouble(textValue.getText().toString());
                double result = percent * value / 100;

                Log.d("Result:", Double.toString(result));

                Bundle params = new Bundle();
                params.putDouble("result", result);

                Intent activityResult = new Intent(MainActivity.this, Result.class);
                activityResult.putExtras(params);

                startActivity(activityResult);

            }

        });

        buttonClean.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                textPercent.setText("");
                textValue.setText("");
            }

        });

    }

}
