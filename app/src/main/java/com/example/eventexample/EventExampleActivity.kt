package com.example.eventexample


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class EventExampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_example)

        val button: Button = findViewById(R.id.button) as Button
        button.setOnClickListener{
                    val textView = findViewById<TextView>(R.id.StatusText)
                    textView.text = "Button Clicked"
                    Toast.makeText(this, "Button Clicked!!!", Toast.LENGTH_SHORT).show()
                }

        button.setOnLongClickListener {
            val statusText = findViewById(R.id.StatusText) as TextView
            statusText.text = "Long button click"
            Toast.makeText(this, "Long Button Clicked!!!", Toast.LENGTH_SHORT).show() 
            false
        }

    }
}


