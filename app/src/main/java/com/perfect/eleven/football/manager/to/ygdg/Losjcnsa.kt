package com.perfect.eleven.football.manager.to.ygdg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.perfect.eleven.football.manager.to.databinding.ActivityLosjcnsaBinding
import kotlin.random.Random

class Losjcnsa : AppCompatActivity() {
    private lateinit var kisad : ActivityLosjcnsaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        kisad = ActivityLosjcnsaBinding.inflate(layoutInflater)
        setContentView(kisad.root)
        kisad.oxzck.text = Kolxzca.listtotal_avx[Random.nextInt(6)]
        kisad.qqosp.setOnClickListener {
            startActivity(Intent(this,Uisjdx::class.java))
        }
    }
}