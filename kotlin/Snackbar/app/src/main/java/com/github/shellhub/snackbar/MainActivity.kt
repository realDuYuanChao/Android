package com.github.shellhub.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    
    /* execute when view clicked */
    fun onClick(view: View) {
        when (view.id) {
            R.id.send -> Snackbar.make(
                view,
                R.string.delete_msg,
                Snackbar.LENGTH_LONG
            ).setAction(
                R.string.undo
            ) {
                Toast.makeText(
                    this,
                    R.string.recovery_msg,
                    Toast.LENGTH_LONG
                ).show()
            }.show();
        }
    }
}
