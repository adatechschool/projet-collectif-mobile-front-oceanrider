package com.example.oceanrider

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.oceanrider.adapter.ItemAdapter
import com.example.oceanrider.apiservice.ApiClient
import com.example.oceanrider.databinding.ListSpotsFragmentBinding
import com.example.oceanrider.model.SurfResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class ListSpotsFragment : Fragment() {

    private var _binding: ListSpotsFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ListSpotsFragmentBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView: RecyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireActivity())
        val adapter = ItemAdapter(requireContext(), emptyList()) { record ->
            // Naviguer vers le FirstFragment
//            ListSpotsFragmentDirections.
            val bundle = Bundle()
            bundle.putString("name", record.fields.destination)
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment, bundle)
        }
        recyclerView.adapter = adapter


        CoroutineScope(Dispatchers.IO).launch {
            try {
                val surfSpotsResponse =
                    ApiClient.apiService.getSurfSpots() // correspond a classe SurfResponse
                val surfSpots = surfSpotsResponse.records
                // Utilisez les données récupérées dans surfSpots pour mettre à jour l'UI
                withContext(Dispatchers.Main) {
                    adapter.updateData(surfSpots)
                }
            } catch (e: Exception) {
                Log.e("MainActivity", "Error fetching surf spots: ${e.message}")
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}