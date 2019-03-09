package ru.kkm21.mvptest;

public interface MainContract {
    interface View{
        void showText(String message);
    }
    interface Presenter{
        void onButtonClicked();
        void onDestroy();
    }
    interface Repository{
        String loadMessage();
    }

}
