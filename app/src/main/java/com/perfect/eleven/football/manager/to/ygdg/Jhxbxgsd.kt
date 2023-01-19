package com.perfect.eleven.football.manager.to.ygdg

import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import com.perfect.eleven.football.manager.to.ygdg.Yukxok.Companion.qowkoaskmoa
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import com.perfect.eleven.football.manager.to.ygdg.Yukxok.Companion.vkicxoo
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore
import android.util.Log
import com.perfect.eleven.football.manager.to.ygdg.Yukxok.Companion.qposllc
import android.webkit.*

import com.perfect.eleven.football.manager.to.R
import com.perfect.eleven.football.manager.to.databinding.ActivityJhxbxgsdBinding
import com.perfect.eleven.football.manager.to.ygdg.Yukxok.Companion.xklxlzc
import com.perfect.eleven.football.manager.to.ygdg.Yukxok.Companion.lsopxzkc
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import com.perfect.eleven.football.manager.to.ygdg.Yukxok.Companion.rstast
import java.io.IOException

class Jhxbxgsd : AppCompatActivity() {
    var aosplxmczxkc: ValueCallback<Array<Uri>>? = null
    lateinit var iskxnzcsa: ActivityJhxbxgsdBinding
    var woszxk: String? = null
    private val eoposxkz = 1
    lateinit var vhsux: WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        iskxnzcsa = ActivityJhxbxgsdBinding.inflate(layoutInflater)
        setContentView(iskxnzcsa.root)

        vhsux = iskxnzcsa.ccvjjd
        Snackbar.make(
            iskxnzcsa.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val qopslxzm = CookieManager.getInstance()
        qopslxzm.setAcceptCookie(true)
        qopslxzm.setAcceptThirdPartyCookies(vhsux, true)
        ropdksmkzx()
        val aoskx: Activity = this
        vhsux.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(qosp: WebView, hkci: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(hkci)) {
                        return false
                    }
                    if (bhjcoxkvxc(hkci)) {

                        val wisommcx = Intent(Intent.ACTION_VIEW)
                        wisommcx.data = Uri.parse(hkci)
                        startActivity(wisommcx)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                qosp.loadUrl(hkci)
            }


            override fun onPageFinished(isjc: WebView, rosap: String) {
                super.onPageFinished(isjc, rosap)
                bhjcxcosaosod(rosap)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(aoskx, description, Toast.LENGTH_SHORT).show()
            }


        }
        vhsux.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                syuuusah: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                aosplxmczxkc?.onReceiveValue(null)
                aosplxmczxkc = filePathCallback
                var aeookxzk: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (aeookxzk!!.resolveActivity(packageManager) != null) {


                    var foclxi: File? = null
                    try {
                        foclxi = bvfgcix()
                        aeookxzk.putExtra("PhotoPath", woszxk)
                    } catch (ex: IOException) {

                    }

                    if (foclxi != null) {
                        woszxk = "file:" + foclxi.absolutePath
                        aeookxzk.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(foclxi)
                        )
                    } else {
                        aeookxzk = null
                    }
                }
                val ghvjnvmx = Intent(Intent.ACTION_GET_CONTENT)
                ghvjnvmx.addCategory(Intent.CATEGORY_OPENABLE)
                ghvjnvmx.type = "image/*"
                val cfskzx: Array<Intent?> =
                    aeookxzk?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val wosplxzllxzcmm = Intent(Intent.ACTION_CHOOSER)
                wosplxzllxzcmm.putExtra(Intent.EXTRA_INTENT, ghvjnvmx)
                wosplxzllxzcmm.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_chooser))
                wosplxzllxzcmm.putExtra(Intent.EXTRA_INITIAL_INTENTS, cfskzx)
                startActivityForResult(
                    wosplxzllxzcmm, eoposxkz
                )
                return true
            }

            @Throws(IOException::class)
            private fun bvfgcix(): File {
                var mlocpx = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!mlocpx.exists()) {
                    mlocpx.mkdirs()
                }

                mlocpx =
                    File(mlocpx.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return mlocpx
            }

        }

        vhsux.loadUrl(udimvcoxmxcv())
    }




    private var loxpcmx = false
    override fun onBackPressed() {


        if (vhsux.canGoBack()) {
            if (loxpcmx) {
                vhsux.stopLoading()
                vhsux.loadUrl(gfhdusadas)
            }
            this.loxpcmx = true
            vhsux.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                loxpcmx = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    private fun ropdksmkzx() {
        val tfybxzc = vhsux.settings
        tfybxzc.javaScriptEnabled = true

        tfybxzc.builtInZoomControls = true
        tfybxzc.setSupportZoom(true)
        tfybxzc.javaScriptCanOpenWindowsAutomatically = true
        tfybxzc.setSupportMultipleWindows(false)

        tfybxzc.displayZoomControls = false


        tfybxzc.loadWithOverviewMode = true
        tfybxzc.pluginState = WebSettings.PluginState.ON
        tfybxzc.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        tfybxzc.setAppCacheEnabled(true)

        tfybxzc.allowContentAccess = true

        tfybxzc.useWideViewPort = true

        tfybxzc.allowFileAccess = true

        tfybxzc.domStorageEnabled = true
        tfybxzc.userAgentString = tfybxzc.userAgentString.replace("; wv", "")



    }

    private fun tdyuixziijczic(asdolzx: String) {
        OneSignal.setExternalUserId(
            asdolzx,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(xksoldask: JSONObject) {
                    try {
                        if (xksoldask.has("push") && xksoldask.getJSONObject("push").has("success")) {
                            val njicijcxv = xksoldask.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $njicijcxv"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (xksoldask.has("email") && xksoldask.getJSONObject("email").has("success")) {
                            val kiojxbnsd =
                                xksoldask.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $kiojxbnsd"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (xksoldask.has("sms") && xksoldask.getJSONObject("sms").has("success")) {
                            val dyfuimjxc = xksoldask.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $dyfuimjxc"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    override fun onActivityResult(toos: Int, bhjckxkvvxc: Int, ckcixoo: Intent?) {
        if (toos != eoposxkz || aosplxmczxkc == null) {
            super.onActivityResult(toos, bhjckxkvvxc, ckcixoo)
            return
        }
        var rodosppd: Array<Uri>? = null

        if (bhjckxkvvxc == AppCompatActivity.RESULT_OK) {
            if (ckcixoo == null || ckcixoo.data == null) {
                rodosppd = arrayOf(Uri.parse(woszxk))
            } else {
                val ssiasodksoa = ckcixoo.dataString
                if (ssiasodksoa != null) {
                    rodosppd = arrayOf(Uri.parse(ssiasodksoa))
                }
            }
        }
        aosplxmczxkc?.onReceiveValue(rodosppd)
        aosplxmczxkc = null
    }



    private fun bhjcoxkvxc(uri: String): Boolean {

        val eosppx = packageManager
        try {

            eosppx.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)


            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }



    var gfhdusadas = ""
    fun bhjcxcosaosod(mmcjvnusa: String?) {
        if (!mmcjvnusa!!.contains("t.me")) {

            if (gfhdusadas == "") {
                gfhdusadas = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    mmcjvnusa
                ).toString()

                val guid = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val eeosoao = guid.edit()
                eeosoao.putString("SAVED_URL", mmcjvnusa)
                eeosoao.apply()
            }
        }
    }




    @SuppressLint("SuspiciousIndentation")
    private fun udimvcoxmxcv(): String {

        val bhudiicx = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)


        val wposlmclxz: String? = Hawk.get(vkicxoo, "null")
        val gfyuz: String? = Hawk.get(qposllc, "null")
        val blopn:String? = Hawk.get(rstast, "null")


        val yshx: String? = Hawk.get(xklxlzc, "null")
        val wposlmc = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        val wospcxz: String = Hawk.get(lsopxzkc, "null")
        AppsFlyerLib.getInstance().setCollectAndroidID(true)



        val qposlmx = "sub_id_6="
        val bhjcix = "sub_id_4="
        val rysuix = "naming"
        val hjiockzs = "sub_id_1="
        val lposxjkn = "deviceID="
        val wospx = "ad_id="

        val bkfi = "sub_id_5="

        val qposlslmcnasn = Build.VERSION.RELEASE
        val ghvc = "com.perfect.eleven.football.manager.to"

        val reoslx = Hawk.get(qowkoaskmoa, "null")
        var apolx: String = ""
        if (wospcxz == "1"){
            apolx =
                "$reoslx$hjiockzs$blopn&$lposxjkn$wposlmc&$wospx$yshx&$bhjcix$ghvc&$bkfi$qposlslmcnasn&$qposlmx$rysuix"
            tdyuixziijczic(wposlmc.toString())
        } else {
            apolx =
                "$reoslx$lposxjkn$wposlmclxz&$wospx$gfyuz&$bhjcix$ghvc&$bkfi$qposlslmcnasn&$qposlmx$rysuix"
            tdyuixziijczic(wposlmclxz.toString())
        }

        Log.d("TESTAG", "Test Result $apolx")
        return bhudiicx.getString("SAVED_URL", apolx).toString()
    }



}