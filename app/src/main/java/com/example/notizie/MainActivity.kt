package com.example.notizie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun getURL(): String {

    }


    fun sendRequest(v: View) {
        val queue= Volley.newRequestQueue(this)
        val stringRequest= StringRequest(Request.Method.GET,getURL(),
            {
                rs ->
                try {
                    extractResult(rs)
                }
                catch (e:Exception){
                    e.printStackTrace()
                    Log.d("Notiziario",e.message ?: "Errore!!")

                }
            },
            {
                er -> Toast.makeText(this,er.message,Toast.LENGTH_LONG).show()
            })
        queue.add(stringRequest)
    }

fun extractResult(s:String) {

}
}

