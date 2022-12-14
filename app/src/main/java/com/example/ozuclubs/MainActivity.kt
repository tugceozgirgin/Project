package com.example.ozuclubs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.ozuclubs.fragments.RecyclerViewFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(RecyclerViewFragment())
    }

    private fun replaceFragment(recyclerViewFragment: Fragment) {
        val fragmentManager =supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,recyclerViewFragment)
        fragmentTransaction.commit()

    }
}