package com.secdev.onetouchlearning

import android.app.Application
import com.google.firebase.database.FirebaseDatabase

class OTLApps : Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseDatabase.getInstance().setPersistenceEnabled(true)
    }
}