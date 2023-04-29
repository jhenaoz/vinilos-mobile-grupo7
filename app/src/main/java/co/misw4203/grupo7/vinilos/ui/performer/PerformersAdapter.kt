package co.misw4203.grupo7.vinilos.ui.performer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import co.misw4203.grupo7.vinilos.R
import co.misw4203.grupo7.vinilos.databinding.PerformerItemBinding
import co.misw4203.grupo7.vinilos.models.Performer

class PerformersAdapter: RecyclerView.Adapter<PerformersAdapter.PerformersViewHolder>() {

    var performers :List<Performer> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PerformersViewHolder {
        val withDataBinding: PerformerItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            PerformersViewHolder.LAYOUT,
            parent,
            false)
        return PerformersViewHolder(withDataBinding)
    }

    override fun onBindViewHolder(holder: PerformersViewHolder, position: Int) {
        holder.viewDataBinding.also {
            it.performer = performers[position]
        }
        /*holder.viewDataBinding.root.setOnClickListener {
            val action = AlbumFragmentDirections.actionAlbumFragmentToCommentFragment(performers[position].id)
            //Navigate using that action
            holder.viewDataBinding.root.findNavController().navigate(action)
        }*/
    }

    override fun getItemCount(): Int {
        return performers.size
    }


    class PerformersViewHolder(val viewDataBinding: PerformerItemBinding) :
        RecyclerView.ViewHolder(viewDataBinding.root) {
        companion object {
            @LayoutRes
            val LAYOUT = R.layout.performer_item
        }
    }
}