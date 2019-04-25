package com.example.bionintelligence.presentation.culture;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bionintelligence.R;
import com.example.bionintelligence.data.model.CultureModel;
import com.example.bionintelligence.data.repositories.CultureRepositoryImpl;
import com.example.bionintelligence.data.source.DatabaseSourceImpl;
import com.example.bionintelligence.databinding.ActivityCultureBinding;

import java.util.List;

public class CultureActivity extends AppCompatActivity implements CultureView {
    private CulturePresenter culturePresenter;
    private ActivityCultureBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_culture);
        culturePresenter = new CulturePresenterImpl(new CultureRepositoryImpl(new DatabaseSourceImpl()));
        culturePresenter.attachView(this);
        culturePresenter.getCultureData();

    }

    @Override
    public void displayData(List<CultureModel> cultureModelList) {
        int a = 0;
    }

    @Override
    protected void onDestroy() {
        culturePresenter.detachView();
        super.onDestroy();
    }
}
