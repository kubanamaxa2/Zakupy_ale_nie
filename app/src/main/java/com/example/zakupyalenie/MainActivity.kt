package com.example.zakupyalenie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = "Mleko";
        var b = "Cukier";
        var c = "Chleb";
        var d = "Masło";
        var e = "Herbata";
        findViewById<Button>(R.id.button).setOnClickListener{
            if(findViewById<CheckBox>(R.id.cbox1).isChecked == true){
                findViewById<TextView>(R.id.textView).text = a;
            }
            else if(findViewById<CheckBox>(R.id.cbox2).isChecked == true) {
                findViewById<TextView>(R.id.textView).text = b;
            }
            else if(findViewById<CheckBox>(R.id.cbox3).isChecked == true) {
                findViewById<TextView>(R.id.textView).text = c;
            }
            else if(findViewById<CheckBox>(R.id.cbox4).isChecked == true) {
                findViewById<TextView>(R.id.textView).text = d;
            }
            else if(findViewById<CheckBox>(R.id.cbox5).isChecked == true) {
                findViewById<TextView>(R.id.textView).text = e;
            }
        }
    }
}