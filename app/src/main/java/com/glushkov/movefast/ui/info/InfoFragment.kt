package com.glushkov.movefast.ui.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.glushkov.movefast.R
import com.glushkov.movefast.data.view.PhotoViewData
import com.glushkov.movefast.databinding.FragmentInfoBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation
import org.koin.androidx.viewmodel.ext.android.viewModel

class InfoFragment : Fragment() {

    private lateinit var binding: FragmentInfoBinding
    private val vm: InfoViewModel by viewModel()
    private val args: InfoFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInfoBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initialization()
    }

    private fun initialization() {
        vm.getListPhoto(args.id)

        vm.photoInfo.observe(viewLifecycleOwner) {
            displayData(it)
        }
    }

    private fun displayData(data: PhotoViewData) {
        Picasso.get().load(data.downloadUrl)
            .placeholder(R.drawable.ic_no_image)
            .fit()
            .centerCrop()
            .into(binding.imgThumbnail)

        //Profile image
        Picasso.get().load(data.user.image)
            .fit()
            .transform(CropCircleTransformation())
            .into(binding.imgProfile)

        binding.txtProfile.text = data.user.username
        binding.txtLikes.text = data.likes.toString()
        binding.txtProfileSub.text = data.user.username
        binding.txtDescription.text = data.description ?: data.altDescription
    }
}