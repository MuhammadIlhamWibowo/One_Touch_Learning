package com.secdev.onetouchlearning.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import com.secdev.onetouchlearning.R
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        scheduleSplashScreen()

        val logoAnim = AnimationUtils.loadAnimation(this, R.anim.fadein)

        logo.startAnimation(logoAnim)
    }

    private fun scheduleSplashScreen() {
        val splashScreenDuration = getSplashScreenDuration()
        Handler().postDelayed({
            startActivity(Intent(this, OnboardActivity::class.java))
            finish()
        }, splashScreenDuration)
    }

    private fun getSplashScreenDuration() = 2500L

}
