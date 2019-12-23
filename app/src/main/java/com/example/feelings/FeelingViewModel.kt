package com.example.feelings

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class FeelingViewModel(application: Application) : AndroidViewModel(application){
    private val repository: FeelingRepository

    val allFeelings : LiveData<List<Feeling>>

    init {
        val feelingDao = FeelingDatabase.getDatabase(application).feelingDao()
        repository = FeelingRepository((feelingDao))
        allFeelings = repository.allFeelings
    }

    fun insertFeeling(feeling: Feeling) = viewModelScope.launch{
        repository.insert(feeling)
    }
}