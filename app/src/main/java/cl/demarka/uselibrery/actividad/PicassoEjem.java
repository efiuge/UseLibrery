package cl.demarka.uselibrery.actividad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import cl.demarka.uselibrery.R;

public class PicassoEjem extends AppCompatActivity {

    ImageView imgView;
    ImageView imgViewWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso_ejem);
        imgView = (ImageView) findViewById(R.id.img_picasso_uno);
        imgViewWeb = (ImageView) findViewById(R.id.img_picasso_dos);

        //La siguiente declaración es utilizada para agregar un a imagen a un elemento de la vista.
        //La mayoria de las instrucciones en Pircasso comienzan con Picasso.width()
        Picasso.with(this).load(R.drawable.img_2).into(imgView);

        //La siguiente declaración es utilizada para agregar un a imagen de origen web.
        //Se utiliza los metodos placeholder y error, para definir una imagen por defecto,
        //es util cuando la imagen web no carga correctamente o deja de funcionar.
        Picasso.with(this).
                load("https://www.android.com/static/2016/img/share/andy-lg.png").
                placeholder(R.mipmap.ic_launcher).
                error(R.drawable.imagen_no_disponible).
                into(imgViewWeb);


    }
}
