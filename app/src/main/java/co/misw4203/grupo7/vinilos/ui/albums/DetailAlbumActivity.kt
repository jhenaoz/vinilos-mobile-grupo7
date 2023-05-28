package co.misw4203.grupo7.vinilos.ui.albums

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.navArgs
import co.misw4203.grupo7.vinilos.R
import co.misw4203.grupo7.vinilos.databinding.DetailAlbumActivityBinding
import co.misw4203.grupo7.vinilos.ui.albums.tracks.TracksListActivity
import co.misw4203.grupo7.vinilos.viewmodels.DetailAlbumViewModel


class DetailAlbumActivity: AppCompatActivity() {
    private var _binding: DetailAlbumActivityBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: DetailAlbumViewModel

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DetailAlbumActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        onBindingDetailAlbumView()

        button = view.findViewById(R.id.buttonListTracks)
        button.setOnClickListener {
            // Navigate to the add artist fragment when the button is clicked
            val intent = Intent(applicationContext, TracksListActivity::class.java)
            intent.putExtra("id", viewModel.id)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun onBindingDetailAlbumView() {
        val activity = requireNotNull(this) {
            "You can only access the viewModel after onActivityCreated()"
        }
        supportActionBar?.title = getString(/* resId = */ R.string.title_detail_albums)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val args: DetailAlbumActivityArgs by navArgs()
        Log.d("Args", args.id.toString())
        viewModel = ViewModelProvider(this, DetailAlbumViewModel.Factory(activity.application, args.id)).get(DetailAlbumViewModel::class.java)
        viewModel.album.observe(this) {
            it.apply {
                binding.album = this
            }
        }
        viewModel.eventNetworkError.observe(this) { isNetworkError ->
            if (isNetworkError) onNetworkError()
        }


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