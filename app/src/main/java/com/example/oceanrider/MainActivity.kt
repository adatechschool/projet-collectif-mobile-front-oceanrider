package com.example.oceanrider

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.oceanrider.adapter.ItemAdapter
import com.example.oceanrider.apiservice.ApiClient
import com.example.oceanrider.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration // gère config de la toolbar
    private lateinit var binding: ActivityMainBinding // permet de lier grâce a Activity Main Binding
//    private lateinit var job: Job
//    override val coroutineContext: CoroutineContext get() = Dispatchers.Main + job

//    private fun executeCall() {
//        launch(Dispatchers.Main) {
//            try {
//                val response = ApiClient.apiService.getSpots()
//                if (response.isSuccessful && response.body() != null) {
//                    val content = response.body()
//                    Log.d("TAG", "Response Content: $content")
//                } else {
//                    Toast.makeText(
//                        this@MainActivity,
//                        "Error Else Occurred: ${response.message()}",
//                        Toast.LENGTH_LONG
//                    ).show()
//                }
//
//            } catch (e: Exception) {
//                Toast.makeText(
//                    this@MainActivity,
//                    "Error Exception Occurred: ${e.message}",
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//        }
//    }

    // appelé quand activité créée
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        job = Job()
//        executeCall()


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView: RecyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = ItemAdapter(this, emptyList())
        recyclerView.adapter = adapter

        CoroutineScope(Dispatchers.IO).launch {
            try {
                val surfSpotsResponse = ApiClient.apiService.getSurfSpots() // correspond a classe SurfResponse
                val surfSpots = surfSpotsResponse.records
                // Utilisez les données récupérées dans surfSpots pour mettre à jour l'UI
                withContext(Dispatchers.Main) {
                    adapter.updateData(surfSpots)
                }
            } catch (e: Exception) {
                Log.e("MainActivity", "Error fetching surf spots: ${e.message}")
            }
        }
        setSupportActionBar(binding.toolbar) // configure la toolbar en fonction de la vue liée

        val navController =
            findNavController(R.id.nav_host_fragment_content_main) // obtient controleur de nav pour l'activité a partir du fragment
        appBarConfiguration =
            AppBarConfiguration(navController.graph) //configure la toolbar via le graph de navigation
        setupActionBarWithNavController(navController, appBarConfiguration)


        // pour avoir une snackbar au click de l'icone mail
//        binding.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null)
//                    .setAnchorView(R.id.fab).show()
//        }

//        val spotsList = JsonUtils().parseJSONFromAssets(this, "sample.json");
//        val spotsList = ApiClient
//        if (spotsList != null) {
//            val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
//            recyclerView.adapter = ItemAdapter(this, spotsList)
//            recyclerView.setHasFixedSize(true)
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