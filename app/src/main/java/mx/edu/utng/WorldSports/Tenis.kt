package mx.edu.utng.WorldSports

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tips_web_view.*

class Tenis : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips_web_view)

        //WEBVIEW
        webView.loadUrl("https://www.mundodeportivo.com/tenis")
    }
}
