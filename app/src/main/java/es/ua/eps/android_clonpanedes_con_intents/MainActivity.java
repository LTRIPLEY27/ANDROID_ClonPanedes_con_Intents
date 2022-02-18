package es.ua.eps.android_clonpanedes_con_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button empresa, contacto, horario, servicios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        empresa = findViewById(R.id.empresa);
        contacto = findViewById(R.id.contacto);
        horario = findViewById(R.id.horario);
        servicios = findViewById(R.id.service);

        // LLAMADO A LOS LISTENERS
        empresa.setOnClickListener(this);
        contacto.setOnClickListener(this);
        horario.setOnClickListener(this);
        servicios.setOnClickListener(this);
    }

    //MÉTODOS VIEW LISTENER
    @Override
    public void onClick(View act) {
        switch(act.getId()){
            case R.id.empresa:

        }
    }

    public static class Empresa {
    }
}