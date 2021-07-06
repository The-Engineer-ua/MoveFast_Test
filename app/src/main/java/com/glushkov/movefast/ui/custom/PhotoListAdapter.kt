package com.glushkov.movefast.ui.custom

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import com.glushkov.movefast.R
import com.glushkov.movefast.data.view.PhotoViewData
import com.glushkov.movefast.databinding.ItemPhotoBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class PhotoListAdapter : RecyclerView.Adapter<PhotoListAdapter.ViewHolder>() {

    class ViewHolder internal constructor(
        val binding: ItemPhotoBinding
    ) : RecyclerView.ViewHolder(binding.root)

    //Data source
    private var photosSource: MutableList<PhotoViewData> = mutableListOf()

    //OnClick action added to item
    private var onClickAction: (id: String) -> Unit = {}
    //OnClick action added to item to handle favorites
    private var onFavoriteClickAction: (id: String) -> Unit = {}

    /**
     * Sets item onClick
     * @param listener onClick function
     */
    fun setOnClick(listener: (id: String) -> Unit) {
        onClickAction = listener
    }

    /**
     * Sets favorite item onClick
     * @param listener onClick function
     */
    fun setOnFavClick(listener: (id: String) -> Unit) {
        onFavoriteClickAction = listener
    }

    /**
     * Adds data to source
     * @param data [List] of [PhotoViewData]
     */
    fun addData(data: List<PhotoViewData>) {
        photosSource.addAll(data)
        notifyDataSetChanged()
    }

    /**
     * Clear dataset
     */
    fun clear() {
        photosSource.clear()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemPhotoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model: PhotoViewData = photosSource[position]
        val binding = holder.binding
        //Load image. Template added in case if image is not present or loading too long
        Picasso.get().load(model.thumbnailUrl)
            .placeholder(R.drawable.ic_no_image)
            .fit()
            .centerCrop()
            .into(binding.imgThumbnail)

        //Profile image
        Picasso.get().load(model.user.image)
            .fit()
            .transform(CropCircleTransformation())
            .into(binding.imgProfile)

        binding.txtProfile.text = model.user.username
        binding.txtLikes.text = model.likes.toString()
        binding.txtProfileSub.text = model.user.username
        binding.txtDescription.text = model.description ?: model.altDescription

        //Favorite state
        setFavoriteLook(model.isLocalFavorite, binding.imgFavorite)

        binding.imgFavorite.setOnClickListener {
            onFavoriteClickAction(model.id)
            model.isLocalFavorite = !model.isLocalFavorite
            setFavoriteLook(model.isLocalFavorite, binding.imgFavorite)
        }

        binding.item.setOnClickListener {
            onClickAction(model.id)
        }
    }

    private fun setFavoriteLook(isFavorite: Boolean, view: ImageView) {
        if (isFavorite)
        {
            view.setImageDrawable(AppCompatResources.getDrawable(view.context ,R.drawable.ic_fav_star))
        }
        else {
            view.setImageDrawable(AppCompatResources.getDrawable(view.context ,R.drawable.ic_star))
        }
    }

    override fun getItemCount(): Int {
        return photosSource.size
    }
}