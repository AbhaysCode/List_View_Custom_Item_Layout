package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var userData:ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val listView = binding.listView
        val name = arrayListOf<String>("Henry Gayle","Ricky ","Don Bradman","Collin ","Srinavasan")
        val lastMsgTime = arrayListOf<String>("07:45 AM","08:00 PM","08:30 AM","12:01 AM","09:23 AM")
        val lastMsg = arrayListOf<String>("When is it Starting ?","BGT Gone..","I got the Highest ","CSK Will Win","Am i In ?")
        val imgId = intArrayOf(R.drawable.user1,R.drawable.user2,R.drawable.user3,R.drawable.user4,R.drawable.user5)
        userData = ArrayList()
        for (pos in name.indices){
            userData.add(User(name[pos], lastMsg[pos], lastMsgTime[pos],imgId[pos]))
        }
        listView.adapter  = UserAdapter(this,userData)
    }
}