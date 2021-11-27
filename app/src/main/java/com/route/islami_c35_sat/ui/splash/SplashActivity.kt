package com.route.islami_c35_sat.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.route.islami_c35_sat.R
import com.route.islami_c35_sat.ui.home.HomeActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler(Looper.getMainLooper())
            .postDelayed({
                startHomeActivity();
            }, 2000);
    }

    fun startHomeActivity() {
        val intent = Intent(this, HomeActivity::class.java);
        startActivity(intent);
        finish()

    }
}