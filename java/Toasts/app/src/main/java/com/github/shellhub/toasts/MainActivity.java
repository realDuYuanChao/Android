package com.github.shellhub.toasts;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Show Toasts when button clicked
     *
     * @param view deliver view
     */
    public void showToast(View view) {
        switch (view.getId()) {
            case R.id.btn_short_toasts:
                Toast.makeText(this, getResources().getText(R.string.short_toasts), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_long_toasts:
                Toast.makeText(this, getResources().getText(R.string.long_toasts), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_custom_toasts:
                View toastCustomView = getLayoutInflater().inflate(R.layout.custom_toasts, null);
                Toast customToast = new Toast(this);
                customToast.setView(toastCustomView);
                customToast.show();
                break;
            default:
                //TODO
        }
    }
}
