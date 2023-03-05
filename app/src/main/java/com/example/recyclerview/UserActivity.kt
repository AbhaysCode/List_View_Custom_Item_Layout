package com.example.recyclerview

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclerview.databinding.ActivityUserBinding


class UserActivity : AppCompatActivity() {
    lateinit var binding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val userName = intent.getStringExtra("name")
        val phoneNumber = intent.getStringExtra("phoneNumber")
        val imageRes = intent.getIntExtra("userImage",R.drawable.user1)
        binding.tvName.text = userName
        binding.tvPhoneNumber.text =phoneNumber
        binding.userImage.setImageResource(imageRes)
        binding.callBtn.setOnClickListener{
            val number = "tel:$phoneNumber"
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse(number)
            startActivity(intent)
        }
    }
}