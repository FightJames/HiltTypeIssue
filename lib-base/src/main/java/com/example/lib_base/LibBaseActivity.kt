package com.example.lib_base

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView
import com.james.module_tool.Tool
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LibBaseActivity : AppCompatActivity() {

    @Inject
    lateinit var tool: Tool

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lib_base)
        findViewById<TextView>(R.id.textView)?.let {
            it.text = "tool instance $tool"
        }

    }

    companion object {
        fun getIntent(context: Context) = Intent(context, LibBaseActivity::class.java)
    }
}