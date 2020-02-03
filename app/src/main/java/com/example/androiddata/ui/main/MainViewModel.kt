package com.example.androiddata.ui.main

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.androiddata.R
import com.example.androiddata.utilities.FileHelper

class MainViewModel(app: Application) : AndroidViewModel(app) {

    init {
        val text = FileHelper.getTextFromResources(app, R.raw.monster_data)
        Log.i("MonsterLogging", text)
    }
}
