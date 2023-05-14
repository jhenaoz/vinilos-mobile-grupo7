package co.misw4203.grupo7.vinilos.ui.albums

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import co.misw4203.grupo7.vinilos.R
import co.misw4203.grupo7.vinilos.databinding.FragmentAlbumsBinding
import co.misw4203.grupo7.vinilos.models.Album
import co.misw4203.grupo7.vinilos.viewmodels.AlbumViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class AlbumsFragment : Fragment() {

    private var _binding: FragmentAlbumsBinding? = null

    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView
    private lateinit var loader: ProgressBar
    private lateinit var viewModel: AlbumViewModel
    private var viewModelAdapter: AlbumsAdapter? = null

    private lateinit var fab: FloatingActionButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAlbumsBinding.inflate(inflater, container, false)
        val view = binding.root
        viewModelAdapter = AlbumsAdapter()

        fab = view.findViewById(R.id.floatingActionButtonAddAlbum)
        fab.setOnClickListener {
            // Navigate to the add artist fragment when the button is clicked
            val intent = Intent(activity, AddAlbumActivity::class.java)
            startActivity(intent)
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        loader = binding.progressBarAlbum
        recyclerView = binding.albumRv
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = viewModelAdapter

        val activity = requireNotNull(this.activity) {
            "You can only access the viewModel after onActivityCreated()"
        }
        activity.actionBar?.title = getString(R.string.title_albums)
        viewModel = ViewModelProvider(this, AlbumViewModel.Factory(activity.application)).get(AlbumViewModel::class.java)
        viewModel.albums.observe(viewLifecycleOwner, Observer<List<Album>> {
            it.apply {
                viewModelAdapter!!.albums = this
                loader.isVisible = false
            }
        })
        viewModel.eventNetworkError.observe(viewLifecycleOwner, Observer<Boolean> { isNetworkError ->
            if (isNetworkError) onNetworkError()
        })
    }

    private fun onNetworkError() {
        if(!viewModel.isNetworkErrorShown.value!!) {
            Toast.makeText(activity, "Network Error", Toast.LENGTH_LONG).show()
            viewModel.onNetworkErrorShown()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}