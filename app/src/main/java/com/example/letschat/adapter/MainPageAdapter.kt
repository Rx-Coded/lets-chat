package com.example.letschat.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.letschat.fragment.CallFragment
import com.example.letschat.fragment.CameraFragment
import com.example.letschat.fragment.ChatFragment
import com.example.letschat.fragment.StatusFragment

//This Adapter is responsible for syncing the TabLayout and the ViewPager so that when  an option on the TabLayout is selected it can show the appropriate fragment that matches the TabLayout option.

class MainPageAdapter(fm: FragmentManager,lf:Lifecycle) : FragmentStateAdapter(fm,lf){

    //This returns the number of data passed to the adapter
    override fun getItemCount(): Int {
        return 4
    }

    //This provides the current position of the user on the TabLayout  then it returns the appropriate fragment.
    override fun createFragment(position: Int): Fragment {

        //The when condition is used to return the appropriate fragment based on the position.

        return when (position) {
            0 -> CameraFragment()

            1 -> ChatFragment()

            2 -> StatusFragment()

            3 -> CallFragment()

            else-> ChatFragment()
        }
    }

}