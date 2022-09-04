package com.example.letschat.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.letschat.adapter.ListOfFriendsAdapter
import com.example.letschat.R
import com.example.letschat.adapter.ListOfMessagesAdapter

class ChatFragment : Fragment() {

    // An initialization of the ChatRecyclerView
    private lateinit var chatRecycler :RecyclerView

    // OnCreateView is called when the fragment is being created.
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }
//This function connects the chatRecycler and the RecyclerView in the ChatFragment xml together.
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //To make RecyclerView accessible from the viewGroup by the Id assigned to it at creation.
        chatRecycler = view.findViewById(R.id.chatRecycler)

    //To connect the RecyclerView to the ListOfMessagesAdapter
    chatRecycler.adapter= ListOfMessagesAdapter(requireContext())
    chatRecycler.layoutManager = LinearLayoutManager(requireContext())
    }

}