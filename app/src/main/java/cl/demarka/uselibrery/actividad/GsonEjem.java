package cl.demarka.uselibrery.actividad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import com.google.gson.Gson;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cl.demarka.uselibrery.R;
import cl.demarka.uselibrery.modelo.Persona;

public class GsonEjem extends AppCompatActivity {

    @BindView(R.id.etNombre)
    EditText etNombre;
    @BindView(R.id.etApellido)
    EditText etApellido;
    @BindView(R.id.etEdad)
    EditText etEdad;
    @BindView(R.id.etResultadoJson)
    EditText etResultadoJson;
    @BindView(R.id.etResultadoObjeto)
    EditText etResultadoObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gson_ejem);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnConvertirAJson)
    public void convertirObjetoJson(){
        mostrarDatosJson();
    }
  @OnClick(R.id.btnConvertirAObjeto)
    public void convertirJsonObjeto(){
        mostrarDatosObj();
    }



    private void mostrarDatosJson() {
        etResultadoJson.setText(obtenerJson());
    }

    private String obtenerJson() {
        Gson gson = new Gson();
        Persona per = crearObjeto();
        String json = gson.toJson(per);
        return json;
    }

    private Persona crearObjeto() {
        Persona p = new Persona();
        p.setNombre(etNombre.getText().toString());
        p.setApellido(etApellido.getText().toString());
        p.setEdad(Integer.parseInt(etEdad.getText().toString()));

        return p;
    }

    private void mostrarDatosObj() {
        etResultadoObj.setText(obtenerObjeto());
    }

    private String obtenerObjeto() {
        Gson g = new Gson();
        Persona p = g.fromJson(crearJson(),Persona.class);
        return p.toString();
    }

    private String crearJson() {
        return etResultadoJson.getText().toString();
    }


}
