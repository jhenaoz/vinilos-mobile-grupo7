package co.misw4203.grupo7.vinilos.ui.collectors

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import co.misw4203.grupo7.vinilos.R
import co.misw4203.grupo7.vinilos.databinding.CollectorItemBinding
import co.misw4203.grupo7.vinilos.models.Collector

class CollectorsAdapter: RecyclerView.Adapter<CollectorsAdapter.CollectorsViewHolder>() {

    var collectors :List<Collector> = emptyList()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            //notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectorsViewHolder {
        val withDataBinding: CollectorItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            CollectorsViewHolder.LAYOUT,
            parent,
            false)
        return CollectorsViewHolder(withDataBinding)
    }

    override fun onBindViewHolder(holder: CollectorsViewHolder, position: Int) {
        holder.viewDataBinding.also {
            it.collector = collectors[position]
        }
    }

    override fun getItemCount(): Int {
        return collectors.size
    }


    class CollectorsViewHolder(val viewDataBinding: CollectorItemBinding) :
        RecyclerView.ViewHolder(viewDataBinding.root) {
        companion object {
            @LayoutRes
            val LAYOUT = R.layout.collector_item
        }
    }
}