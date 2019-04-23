package com.example.bionintelligence.presentation.splash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bionintelligence.R;
import com.example.bionintelligence.data.repositories.CalculatorRepositoryImpl;
import com.example.bionintelligence.data.source.DatabaseSourceImpl;
import com.example.bionintelligence.data.source.LocalSourceImpl;
import com.example.bionintelligence.presentation.main.MainActivity;

import java.lang.ref.WeakReference;

public class SplashActivity extends AppCompatActivity implements SplashView {
    private SplashPresenter splashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashPresenter = new SplashPresenterImpl(new CalculatorRepositoryImpl(
                new LocalSourceImpl(new WeakReference<>(this)),
                new DatabaseSourceImpl()));
        splashPresenter.attachView(this);
        splashPresenter.checkLocalData();
    }

    @Override
    public void goToMainActivity() {
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 2 * 1000);
    }

    @Override
    protected void onDestroy() {
        splashPresenter.detachView();
        super.onDestroy();
    }
}