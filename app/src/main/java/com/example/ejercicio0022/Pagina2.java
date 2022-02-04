package com.example.ejercicio0022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Pagina2 extends AppCompatActivity implements View.OnClickListener{

    private EditText ed1;
    private Button bt2;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina2);

        ed1 = (EditText) findViewById(R.id.ed1);
        bt2 = (Button) findViewById(R.id.bt2);

        bt2.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        name = ed1.getText().toString();
    }

        public void finish(){

        Intent data = new Intent(this, MainActivity.class);
        data.putExtra("llavenombre",name);
        setResult(RESULT_OK, data);
        startActivity(data);}

}