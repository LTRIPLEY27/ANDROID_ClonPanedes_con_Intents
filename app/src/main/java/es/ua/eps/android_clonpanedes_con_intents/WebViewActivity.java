package es.ua.eps.android_clonpanedes_con_intents;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

   private WebView webi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webi = (WebView) findViewById(R.id.webs);


        webi.getSettings().setJavaScriptEnabled(true);//HABILITA EL WEBVIEW
        webi.loadUrl("https://www.youtube.com"); //LA DIRECCION WEB SE ENVIARÁ COMO URL
        webi.setWebViewClient(new WebViewClient() {
                                  @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                                  @Override
                                  public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                                      view.loadUrl(request.getUrl().toString());
                                      return false;
                                  }
                              }
        );
    }
}