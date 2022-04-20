package com.heltonbustos.ejemploviewmodelmvvm02.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.heltonbustos.ejemploviewmodelmvvm02.R
import com.heltonbustos.ejemploviewmodelmvvm02.databinding.ActivityMainBinding
import com.heltonbustos.ejemploviewmodelmvvm02.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        observar()

        binding.btnLista.setOnClickListener {
            mainViewModel.cargarFrutas1ROOM()
        }

        binding.btnAgregarOtraFruta.setOnClickListener {
            mainViewModel.cargarFrutas2RETROFIT()
        }
    }

    private fun observar() {
        mainViewModel.getListaData().observe(this, Observer {
            for(fruta in it){
                Log.d("FRUTA", fruta.nombreFruta)
            }

            for((index, value) in it.withIndex()){
                Log.d("FRUTA $index", value.nombreFruta)
            }
        })
    }
}