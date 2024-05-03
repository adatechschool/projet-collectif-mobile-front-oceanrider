package com.example.oceanrider

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.RecyclerView
import com.example.oceanrider.adapter.ItemAdapter
import com.example.oceanrider.data.Datasource
import com.example.oceanrider.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration // gère config de la toolbar
    private lateinit var binding: ActivityMainBinding // permet de lier grâce a Activity Main Binding

    // appelé quand activité créée
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // crée une instance de la classe ActivityMainBinding en utilisant le layoutInflater.
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // définit le layout de l'activité en utilisant la racine de la vue liée

        val myDataset = Datasource().loadSpots()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)

        setSupportActionBar(binding.toolbar) // configure la toolbar en fonction de la vue liée

        val navController = findNavController(R.id.nav_host_fragment_content_main) // obtient controleur de nav pour l'activité a partir du fragment
        appBarConfiguration = AppBarConfiguration(navController.graph) //configure la toolbar via le graph de navigation
        setupActionBarWithNavController(navController, appBarConfiguration)

        // pour avoir une snackbar au click de l'icone mail
//        binding.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null)
//                    .setAnchorView(R.id.fab).show()
//        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // ouvre le menu
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    //gère le comportement de la navigation vers le haut
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}