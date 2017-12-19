package cl.demarka.uselibrery.actividad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import cl.demarka.uselibrery.R;

/*

Declaracion y asignación de valores, mediante el uso de metodos proporsionados
por Android. Con el fin de interactuar con la vista.

public class ButterKnifeEjem extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter_knife);

        //Asignar valores de vista a variables declaras a nivel de clase

        editText = (EditText) findViewById(R.id.etButter);
        textView = (TextView) findViewById(R.id.tvButter);
        button = (Button) findViewById(R.id.btnButter);

        // Añadir evento onClick a un elemento btn
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(editText.getText().toString());
            }
        });

    }
}
*/

/*Ejemplo práctico, de interacción con la vista de usuario, mediante la declaración
* y asignación de valores utitlizando librería ButterKnifeEjem. */

public class ButterKnifeEjem extends AppCompatActivity {

    //Declarar variables y asignar valores provenientes de la vista.
    @BindView(R.id.tvButter) TextView textView;
    @BindView(R.id.etButter) EditText editText ;

    //Declarar, asignar y Añadir un evento onClick a un elemento boton proveniente
    //de la vista
    @OnClick(R.id.btnButter) void enviar(){
        textView.setText(editText.getText().toString());
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter_knife);

        //Es necesario agregar la sigueinte linea y pasar como parametro
        // la el contexto de la aplicación.
        butterknife.ButterKnife.bind(this);

    }
}
