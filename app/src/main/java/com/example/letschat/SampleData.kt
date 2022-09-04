package com.example.letschat

import com.example.letschat.model.Messages
import com.example.letschat.model.User

// This class is functioning as a data base for the NewGroup since we would not be connecting to a software service
class SampleData {
        val LIST_OF_FRIENDS :List<User> = listOf(
            User("Jennifer","The babe is a badass developer"),
            User("Amaka","Human Resource manager wey sabi"),
            User("Bhami","Social media expert wey dey generate trafic"),
            User("Loxy","Videographer wey dey make statement"),
            User("Ivan","Tech bro wey dey design scatter"),
            User("Ifeoma","Industrial pharmacist wey dey see plenty money")
        )
    }
//This is functioning as a data base for the Chat Fragment

class SampleMessages{
    val LIST_OF_MESSAGES :List<Messages> = listOf(
        Messages("Jennifer"," 19:00","Where are you off to?"),
    Messages("Amaka","13:00","Can you drop by at the house? i need to talk"),
        Messages("Bhami","10:24","The dispatch rider is down stair"),
        Messages("Loxy","16:25","I can't hear you go to somewhere less busy biko"),
        Messages("Ivan","5:00","You no go like send funds ni?"),
        Messages("Ifeoma","17:00", "Biko come to my hostel")
    )
}

