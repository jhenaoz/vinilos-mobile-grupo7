package co.misw4203.grupo7.vinilos.ui.collectors

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.navArgs
import androidx.recyclerview.widget.RecyclerView
import co.misw4203.grupo7.vinilos.R
import co.misw4203.grupo7.vinilos.databinding.DetailCollectorActivityBinding
import co.misw4203.grupo7.vinilos.models.Collector
import co.misw4203.grupo7.vinilos.viewmodels.DetailCollectorViewModel


class DetailCollectorActivity: AppCompatActivity() {
    private var _binding: DetailCollectorActivityBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: DetailCollectorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DetailCollectorActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        onBindingDetailCollectorView()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun onBindingDetailCollectorView() {
        val activity = requireNotNull(this) {
            "You can only access the viewModel after onActivityCreated()"
        }
        supportActionBar?.title = getString(/* resId = */ R.string.title_detail_collectors)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val args: DetailCollectorActivityArgs by navArgs()
        Log.d("Args", args.id.toString())
        viewModel = ViewModelProvider(this, DetailCollectorViewModel.Factory(activity.application, args.id)).get(DetailCollectorViewModel::class.java)
        viewModel.collector.observe(this, Observer<Collector> {
            it.apply {
                binding.collector = this
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