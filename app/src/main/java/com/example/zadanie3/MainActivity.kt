package com.example.zadanie3

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.zadanie3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var clickCount = 0


    fun checkAND(A:Int, B:Int)
    {
        binding.andOUT.text = A.and(B).toString()
    }

    fun checkNAND(A:Int, B:Int)
    {
        var result = A.and(B)
        if (result == 1) binding.nandOUT.text = "0"
        else binding.nandOUT.text = "1"
    }

    fun checkOR(A:Int, B:Int)
    {
        binding.orOUT.text = A.or(B).toString()
    }

    fun checkNOR(A:Int, B:Int)
    {
        var result = A.or(B)
        if (result == 1) binding.norOUT.text = "0"
        else binding.norOUT.text = "1"
    }

    fun checkXOR(A:Int, B:Int)
    {
        binding.xorOUT.text = A.xor(B).toString()
    }

    fun checkXNOR(A:Int, B:Int)
    {
        var result = A.xor(B)
        if (result == 1) binding.xnorOUT.text = "0"
        else binding.xnorOUT.text = "1"
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContentView(binding.root)

        binding.andA.setOnClickListener{
            checkAND(binding.andA.text.toString().toInt(), binding.andB.text.toString().toInt())
        }
        binding.andB.setOnClickListener{
            checkAND(binding.andA.text.toString().toInt(), binding.andB.text.toString().toInt())
        }
        binding.nandA.setOnClickListener{
            checkNAND(binding.nandA.text.toString().toInt(), binding.nandB.text.toString().toInt())
        }
        binding.nandB.setOnClickListener{
            checkNAND(binding.nandA.text.toString().toInt(), binding.nandB.text.toString().toInt())
        }
        binding.orA.setOnClickListener{
            checkOR(binding.orA.text.toString().toInt(), binding.orB.text.toString().toInt())
        }
        binding.orB.setOnClickListener{
            checkOR(binding.orA.text.toString().toInt(), binding.orB.text.toString().toInt())
        }
        binding.norA.setOnClickListener{
            checkNOR(binding.norA.text.toString().toInt(), binding.norB.text.toString().toInt())
        }
        binding.norB.setOnClickListener{
            checkNOR(binding.norA.text.toString().toInt(), binding.norB.text.toString().toInt())
        }
        binding.xorA.setOnClickListener{
            checkXOR(binding.xorA.text.toString().toInt(), binding.xorB.text.toString().toInt())
        }
        binding.xorB.setOnClickListener{
            checkXOR(binding.xorA.text.toString().toInt(), binding.xorB.text.toString().toInt())
        }
        binding.xnorA.setOnClickListener{
            checkXNOR(binding.xnorA.text.toString().toInt(), binding.xnorB.text.toString().toInt())
        }
        binding.xnorB.setOnClickListener{
            checkXNOR(binding.xnorA.text.toString().toInt(), binding.xnorB.text.toString().toInt())
        }



    }
}