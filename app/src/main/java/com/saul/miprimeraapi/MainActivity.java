package com.saul.miprimeraapi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button miBotonIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//enlace con la vista
        miBotonIngresar=findViewById(R.id.btnIngreso);//enlazamos el elemento
        iniciaControl();
    }
    private void iniciaControl(){
        miBotonIngresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
            //enlazar el text usuario
                EditText mitxtUsuario= findViewById(R.id.txtUsuario);
                //obtener el valor
                String usuario= mitxtUsuario.getText().toString();
                //Comunicando los dos activities
                Intent intent= new Intent(getApplicationContext(),MenuPrincipal.class);
                //Enviamos la informacion al activiy 2
                intent.putExtra("usuarioNombre",usuario);

                //Inicio la activity enlazada
                startActivity(intent);

            }
        });
    }
}