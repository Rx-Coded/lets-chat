package com.example.letschat.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.letschat.R
import com.example.letschat.SampleMessages
import com.example.letschat.model.Messages

// This adapter class is responsible for communication between two different interfaces in this case the interfaces were (SampleMessages & RecyclerView) which ensured the replication of a particular user interface multiple times.
class ListOfMessagesAdapter(val context:Context) : RecyclerView.Adapter<ListOfMessagesAdapter.MegViewHolder>() {

    //To make the components of the SampleMessages() class  accessible we created an instance(object) sampleMessages
    private  val sampleMessage = SampleMessages()


    //To make the LIST_OF_MESSAGES variable that was in the SampleMessages()  accessible an instance(object) of the list was created
private val listOfMessages :List<Messages> = sampleMessage.LIST_OF_MESSAGES



// The Adapter class is an abstract class and the three functions below are expected to be over ridden.


    //This function returns an item view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MegViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.list_of_friends_layout, parent, false)
        return MegViewHolder(itemView)
    }

    // This function receives an itemView and  is responsible for  making the itemView accessible and loops through the list of users provided in the SampleMessages()

    override fun onBindViewHolder(holder: MegViewHolder, position: Int) {
       holder.userName.text = listOfMessages[position].userName
       holder.message.text = listOfMessages[position].message
    }

    // This functions   returns the number of times the replication of the UI(list_of_friends_layout) should occur depending on the number of users in the SampleMessages()
    override fun getItemCount(): Int {
        return listOfMessages.size
    }

    class MegViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //To make the components of the list_of_friends_layout.xml accessible inorder to have one time reference to the UI

        // So for each user in the list the username and message is made available.

        val userName:TextView = itemView.findViewById(R.id.userName)
        val message :TextView = itemView.findViewById(R.id.status)
    }


}