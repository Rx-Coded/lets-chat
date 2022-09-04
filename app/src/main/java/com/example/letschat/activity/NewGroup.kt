package com.example.letschat.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.letschat.R
import com.example.letschat.adapter.ListOfFriendsAdapter


// The NewGroup is a new activity created for the menu item New Group

class NewGroup : AppCompatActivity() {
    // An initialization of the variable recyclerView which stated the type of value it would receive as the code progresses.
    private  lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_group)
        // Instantiation of the variable recyclerView inorder to make the recyclerView accessible from the view group.
         recyclerView = findViewById(R.id.listOfFriends)

        //This is an instance of the ListOfFriendsAdapter

        recyclerView.adapter = ListOfFriendsAdapter(this)

        //To enable the recyclerView show the next line of code.

        recyclerView.layoutManager = LinearLayoutManager(this)

        //To add a line decoration after each user item.

       val decor = (DividerItemDecoration(this,RecyclerView.VERTICAL))
        recyclerView.addItemDecoration(decor)

    }

}