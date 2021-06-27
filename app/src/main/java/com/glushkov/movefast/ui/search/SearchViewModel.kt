package com.glushkov.movefast.ui.search

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.glushkov.movefast.data.view.SearchViewData
import com.glushkov.movefast.repository.IPhotoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

class SearchViewModel (private val photoRepository: IPhotoRepository) : ViewModel() {

    private val _searchResults: MutableLiveData<SearchViewData> = MutableLiveData()
    val searchResults: LiveData<SearchViewData>
        get() = _searchResults

    fun getListPhoto(page: Int, query: String) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                _searchResults.postValue(photoRepository.getSearchResults(page, query))
            } catch (e: Exception) {
                Log.e(SearchViewModel::class.java.name, "Photo gathering failed", e)
            }
        }
    }
}