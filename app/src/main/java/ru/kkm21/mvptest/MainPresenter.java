package ru.kkm21.mvptest;

import android.util.Log;

public class MainPresenter implements MainContract.Presenter {

    private static final String TAG = "MainPresenter";

    private MainContract.View mView;
    private MainContract.Repository mRepository;

    private String message;

    public MainPresenter(MainContract.View mView){
        this.mView = mView;
        this.mRepository= new MainRepository();
        Log.d(TAG, "Construction");
    }

    @Override
    public void onButtonClicked() {
        message = mRepository.loadMessage();
        mView.showText(message);
        Log.d(TAG, "onButtonClicked()");
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy()");
    }
}
