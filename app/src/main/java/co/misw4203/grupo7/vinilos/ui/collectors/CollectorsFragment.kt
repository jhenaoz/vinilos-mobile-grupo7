package co.misw4203.grupo7.vinilos.ui.collectors

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import co.misw4203.grupo7.vinilos.databinding.FragmentCollectorsBinding

class CollectorsFragment : Fragment() {

    private var _binding: FragmentCollectorsBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val collectorsViewModel =
            ViewModelProvider(this).get(CollectorsViewModel::class.java)

        _binding = FragmentCollectorsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textCollectors
        collectorsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}