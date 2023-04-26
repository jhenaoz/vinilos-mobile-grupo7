package co.misw4203.grupo7.vinilos.ui.collections

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import co.misw4203.grupo7.vinilos.databinding.FragmentCollectionsBinding

class CollectionsFragment : Fragment() {

    private var _binding: FragmentCollectionsBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val collectionsViewModel =
            ViewModelProvider(this).get(CollectionsViewModel::class.java)

        _binding = FragmentCollectionsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textCollections
        collectionsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}