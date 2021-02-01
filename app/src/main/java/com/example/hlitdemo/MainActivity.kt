package com.example.hlitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.hlitdemo.cage.Cage
import com.example.hlitdemo.cage.CageWithCat
import com.example.hlitdemo.cage.CageWithDog
import com.example.hlitdemo.interfacemodule.Animal
import com.example.hlitdemo.interfacemodule.Cat
import com.example.hlitdemo.interfacemodule.Dog
import com.example.lib_base.LibBaseActivity
import com.example.lib_base.NetworkState
import dagger.Binds
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var networkState: NetworkState

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textview = findViewById<TextView>(R.id.textview)
        Handler().postDelayed(Runnable {
            textview.text = "from lib-base $networkState"
        }, 5000)

        findViewById<Button>(R.id.button)?.let {
            it.setOnClickListener {
                startActivity(LibBaseActivity.getIntent(this))
            }
        }
    }

}
