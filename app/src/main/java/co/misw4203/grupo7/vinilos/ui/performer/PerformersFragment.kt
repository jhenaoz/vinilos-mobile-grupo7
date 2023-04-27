package co.misw4203.grupo7.vinilos.ui.performer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import co.misw4203.grupo7.vinilos.databinding.FragmentPerformersBinding

class PerformersFragment : Fragment() {

    private var _binding: FragmentPerformersBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val performersViewModel =
            ViewModelProvider(this).get(PerformersViewModel::class.java)

        _binding = FragmentPerformersBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textPerformers
        performersViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}