package com.secdev.onetouchlearning.database

import com.google.firebase.database.FirebaseDatabase

class Database {

    private val database = FirebaseDatabase.getInstance()
    val techniques = database.reference.child("techniques")

}