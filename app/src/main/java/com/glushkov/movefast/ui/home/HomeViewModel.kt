package com.glushkov.movefast.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.glushkov.movefast.data.view.PhotoViewData
import com.glushkov.movefast.repository.IPhotoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

class HomeViewModel (private val photoRepository: IPhotoRepository) : ViewModel() {

    private val _photoList: MutableLiveData<List<PhotoViewData>> = MutableLiveData()
    val photoList: LiveData<List<PhotoViewData>>
        get() = _photoList

    fun getListPhoto(page: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                _photoList.postValue(photoRepository.getPhotoList(page))
            } catch (e: Exception) {
                Log.e(HomeViewModel::class.java.name, "Photo gathering failed", e)
            }
        }
    }
}