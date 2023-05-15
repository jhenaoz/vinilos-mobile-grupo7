package co.misw4203.grupo7.vinilos.ui.albums

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.navArgs
import androidx.recyclerview.widget.RecyclerView
import co.misw4203.grupo7.vinilos.R
import co.misw4203.grupo7.vinilos.databinding.DetailAlbumActivityBinding
import co.misw4203.grupo7.vinilos.models.Album
import co.misw4203.grupo7.vinilos.viewmodels.DetailAlbumViewModel


class DetailAlbumActivity: AppCompatActivity() {
    private var _binding: DetailAlbumActivityBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: DetailAlbumViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DetailAlbumActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        onBindingDetailAlbumView()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun onBindingDetailAlbumView() {
        val activity = requireNotNull(this) {
            "You can only access the viewModel after onActivityCreated()"
        }
        supportActionBar?.title = getString(R.string.title_detail_albums)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val args: DetailAlbumActivityArgs by navArgs()
        Log.d("Args", args.id.toString())
        viewModel = ViewModelProvider(this, DetailAlbumViewModel.Factory(activity.application, args.id)).get(DetailAlbumViewModel::class.java)
        viewModel.album.observe(this, Observer<Album> {
            it.apply {
                binding.album = this
            }
        })
        viewModel.eventNetworkError.observe(this, Observer<Boolean> { isNetworkError ->
            if (isNetworkError) onNetworkError()
        })


    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    private fun onNetworkError() {
        if(!viewModel.isNetworkErrorShown.value!!) {
            Toast.makeText(this, "Network Error", Toast.LENGTH_LONG).show()
            viewModel.onNetworkErrorShown()
        }
    }
}