package es.ua.eps.android_clonpanedes_con_intents;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ServicesActivity extends AppCompatActivity {

    private WebView webbir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        webbir = (WebView) findViewById(R.id.serviciosWeb); //LE DA EL VALOR AL ATRIBUTO EL ID

        webbir.getSettings().setJavaScriptEnabled(true);// SETTEA EL ESTADO DEL WEBVIEW PARA QUE SE MUESTRE
        webbir.loadUrl("https://autocarsdelpenedes.com/serveis"); //CARGA LA DIRECCION WEB QUE LE INDIQUEMOS
        webbir.setWebViewClient(new WebViewClient()//DISPARA EL EVENTO
                              {
                                  @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                                  @Override
                                  public boolean shouldOverrideUrlLoading(WebView voo, WebResourceRequest request) {
                                      voo.loadUrl(request.getUrl().toString());
                                      return false;
                                  }
                              }
        );
    }
}