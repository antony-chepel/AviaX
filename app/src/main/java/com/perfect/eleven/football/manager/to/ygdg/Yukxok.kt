package com.perfect.eleven.football.manager.to.ygdg

import android.app.Application
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import java.util.*

class Yukxok : Application() {
    companion object {


        const val nvjckv = "4a62a503-a3d6-42c0-9717-66934c2489ea"
        var qowkoaskmoa = "link"
        const val ysuaixnc = "07492967834909740312"
        var xklxlzc: String? = ""
        const val lsopxzkc = "appsChecker"
        var vkicxoo: String? = "myID"
        var rstast: String? = "c11"
        var qposllc: String? = "instID"


    }

    override fun onCreate() {
        super.onCreate()

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(nvjckv)

        Hawk.init(this).build()
        val isdaokoxcz = getSharedPreferences("PREFS_NAME", 0)

        val gfyfus = MyTracker.getTrackerParams()
        val ckvkcv = MyTracker.getTrackerConfig()
        val wusiadkoas = MyTracker.getInstanceId(this)
        ckvkcv.isTrackingLaunchEnabled = true
        if (isdaokoxcz.getBoolean("my_first_time", true)) {
            val blcxooakoskod = UUID.randomUUID().toString()
            gfyfus.setCustomUserId(blcxooakoskod)
            Hawk.put(vkicxoo, blcxooakoskod)
            Hawk.put(qposllc, wusiadkoas)
            isdaokoxcz.edit().putBoolean("my_first_time", false).apply()

        } else {
            val hyuxizi = Hawk.get(vkicxoo, "null")
            gfyfus.setCustomUserId(hyuxizi)
        }
        MyTracker.initTracker(ysuaixnc, this)

    }
}