package com.saul.miprimeraapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        Intent intent=getIntent(); //recibo el bundle o variables
        String miusuario= getIntent().getStringExtra("usuarioNombre");
        TextView miTexto=findViewById(R.id.textMensaje);//Enlace
        miTexto.setText(miusuario); //Enviamos el mensaje
    }
}