package com.internshala.bookhub.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import com.internshala.bookhub.fragment.AboutFragment
import com.internshala.bookhub.fragment.DashboardFragment
import com.internshala.bookhub.fragment.FavouritesFragment
import com.internshala.bookhub.fragment.ProfileFragment
import com.internshala.bookhub.R

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var coordinatorLayout: CoordinatorLayout
    private lateinit var toolbar: Toolbar
    private lateinit var frameLayout: FrameLayout
    private lateinit var navigationView: NavigationView

    var previousMenuItem: MenuItem? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawerLayout)
        coordinatorLayout = findViewById(R.id.coordinatorLayout)
        toolbar = findViewById(R.id.toolbar)
        frameLayout = findViewById(R.id.frameLayout)
        navigationView = findViewById(R.id.navigationView)
        
        setUpToolBar()
        openDashboard()

        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this@MainActivity,
            drawerLayout,
            R.string.open_drawer,
            R.string.close_drawer
        )

        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        navigationView.setNavigationItemSelectedListener {

            if (previousMenuItem != null){
                previousMenuItem?.isCheckable = false
            }

            it.isCheckable = true
            it.isChecked = true
            previousMenuItem = it

            when(it.itemId) {
                R.id.dashboard -> {
                     openDashboard()
                    drawerLayout.closeDrawers()
                 }
                R.id.favourites -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, FavouritesFragment())
                        .addToBackStack("Favourites")
                        .commit()

                    supportActionBar?.title = "Favourites"
                    drawerLayout.closeDrawers()
                }
                R.id.profile -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, ProfileFragment())
                        .addToBackStack("Profile")
                        .commit()

                    supportActionBar?.title = "Profile"
                    drawerLayout.closeDrawers()
                }
                R.id.aboutApp -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, AboutFragment())
                        .addToBackStack("About")
                        .commit()

                    supportActionBar?.title = "About"
                    drawerLayout.closeDrawers()
                }

            }
            return@setNavigationItemSelectedListener true
        }
    }

    private fun setUpToolBar(){
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Toolbar Title"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        if (id === android.R.id.home){
            drawerLayout.openDrawer(GravityCompat.START)
        }

        return super.onOptionsItemSelected(item)
    }

    fun openDashboard(){
        val fragment = DashboardFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout, fragment)
        transaction.commit()
        supportActionBar?.title = "Dashboard"
        navigationView.setCheckedItem(R.id.dashboard)
    }

    override fun onBackPressed() {
        val frag = supportFragmentManager.findFragmentById(R.id.frameLayout)

        when(frag){
            !is DashboardFragment -> openDashboard()

            else -> super.onBackPressed()
        }
    }
}