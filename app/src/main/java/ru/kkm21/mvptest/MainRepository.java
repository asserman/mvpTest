package ru.kkm21.mvptest;

import android.util.Log;

public class MainRepository implements MainContract.Repository {

    private static final String TAG = "MainRepository";
    @Override
    public String loadMessage() {
        Log.d(TAG, "loadMessage");
        return "Сосичочная у Лехи";
    }
}
