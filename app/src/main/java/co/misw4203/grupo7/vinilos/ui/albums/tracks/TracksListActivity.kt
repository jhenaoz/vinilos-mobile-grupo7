package co.misw4203.grupo7.vinilos.ui.albums.tracks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import co.misw4203.grupo7.vinilos.R
import co.misw4203.grupo7.vinilos.databinding.ActivityTracksListBinding
import co.misw4203.grupo7.vinilos.ui.collectors.DetailCollectorActivityArgs
import co.misw4203.grupo7.vinilos.ui.collectors.TrackListAdapter
import co.misw4203.grupo7.vinilos.viewmodels.TrackListViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TracksListActivity : AppCompatActivity() {
    private var _binding: ActivityTracksListBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: TrackListViewModel
    private lateinit var loader: ProgressBar
    private var viewModelAdapter: TrackListAdapter? = null

    private lateinit var button: FloatingActionButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityTracksListBinding.inflate(layoutInflater)
        val view = binding.root
        viewModelAdapter = TrackListAdapter()
        setContentView(view)
        onBindingTrackList()

        button = view.findViewById(R.id.floatingActionButtonAddTrack)
        button.setOnClickListener {
            // Navigate to the add artist fragment when the button is clicked
            val intent = Intent(applicationContext, AddTrackActivity::class.java)

            intent.putExtra("id", viewModel.id)
            startActivity(intent)
        }
    }

    override fun onRestart() {
        super.onRestart()
        finish()
        startActivity(getIntent())
    }

    private fun onBindingTrackList() {
        val activity = requireNotNull(this) {
            "You can only access the viewModel after onActivityCreated()"
        }

        supportActionBar?.title = "Lista de canciones"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        loader = binding.progressBarTrackList
        recyclerView = binding.trackListRv
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.adapter = viewModelAdapter

        val args: DetailCollectorActivityArgs by navArgs()
        Log.d("Args 2", args.id.toString())
        viewModel = ViewModelProvider(this, TrackListViewModel.Factory(activity.application, args.id)).get(
            TrackListViewModel::class.java)
        viewModel.trackList.observe(this) {
            it.apply {
                viewModelAdapter!!.trackList = this
                loader.isVisible = false
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

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}