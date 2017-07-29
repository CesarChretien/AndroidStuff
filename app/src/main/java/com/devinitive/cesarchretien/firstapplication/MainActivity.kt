package com.devinitive.cesarchretien.firstapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val stuff = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one.setOnClickListener {
            stuff.add("1")
            calculate.append("1")
        }

        two.setOnClickListener {
            stuff.add("2")
            calculate.append("2")
        }

        three.setOnClickListener {
            stuff.add("3")
            calculate.append("3")
        }

        four.setOnClickListener {
            stuff.add("4")
            calculate.append("4")
        }

        five.setOnClickListener {
            stuff.add("5")
            calculate.append("5")
        }


        six.setOnClickListener {
            stuff.add("6")
            calculate.append("6")
        }

        seven.setOnClickListener {
            stuff.add("7")
            calculate.append("7")
        }

        eight.setOnClickListener {
            stuff.add("8")
            calculate.append("8")
        }

        nine.setOnClickListener {
            stuff.add("9")
            calculate.append("9")
        }

        zero.setOnClickListener {
            stuff.add("0")
            calculate.append("0")
        }

        plus.setOnClickListener {
            stuff.add("+")
            calculate.append(" + ")
        }

        minus.setOnClickListener {
            stuff.add("-")
            calculate.append(" - ")
        }

        times.setOnClickListener {
            stuff.add("*")
            calculate.append(" * ")
        }

        divide.setOnClickListener {
            stuff.add("/")
            calculate.append(" / ")
        }

        decimal.setOnClickListener {
            stuff.add(".")
            calculate.append(".")
        }

        clear.setOnClickListener {
            stuff.clear()
            calculate.text = ""
        }

        equals.setOnClickListener {
            answer.text = calculate()
        }
    }

    fun calculate(): String {

        var num = ""

        val nums = ArrayList<Double>()
        val operators = ArrayList<String>()


        val regex = Regex("[0-9]+|\\.")

        stuff.forEach {
            if (it matches regex) {
                num += it
            } else {
                nums += num.toDouble()
                operators += it
                num = ""
            }
        }

        if (num matches Regex("[0-9.]+")) {
            nums += num.toDouble()
        }

        if (nums.isNotEmpty() && nums.size == operators.size + 1) {
            var res = nums[0]

            for (i in 1..nums.size - 1) {
                val newnum = nums[i]

                when (operators[i - 1]) {
                    "+" -> res += newnum
                    "-" -> res -= newnum
                    "/" -> res /= newnum
                    "*" -> res *= newnum
                }
            }

            return res.toString()
        }

        return "SYNTAX ERROR"
    }


}
