package com.glushkov.movefast.ui.info

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.glushkov.movefast.data.view.PhotoViewData
import com.glushkov.movefast.repository.PhotoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

class InfoViewModel (private val photoRepository: PhotoRepository) : ViewModel() {

    private val _photoInfo: MutableLiveData<PhotoViewData> = MutableLiveData()
    val photoInfo: LiveData<PhotoViewData>
        get() = _photoInfo

    fun getListPhoto(id: String) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                _photoInfo.postValue(photoRepository.getPhotoInfo(id))
            } catch (e: Exception) {
                Log.e(InfoViewModel::class.java.name, "Photo gathering failed", e)
            }
        }
    }
}