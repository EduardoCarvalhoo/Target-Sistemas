package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fibonacciSequence()
        reverseWords()
    }

    private fun fibonacciSequence() {
        val input = 15
        var sum: Int
        var t1 = 0
        var t2 = 1

        println("A sequência de Fibonacci tem $input termos:")

        for (i in 0..input) {
            print("$t1 ")
            sum = t1 + t2
            t1 = t2
            t2 = sum
        }
        println(t1)
    }


    private fun reverseWords() {
        val name = "Empresa"
        var reverse = ""

        for (i in name.length - 1 downTo 0) {
            reverse += name[i].toString()
        }
        println(reverse)
    }
}