package com.devinitive.cesarchretien.firstapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one.setOnClickListener {
            calculate.append("1")
        }

        two.setOnClickListener {
            calculate.append("2")
        }

        three.setOnClickListener {
            calculate.append("3")
        }

        four.setOnClickListener {
            calculate.append("4")
        }

        five.setOnClickListener {
            calculate.append("5")
        }

        six.setOnClickListener {
            calculate.append("6")
        }

        seven.setOnClickListener {
            calculate.append("7")
        }

        eight.setOnClickListener {
            calculate.append("8")
        }

        nine.setOnClickListener {
            calculate.append("9")
        }

        zero.setOnClickListener {
            calculate.append("0")
        }

        plus.setOnClickListener {
            calculate.append(" + ")
        }

        minus.setOnClickListener {
            calculate.append(" - ")
        }

        times.setOnClickListener {
            calculate.append(" * ")
        }

        divide.setOnClickListener {
            calculate.append(" / ")
        }
    }
}
