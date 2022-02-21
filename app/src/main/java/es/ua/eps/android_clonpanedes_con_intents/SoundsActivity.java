package es.ua.eps.android_clonpanedes_con_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

public class SoundsActivity extends AppCompatActivity implements View.OnClickListener {

    private Button boton1, boton2, boton3, stop1, stop2, stop3;
    private MediaPlayer media1, media2, media3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sounds);

        boton1 = (Button) findViewById(R.id.bones);
        boton2 = (Button) findViewById(R.id.gliss);
        boton3 = (Button) findViewById(R.id.cinematic);
        stop1 =  (Button) findViewById(R.id.stopBones);
        stop2 =  (Button) findViewById(R.id.stopGliss);
        stop3=  (Button) findViewById(R.id.stopHorror);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        stop1.setOnClickListener(this);
        stop2.setOnClickListener(this);
        stop3.setOnClickListener(this);
    }

    //MÉTODOS VIEW LISTENER
    @Override
    public void onClick(View act) {
        switch(act.getId()){
            case R.id.bones:
                media1 = MediaPlayer.create(getApplicationContext(), R.raw.zapsplat_horror_glissando_bright_mysterious_yet_sinister_and_dark_001_70394);
                media1.start();// EJECUTA EL INTENT LAYOUT SEGUNDA ACTIVITY CON EL LLAMADO A LA CLASE, es lo que dispara a la misma
                break;
            case R.id.gliss:
                media2 = MediaPlayer.create(getApplicationContext(), R.raw.zapsplat_horror_swell_chilling_dark_sinister_45689);
                media2.start();// EJECUTA EL INTENT LAYOUT SEGUNDA ACTIVITY CON EL LLAMADO A LA CLASE, es lo que dispara a la misma
                break;
            case R.id.cinematic:
                media3 = MediaPlayer.create(getApplicationContext(), R.raw.zapsplat_horror_glissando_bright_mysterious_yet_sinister_and_dark_001_70394);
                media3.start();// EJECUTA EL INTENT LAYOUT SEGUNDA ACTIVITY CON EL LLAMADO A LA CLASE, es lo que dispara a la misma
                break;
            case R.id.stopBones:
                media1.stop();
                break;
            case R.id.stopGliss:
                media2.stop();
                break;
            case R.id.stopHorror:
                media3.stop();
                break;
            default:
                Toast.makeText(SoundsActivity.this, "DEBE DE ELEGIR UNA OPCIÓN VÁLIDA", Toast.LENGTH_LONG).show();
                break;
        }
    }
}