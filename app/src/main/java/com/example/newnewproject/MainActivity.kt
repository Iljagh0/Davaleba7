package com.example.newnewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import com.example.newnewproject.api.ReqResData
import com.example.newnewproject.api.RestClient
import com.example.newnewproject.api.User
import com.example.newnewproject.api.services.ReqResService
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RestClient.initClient()
        RestClient.reqResService.getUsers(2).enqueue(object: Callback<ReqResService<List<User>>> {
            override fun onResponse(
                call: Call<ReqResData<List<User>>>,
                response: Response<ReqResData<List<User>>>
            ){
                if (response.isSuccessful) {
                    val data = response.body()
                }
            }
        })
    }
}