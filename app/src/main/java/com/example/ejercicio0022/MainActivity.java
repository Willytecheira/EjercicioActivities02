package com.example.ejercicio0022;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tv1;
    private Button bt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        bt1 = (Button) findViewById(R.id.bt1);

        bt1.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, Pagina2.class);
        startActivityForResult(intent, 1);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1 ){
            if(requestCode == Activity.RESULT_OK){
                tv1.setText(data.getExtras().getString("llavenombre"));
            }
        }
    }
}