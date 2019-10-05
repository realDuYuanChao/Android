package com.github.shellhub.toast

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * executed when button clicked
     */
    fun showToast(view: View) {
        when (view.id) {
            R.id.btn_short_toasts -> Toast.makeText(
                this,
                R.string.short_toasts,
                Toast.LENGTH_SHORT
            ).show()
            R.id.btn_long_toasts -> Toast.makeText(
                this,
                R.string.long_toasts,
                Toast.LENGTH_SHORT
            ).show()
            R.id.btn_custom_toasts -> {
                val inflater = layoutInflater
                val layout = inflater.inflate(
                    R.layout.custom_toasts,
                    findViewById(R.id.custom_toast_container)
                )
                with(Toast(applicationContext)) {
                    duration = Toast.LENGTH_LONG
                    this.view = layout
                    show()
                }
            }
            else -> {
                //TODO
            }

        }
    }
}
