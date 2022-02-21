package es.ua.eps.android_clonpanedes_con_intents;

import androidx.appcompat.app.AppCompatActivity;
import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.provider.Telephony;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected Button empresa, contacto, horario, servicios, fav, horrie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        empresa = findViewById(R.id.empresa);
        contacto = findViewById(R.id.contacto);
        horario = findViewById(R.id.horario);
        servicios = findViewById(R.id.service);
        fav = findViewById(R.id.favorites);
        horrie = findViewById(R.id.horrorMe);

        // LLAMADO A LOS LISTENERS
        empresa.setOnClickListener(this);
        contacto.setOnClickListener(this);
        horario.setOnClickListener(this);
        servicios.setOnClickListener(this);
        fav.setOnClickListener(this);
        horrie.setOnClickListener(this);
    }

    //MÉTODOS VIEW LISTENER
    @Override
    public void onClick(View act) {
        switch(act.getId()){
            case R.id.empresa:
                Intent intentToDoSomething = new Intent(getApplicationContext(), EmpresaActivity.class);
                startActivity(intentToDoSomething);// EJECUTA EL INTENT LAYOUT SEGUNDA ACTIVITY CON EL LLAMADO A LA CLASE, es lo que dispara a la misma
                break;
            case R.id.horario:
                Intent intents = new Intent(getApplicationContext(), HorariosActivity.class);
                startActivity(intents);
                break;
            case R.id.service:
                Intent intentoUno = new Intent(getApplicationContext(), ServicesActivity.class);
                startActivity(intentoUno);
                break;
            case R.id.contacto:
                Uri call = Uri.parse("Cont:+938171275");//EL MÉTODO DE LA CLASE URI CONVIERTE EL STRING A NPARA HACER LLAMADO
                Intent callMe = new Intent(Intent.ACTION_DIAL, call);// EL INTENT HACE USO DEL MÉTODO ACTION_DIAL
                startActivity(callMe);
                break;
            case R.id.favorites:
                Intent intentFav = new Intent(getApplicationContext(), FavViewActivity.class);
                startActivity(intentFav);
                break;
            case R.id.horrorMe:
                Intent intenton = new Intent(getApplicationContext(), SoundsActivity.class);
                startActivity(intenton);
                break;
            default:
                Toast.makeText(MainActivity.this, "DEBE DE ELEGIR UNA OPCIÓN VÁLIDA", Toast.LENGTH_LONG).show();
                break;
        }
    }

}