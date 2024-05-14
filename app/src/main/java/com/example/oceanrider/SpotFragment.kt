package com.example.oceanrider

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.oceanrider.databinding.SpotFragmentBinding

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
        val textView4 = binding.textView4
        val spotName = arguments?.getString("name")
        textView4.text = spotName.toString()

//        val data = arguments
//        textView4.text = data.getString("name")
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}