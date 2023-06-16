package com.example.graceapp2

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable

class DashboardActivity : AppCompatActivity() {
    lateinit var home: CardView
    lateinit var chat: CardView
    lateinit var profile: CardView
    lateinit var widgets: CardView
    lateinit var settings: CardView
    lateinit var logout: CardView
    lateinit var next: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        home = findViewById(R.id.cardHome)
        chat = findViewById(R.id.cardChat)
        profile = findViewById(R.id.cardProfile)
        widgets = findViewById(R.id.cardWidgets)
        settings = findViewById(R.id.cardSettings)
        logout = findViewById(R.id.cardLogout)
        next = findViewById(R.id.button21)

        home.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Home", Toast.LENGTH_SHORT).show()
            var mynext1 =Intent(this,ImageButton ::class.java)
            startActivity(mynext1)


        }

        chat.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Chat", Toast.LENGTH_SHORT).show()
            var tours= Intent(this,WebVeiwActivity::class.java)
            startActivity(tours)

        }

        profile.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Profile",Toast.LENGTH_SHORT).show()
            var home1= Intent(this,FragmentActivity::class.java)
            startActivity(home1)
        }

        widgets.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Widgets",Toast.LENGTH_SHORT).show()
        }

        settings.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Settings",Toast.LENGTH_SHORT).show()
        }

        logout.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked log out",Toast.LENGTH_SHORT).show()
            var box= AlertDialog.Builder(this)
            box.setPositiveButton("PROCEED", DialogInterface.OnClickListener { diolog, id-> finish()  })
            box.setNegativeButton("CANCEL", DialogInterface.OnClickListener { diolog, id-> NonCancellable.cancel() })

            var alert=box.create()
            alert.setTitle("Grace App")
            alert.show()

        }

        next.setOnClickListener {
            var mynext =Intent(this,ScrollViewActivity::class.java)
            startActivity(mynext)
        }
    }
}



