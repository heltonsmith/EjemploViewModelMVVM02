package com.heltonbustos.ejemploviewmodelmvvm02.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.heltonbustos.ejemploviewmodelmvvm02.repository.Frutas
import com.heltonbustos.ejemploviewmodelmvvm02.repository.FrutasInteractor

class MainViewModel: ViewModel() {

    private val lista: MutableLiveData<List<Frutas>> = MutableLiveData()
    private val interactor = FrutasInteractor()

    fun setListData(listaFrutas: List<Frutas>){
        lista.value = listaFrutas
    }

    fun getListaData(): LiveData<List<Frutas>>{
        return lista
    }

    fun cargarFrutas1ROOM(){
        setListData(interactor.obtenerFrutasROOM())
    }

    fun cargarFrutas2RETROFIT(){
        setListData(interactor.obtenerFrutasAPIRETROFIT())
    }

}