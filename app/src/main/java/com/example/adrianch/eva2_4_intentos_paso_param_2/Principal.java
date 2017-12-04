package com.example.adrianch.eva2_4_intentos_paso_param_2;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    EditText editxtbusq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btn = (Button) findViewById(R.id.btn);
        editxtbusq = (EditText) findViewById(R.id.editxtbusq);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String txtBuscar = editxtbusq.getText().toString();
        Intent intentoBuscar = new Intent(Intent.ACTION_WEB_SEARCH);
        //Agregar la busqueda
        intentoBuscar.putExtra(SearchManager.QUERY, txtBuscar);
        startActivity(intentoBuscar);
    }
}
