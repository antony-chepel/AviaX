package com.perfect.eleven.football.manager.to.ygdg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.perfect.eleven.football.manager.to.databinding.ActivityUisjdxBinding
import kotlin.random.Random

class Uisjdx : AppCompatActivity() {
    private lateinit var isadosdsadi : ActivityUisjdxBinding
    var shshadaj = 0
    var apsoalds = 0
    var vhvjcj = 0
    private var suaduusdi: CountDownTimer? = null
    private var ixzcozk: CountDownTimer? = null
    private var third_countr: CountDownTimer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        isadosdsadi = ActivityUisjdxBinding.inflate(layoutInflater)
        setContentView(isadosdsadi.root)


        if(shshadaj != 1) {
            isadosdsadi.ssaoo.setOnClickListener {
                sudhsd()
            }
        }

        if(apsoalds != 1) {
            isadosdsadi.apsol.setOnClickListener {
                uudfgfdgdgd()
            }
        }

        if(vhvjcj != 1) {
            isadosdsadi.vkozox.setOnClickListener {
                jdfg()
            }
        }


    }



    private fun sudhsd() = with(isadosdsadi){
        var xlzoc = 0
        suaduusdi?.cancel()
        suaduusdi = object : CountDownTimer(5000,100){
            override fun onTick(millisUntilFinished: Long) {
                xlzoc++
                shshadaj = 1
                ssaoo.alpha = 0.7f
                if(xlzoc>7)xlzoc = 0
                uchaus.text = Kolxzca.listbonus_avx[xlzoc]
                vlxco.text = Kolxzca.listprize_avx[xlzoc]

            }

            override fun onFinish() {
                uchaus.text = Kolxzca.listbonus_avx[Random.nextInt(8)]
                vlxco.text = Kolxzca.listprize_avx[Random.nextInt(8)]

                if(shshadaj==1 && apsoalds==1 && vhvjcj == 1){
                    startActivity(Intent(this@Uisjdx,Losjcnsa::class.java))
                }


            }

        }.start()

    }


    private fun uudfgfdgdgd() = with(isadosdsadi){
        var kxczj = 0
        ixzcozk?.cancel()
        ixzcozk = object : CountDownTimer(5000,100){
            override fun onTick(millisUntilFinished: Long) {
                kxczj++
                apsoalds = 1
                apsol.alpha = 0.7f
                if(kxczj>7)kxczj = 0
                osado.text = Kolxzca.listrandom_avx[kxczj]
                vlxco.text = Kolxzca.listprize_avx[kxczj]

            }

            override fun onFinish() {
                osado.text = Kolxzca.listrandom_avx[Random.nextInt(8)]
                vlxco.text = Kolxzca.listprize_avx[Random.nextInt(8)]
                if(shshadaj==1 && apsoalds==1 && vhvjcj == 1){
                    startActivity(Intent(this@Uisjdx,Losjcnsa::class.java))
                }


            }

        }.start()

    }

    private fun jdfg() = with(isadosdsadi){
        var pasdosdko = 0
        third_countr?.cancel()
        third_countr = object : CountDownTimer(5000,100){
            override fun onTick(millisUntilFinished: Long) {
                pasdosdko++
                vhvjcj = 1
                vkozox.alpha = 0.7f
                if(pasdosdko>7)pasdosdko = 0
                woso.text = Kolxzca.listpower_avx[pasdosdko]
                vlxco.text = Kolxzca.listprize_avx[pasdosdko]

            }

            override fun onFinish() {
                woso.text = Kolxzca.listpower_avx[Random.nextInt(8)]
                vlxco.text = Kolxzca.listprize_avx[Random.nextInt(8)]
                if(shshadaj==1 && apsoalds==1 && vhvjcj == 1){
                    startActivity(Intent(this@Uisjdx,Losjcnsa::class.java))
                }


            }

        }.start()

    }

    override fun onDestroy() {
        super.onDestroy()
        suaduusdi?.cancel()
        ixzcozk?.cancel()
        third_countr?.cancel()
    }
}