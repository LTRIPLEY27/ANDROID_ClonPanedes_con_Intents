package es.ua.eps.android_clonpanedes_con_intents;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HorariosActivity extends AppCompatActivity {

    private WebView wess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horarios);

        wess = (WebView) findViewById(R.id.websi);

        wess.getSettings().setJavaScriptEnabled(true);
        wess.loadUrl("https://www.google.es"); //https://autocarsdelpenedes.com/horaris NO FUNCIONA¡¡
        wess.setWebViewClient(new WebViewClient()
                              {
                                  @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                                  @Override
                                  public boolean shouldOverrideUrlLoading(WebView v, WebResourceRequest request) {
                                      v.loadUrl(request.getUrl().toString());
                                      return false;
                                  }
                              }
        );


    }
}