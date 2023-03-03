package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class UserAdapter(context: Context, var userData: ArrayList<User>): ArrayAdapter<User>(context,R.layout.listitem,userData) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.listitem,null)
        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val userName = view.findViewById<TextView>(R.id.tvName)
        val lastMsgTime = view.findViewById<TextView>(R.id.tvLastMsgTime)
        val lastMsg = view.findViewById<TextView>(R.id.tvLastMsg)
        image.setImageResource(userData[position].userDp)
        userName.text = userData[position].name
        lastMsgTime.text = userData[position].lastMsgTime
        lastMsg.text = userData[position].lastMsg
        return view
    }
}
