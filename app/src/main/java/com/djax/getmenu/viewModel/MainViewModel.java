package com.djax.getmenu.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.djax.getmenu.repository.MainRepository;
import com.djax.getmenu.responsebody.ResponseModel;

public class MainViewModel extends AndroidViewModel {

    MainRepository repository;
    LiveData<ResponseModel> responseModelLiveData;

    public MainViewModel(@NonNull Application application) {
        super(application);

        repository = new MainRepository();
        this.responseModelLiveData = repository.getResponseModelLiveData();
    }

    public LiveData<ResponseModel> getResponseModelLiveData() {
        return responseModelLiveData;
    }
}
