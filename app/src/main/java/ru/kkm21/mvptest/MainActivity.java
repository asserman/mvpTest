package ru.kkm21.mvptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private static final String TAG = "MainActivity";

    private MainContract.Presenter mPresenter;

    private Button mButton;

    private TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainPresenter(this);

        mTextView = (TextView)findViewById(R.id.text_view);
        mButton = (Button) findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.onButtonClicked();
            }
        });
        Log.d(TAG, "onCreate()");

    }

    @Override
    public void showText(String message) {
        mTextView.setText(message);
        Log.d(TAG, "showText()");
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onDestroy();
        mPresenter.onDestroy();
        Log.d(TAG, "onDestroy()");

    }
}
