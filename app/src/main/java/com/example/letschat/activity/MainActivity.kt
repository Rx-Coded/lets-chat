package com.example.letschat

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.letschat.activity.NewGroup
import com.example.letschat.adapter.MainPageAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.coroutines.NonCancellable.start

class MainActivity : AppCompatActivity() {
    //This is an initialization of the TabLayout
    private lateinit var tabLayout: TabLayout

    //This is an initialization of the Viewpager
    private lateinit var viewPager: ViewPager2

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //This finds the TabLayout by its Id and makes it accessible
        tabLayout = findViewById(R.id.tab)

        //This finds the ViewPager by its Id and makes it accessible
        viewPager = findViewById(R.id.viewPager)

        //To connect the ViewPager to the MainPageAdapter
        viewPager.adapter = MainPageAdapter(supportFragmentManager, lifecycle)

        //To connect the TabLayout to the ViewPager inorder to update the current fragment

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->

            // When condition  is used to set the name option on the TabLayout  based on the position

            when (position) {
                0 -> tab.icon = getDrawable(R.drawable.ic_camera_fragment)
                1 -> tab.text = "Chat"
                2 -> tab.text = "Status"
                3 -> tab.text = "Calls"
            }

        }.attach()

        //This sets the "Chat" as the start tab.

        viewPager.currentItem = 1

    }

    //This is responsible for making the menu items visible and also connects the menu page to the activity to make it visible to the user
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
    // This enables the user to be able to click on the option menu items

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // This acts as a filter to identify the particular menu item that was click so as to perform a specific action for each selected menu item.
        when (item.itemId) {
            R.id.search -> {

                return true
            }

            R.id.new_group -> {
                // Here the function goToNewGroup is called any time the New Group menu item is selected.
                goToNewGroup()

                return true
            }

            R.id.new_broadcast -> {
                // Here the function goToNewBroadCast is called any time the New Group menu item is selected.
                goToNewBroadCast()
                return true
            }

            R.id.linked_device -> {
                Toast.makeText(this, "Linked Devices Clicked", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.starred_messages -> {
                Toast.makeText(this, "Starred Messages Clicked", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.settings -> {
                Toast.makeText(this, "Settings  Clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> {
                return false
            }

        }
    }
    // The function is responsible for taking the user to the new Activity "New Group" when the search menu item is selected.

    private fun goToNewGroup() {
        // The Intent makes navigation from one activity to another possible. In this casa from Main Activity to New Group Activity
        // Intent is a class so here an object "i" of the intent class was created.
        val i = Intent(this, NewGroup ::class.java)
        // The start or startActivity  function is called inorder to achieve the navigation process

        startActivity(i)
    }


    private fun goToNewBroadCast(){
        // The Intent makes navigation from one activity to another possible. In this casa from Main Activity to New BroadCast Activity
        // Intent is a class so here an object "i" of the intent class was created.
        val i = Intent(this,NewBroadCastActivity::class.java)
        // The start or startActivity  function is called inorder to achieve the navigation process

        startActivity(i)
    }
    }
    //Note we went to the manifests folder where the new activity tag was and added two attributes;
    // i label; was responsible for giving the new activity a title "New Group"
    // ii parentActivityName; was responsible for returning the New group to the initial activity which was "main activity"
