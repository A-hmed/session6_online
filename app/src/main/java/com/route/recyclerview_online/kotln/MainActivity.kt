package com.route.recyclerview_online.kotln

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.route.recyclerview_online.R
import com.route.recyclerview_online.SettingsActivity
import java.text.FieldPosition
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var settingsRecyclerView: RecyclerView
    lateinit var settingsAdapter: SettingsAdapter
    lateinit var list : ArrayList<SettingsItem>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        fillList()

        settingsRecyclerView = findViewById(R.id.settings_recycler_view)
        settingsAdapter = SettingsAdapter(list)
        settingsAdapter.onIconClick = object : SettingsAdapter.OnItemClickListener{
            override fun onItemClick(item :SettingsItem, position: Int) {
                Log.e("onItemCLick", "clicked an item $position")
            }
        }
        settingsRecyclerView.adapter = settingsAdapter


    }
    fun fillList() {
        list = ArrayList<SettingsItem>()
        list.add(SettingsItem(title = "Wifi",subtitle =  "Wifi , mobile and data usages",imageId =  R.drawable.ic_wifi))
        list.add(SettingsItem(title="Battery", subtitle = "100%",imageId= R.drawable.ic_battery))
        for (i in 3..99) {
            list.
            add(SettingsItem(title = "item $i", subtitle = "subtitle $i"))
        }
    }
}