package com.example.win10.paulinyohanestafernanda_1202150238_modul2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class SplashScreen extends Activity {

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Toast.makeText(this, "PAULIN YOHANESTA_1202150238", Toast.LENGTH_SHORT).show(); //akan menampilkan pesan PAULIN YOHANESTA_1202150238
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            // method untuk mengarahkan ke aktivitas selanjutnya
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MenuUtama.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}
