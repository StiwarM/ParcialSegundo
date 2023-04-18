package com.example.pruebas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox cs1, cr2, cm3, cd4;
    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cs1 = (CheckBox) findViewById(R.id.Sumar1);
        cr2 = (CheckBox) findViewById(R.id.Resta);
        cm3 = (CheckBox) findViewById(R.id.Multiplicacion);
        cd4 = (CheckBox) findViewById(R.id.Dividir);

        /*Este componente define el cambio a un activity diferente por el boton*/
        /*siguiente=(Button)findViewById(R.id.Button1);

        siguiente.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Activity2.class);
                startActivity(i);

            }
        });*/

        /* @Override
                public void onClick(View v) {
            if(View.getId()==R.id.Button1){
                siguiente();
            }
        }

        private void validar(){
            String mensaje="Seleccionado: \n";

            if(cs1.isChecked()){

            }
        }*/

    }
}
