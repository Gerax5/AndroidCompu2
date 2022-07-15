package com.example.navegationdrawerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.navegationdrawerapplication.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var navView: NavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        drawer = binding.navDrawe
        toggle = ActionBarDrawerToggle(this, drawer, R.string.open_drawer,R.string.close_drawer)
        navView = binding.navNav

        drawer.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_hospital ->{
                    llamarFragmento(PruebaFragment())
                    true
                }
                R.id.nav_opcion1 ->{
                    llamarFragmento(SegundoFragment())
                    Toast.makeText(this, "Banco",Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav_persona ->{
                    Toast.makeText(this, "Persona",Toast.LENGTH_SHORT).show()
                    true
                }
                else -> {super.onOptionsItemSelected(it)}
            }
        }

    }

    fun llamarFragmento(fragment: Fragment){
        val transaccion = supportFragmentManager.beginTransaction()
        val fragmento = fragment

        transaccion.replace(R.id.frag_nav, fragmento)
        //añandir el fragmento, al presionar la tecla de retroceso se van desapilando
        transaccion.addToBackStack(null) //en lugar de null se le puede dar un nombre para utilizarlo posteriormente
        transaccion.commit()
        true
    }

    fun claseDrawer(){
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}