package com.kofigyan.movetracker.util


import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import androidx.lifecycle.*


class ConnectivityChecker(private val connectivityManager: ConnectivityManager) :
    LifecycleObserver {

    private var monitoringConnectivity = false

    private var _connectedStatus = MutableLiveData<Boolean>()
    val connectedStatus: LiveData<Boolean>
        get() = _connectedStatus


    private val connectivityCallback = object: ConnectivityManager.NetworkCallback(){
        override fun onAvailable(network: Network) {
            super.onAvailable(network)
        }

        override fun onLost(network: Network) {
            super.onLost(network)
        }

    }
}