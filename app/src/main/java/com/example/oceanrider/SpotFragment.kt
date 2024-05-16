package com.example.oceanrider

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.oceanrider.databinding.SpotFragmentBinding
import com.example.oceanrider.model.SurfResponse
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class SpotFragment : Fragment() {

    private var _binding: SpotFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = SpotFragmentBinding.inflate(inflater, container, false)
//        val textViewName = binding.textviewName
//        val spotName = arguments?.getString("name")
//        textViewName.text = spotName.toString()
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // récupérer le bundle
        val name = arguments?.getString("name")
        val address = arguments?.getString("address")
        val photoJson = arguments?.getString("photo")
        val photoType = object : TypeToken<SurfResponse.Photo>() {}.type
        val photo = Gson().fromJson<SurfResponse.Photo>(photoJson, photoType)
        val surfBreak = arguments?.getString("surfbreak")
        val seasonBegin = arguments?.getString("seasonBegin")
        val seasonEnd = arguments?.getString("seasonEnd")

        // afficher ce que le bundle récupère
        view.findViewById<TextView>(R.id.textview_name).text = name
        view.findViewById<TextView>(R.id.textview_adress).text = address
        view.findViewById<TextView>(R.id.textview_surfbreak).text = surfBreak
        view.findViewById<TextView>(R.id.textview_seasonBegin).text = seasonBegin
        view.findViewById<TextView>(R.id.textview_seasonEnd).text = seasonEnd

        if (photo != null) {
            val imageView = view.findViewById<ImageView>(R.id.imageView)
            // Assurez-vous d'utiliser une bibliothèque comme Glide ou Picasso pour charger l'image
            Glide.with(this).load(photo.url).into(imageView)
        }

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}