package com.example.PowerManager.THERMALstatusapi

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PowerManager
import android.util.Log
import com.example.thermalstatusapi.R
import com.google.android.gms.wallet.PaymentsClient
import com.google.android.gms.wallet.Wallet
import com.google.android.gms.wallet.WalletConstants

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val powerManager = getSystemService(Context.POWER_SERVICE)
                as PowerManager


        powerManager.addThermalStatusListener {


        }

        val result = when (powerManager.currentThermalStatus) {
            PowerManager.THERMAL_STATUS_NONE -> {

            }
            PowerManager.THERMAL_STATUS_LIGHT
            -> {

            }
            PowerManager.THERMAL_STATUS_MODERATE
            -> {

            }
            PowerManager.THERMAL_STATUS_SEVERE
            -> {

            }
            PowerManager.THERMAL_STATUS_CRITICAL
            -> {

            }
            PowerManager.THERMAL_STATUS_EMERGENCY
            -> {

            }
            PowerManager.THERMAL_STATUS_SHUTDOWN
            -> {

            }
            else -> -1
        }
    }


}