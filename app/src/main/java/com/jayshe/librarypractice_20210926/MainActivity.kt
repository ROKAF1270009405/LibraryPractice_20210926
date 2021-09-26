package com.jayshe.librarypractice_20210926

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.gun0912.tedpermission.PermissionListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        callBtn.setOnClickListener {

//            권한 획득 여부에 따른 행동 방안 정리.

            val pl = object : PermissionListener {

                override fun onPermissionGranted() {
//                권한이 OK 되었을때 할 일
//                실제로 전화를 걸자

                    //            Intent(4) 바로 전화 연결 -> CALL 액션

                    val myUri = Uri.parse("Tel : 010-5555-6666")
                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)


                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
//                권한이 거절되었을때. => 보통 토스트
                    Toast.makeText(this@MainActivity, "권한이 거절되어 전화 연결이 불가합니다.", Toast.LENGTH_SHORT)
                        .show()
                }

            }


        }

        profileImg.setOnClickListener {

//

            val myIntent = Intent(this, ViewPhotoActivity::class.java)

            startActivity(myIntent)

        }

    }
}