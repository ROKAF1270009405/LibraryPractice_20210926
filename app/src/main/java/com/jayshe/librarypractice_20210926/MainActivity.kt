package com.jayshe.librarypractice_20210926

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        callBtn.setOnClickListener { 
            
//            Intent(4) 바로 전화 연결 -> CALL 액션

            val myUri = Uri.parse("Tel : 010-5555-6666")
            val myIntent = Intent( Intent.ACTION_CALL, myUri)
            startActivity(myIntent)


        }
        
        profileImg.setOnClickListener {

//

            val myIntent = Intent(this,ViewPhotoActivity::class.java)

            startActivity(myIntent)

        }

    }
}