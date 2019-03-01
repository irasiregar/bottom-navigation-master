//package com.example.projectdesalauwba.ui
//
//import android.os.Bundle
//import android.support.design.widget.BottomNavigationView
//import android.support.v4.app.Fragment
//import android.support.v4.app.FragmentManager
//import android.support.v7.app.AppCompatActivity
//import android.support.v7.widget.Toolbar
//import android.view.MenuItem
//import com.example.projectdesalauwba.R
//import com.example.projectdesalauwba.extension.*
//import com.example.projectdesalauwba.helper.*
//
//
//class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
//
//    private val KEY_POSITION = "keyPosition"
//
//    private var navPosition: BottomNavigationPosition = BottomNavigationPosition.HOME
//
//    private lateinit var toolbar: Toolbar
//
//    private lateinit var bottomNavigation: BottomNavigationView
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        restoreSaveInstanceState(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        toolbar = findViewById(R.id.toolbar)
//        bottomNavigation = findViewById(R.id.bottom_navigation)
//        setSupportActionBar(toolbar)
//        initBottomNavigation()
//        initFragment(savedInstanceState)
//    }
//
//    override fun onSaveInstanceState(outState: Bundle?) {
//        // Store the current navigation position.
//        outState?.putInt(KEY_POSITION, navPosition.id)
//        super.onSaveInstanceState(outState)
//    }
//
//    override fun onNavigationItemSelected(item: MenuItem): Boolean {
//        navPosition = findNavigationPositionById(item.itemId)
//        return switchFragment(navPosition)
//    }
//
//    private fun restoreSaveInstanceState(savedInstanceState: Bundle?) {
//        // Restore the current navigation position.
//        savedInstanceState?.also {
//            val id = it.getInt(KEY_POSITION, BottomNavigationPosition.HOME.id)
//            navPosition = findNavigationPositionById(id)
//        }
//    }
//
//    private fun initBottomNavigation() {
//        // This is required in Support Library 27 or lower.
//        // bottomNavigation.disableShiftMode()
//        bottomNavigation.active(navPosition.position)   // Extension function
//        bottomNavigation.setOnNavigationItemSelectedListener(this)
//    }
//
//    private fun initFragment(savedInstanceState: Bundle?) {
//        savedInstanceState ?: switchFragment(BottomNavigationPosition.HOME)
//    }
//
//    /**
//     * Immediately execute transactions with FragmentManager#executePendingTransactions.
//     */
//    private fun switchFragment(navPosition: BottomNavigationPosition): Boolean {
//        return supportFragmentManager.findFragment(navPosition).let {
//            if (it.isAdded) return false
//            supportFragmentManager.detach() // Extension function
//            supportFragmentManager.attach(it, navPosition.getTag()) // Extension function
//            supportFragmentManager.executePendingTransactions()
//        }
//    }
//
//    private fun FragmentManager.findFragment(position: BottomNavigationPosition): Fragment {
//        return findFragmentByTag(position.getTag()) ?: position.createFragment()
//    }
//
//}
