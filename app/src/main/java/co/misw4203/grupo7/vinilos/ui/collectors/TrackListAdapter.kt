package co.misw4203.grupo7.vinilos.ui.collectors

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import co.misw4203.grupo7.vinilos.R
import co.misw4203.grupo7.vinilos.databinding.TrackItemBinding
import co.misw4203.grupo7.vinilos.models.Track


class TrackListAdapter: RecyclerView.Adapter<TrackListAdapter.TrackListViewHolder>() {

    var trackList :List<Track> = emptyList()
        @SuppressLint("NotifyDataSetChanged")
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackListViewHolder {
        val withDataBinding: TrackItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            TrackListViewHolder.LAYOUT,
            parent,
            false)
        return TrackListViewHolder(withDataBinding)
    }

    override fun onBindViewHolder(holder: TrackListViewHolder, position: Int) {
        holder.viewDataBinding.also {
            it.track = trackList[position]
        }
    }

    override fun getItemCount(): Int {
        return trackList.size
    }


    class TrackListViewHolder(val viewDataBinding: TrackItemBinding) :
        RecyclerView.ViewHolder(viewDataBinding.root) {
        companion object {
            @LayoutRes
            val LAYOUT = R.layout.track_item
        }
    }
}