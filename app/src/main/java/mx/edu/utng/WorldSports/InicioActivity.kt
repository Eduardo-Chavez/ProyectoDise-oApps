package mx.edu.utng.WorldSports

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inicio.*
import kotlinx.android.synthetic.main.activity_inicio.btnBasquet
import kotlinx.android.synthetic.main.activity_inicio.btnFut
import kotlinx.android.synthetic.main.activity_inicio.btnRedondo


class InicioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        btnFut.setOnClickListener{
            val intent: Intent = Intent(this, Futbol::class.java)
            startActivity(intent)
        }

        btnBasquet.setOnClickListener{
            val intent:Intent = Intent(this, Basket::class.java)
            startActivity(intent)
        }


        btnFut2.setOnClickListener{
            val intent:Intent = Intent(this, Futbol::class.java)
            startActivity(intent)
        }

        btnFut3.setOnClickListener{
            val intent:Intent = Intent(this, Basket::class.java)
            startActivity(intent)
        }

        btnBasquet2.setOnClickListener{
            val intent:Intent = Intent(this, Basket::class.java)
            startActivity(intent)
        }

        btnBasquet3.setOnClickListener{
            val intent:Intent = Intent(this, Basket::class.java)
            startActivity(intent)
        }

        btnRedondo.setOnClickListener{
            val intent:Intent = Intent(this, AcercaActivity::class.java)
            startActivity(intent)
        }
    }
}
