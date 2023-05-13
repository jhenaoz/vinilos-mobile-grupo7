package co.misw4203.grupo7.vinilos.ui.performer


import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import co.misw4203.grupo7.vinilos.R
import co.misw4203.grupo7.vinilos.databinding.DetailPerformerActivityBinding
import co.misw4203.grupo7.vinilos.models.Album
import co.misw4203.grupo7.vinilos.models.Performer
import co.misw4203.grupo7.vinilos.ui.albums.AlbumsAdapter
import co.misw4203.grupo7.vinilos.viewmodels.DetailPerformerViewModel

class DetailPerformerActivity : AppCompatActivity(){

    private var _binding: DetailPerformerActivityBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: DetailPerformerViewModel
    private var viewModelAdapter: AlbumsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DetailPerformerActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        viewModelAdapter = AlbumsAdapter()
        onRecyclerViewCreated()
        onBindingDetailPerformerView()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun onRecyclerViewCreated() {
        recyclerView = binding.albumsRv
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = viewModelAdapter
    }

    private fun onBindingDetailPerformerView() {
        val activity = requireNotNull(this) {
            "You can only access the viewModel after onActivityCreated()"
        }
        supportActionBar?.title = getString(R.string.title_detail_performers)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val args: DetailPerformerActivityArgs by navArgs()
        Log.d("Args", args.id.toString())
        viewModel = ViewModelProvider(this, DetailPerformerViewModel.Factory(activity.application, args.id)).get(DetailPerformerViewModel::class.java)
        viewModel.performer.observe(this, Observer<Performer> {
            it.apply {
                binding.performer = this
                viewModelAdapter!!.albums = it.albums
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