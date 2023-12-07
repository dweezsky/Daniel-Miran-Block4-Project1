package com.miran.daniel.block4.p1.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView


class MainActivity2 : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        bottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnItemSelectedListener{menuItem ->
            when(menuItem.itemId){
                R.id.bottom_home -> {
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.bottom_orders -> {
                    replaceFragment(OrdersFragment())
                    Toast.makeText(this, "List of Orders", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
        replaceFragment(HomeFragment())

    }

    private fun replaceFragment(ordersFragment: OrdersFragment) {

    }

    private fun replaceFragment(homeFragment: HomeFragment) {
        TODO("Not yet implemented")
    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit()
    }
}