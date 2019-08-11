package com.secdev.onetouchlearning.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.secdev.onetouchlearning.R
import kotlinx.android.synthetic.main.activity_onboard.*

class OnboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard)

        onboardButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        val headerAnim = AnimationUtils.loadAnimation(this, R.anim.btt)
        val subtitleAnim = AnimationUtils.loadAnimation(this, R.anim.bttdua)
        val buttonAnim = AnimationUtils.loadAnimation(this, R.anim.btttiga)

        onboardHeader.startAnimation(headerAnim)
        onboardSubtitle.startAnimation(subtitleAnim)
        onboardButton.startAnimation(buttonAnim)
    }
}
