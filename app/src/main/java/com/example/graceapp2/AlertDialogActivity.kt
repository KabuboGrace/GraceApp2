package com.example.graceapp2

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.coroutines.NonCancellable.cancel

class AlertDialogActivity : AppCompatActivity() {

    lateinit var btn:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        btn=findViewById(R.id.button23)

        btn.setOnClickListener {

            var box=AlertDialog.Builder(this)
            box.setMessage("Do you want to close this application?")
            box.setPositiveButton("PROCEED", DialogInterface.OnClickListener { diolog, id-> finish()  })
            box.setNegativeButton("CANCEL", DialogInterface.OnClickListener { diolog, id-> cancel() })

            var alert=box.create()
            alert.setTitle("Grace App")
            alert.show()


        }
    }
}