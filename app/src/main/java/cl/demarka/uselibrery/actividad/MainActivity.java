package cl.demarka.uselibrery.actividad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import butterknife.OnClick;
import butterknife.ButterKnife;
import cl.demarka.uselibrery.R;


public class MainActivity extends AppCompatActivity {
    @OnClick(R.id.btnButterKnife)
    void irButter() {
       startActivity(new Intent(this,ButterKnifeEjem.class));
    }
    @OnClick(R.id.btnActivityPicasso)
    void irPicasso() {
       startActivity(new Intent(this,PicassoEjem.class));
    }

    @OnClick(R.id.btnActivityGson)
    void irGson() {
        startActivity(new Intent(this, GsonEjem.class));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


    public void msg(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();

    }

}
