package com.example.bionintelligence.presentation.culture;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.bionintelligence.R;
import com.example.bionintelligence.data.model.CultureModel;
import com.example.bionintelligence.data.repositories.CultureRepositoryImpl;
import com.example.bionintelligence.data.source.DatabaseSourceImpl;
import com.example.bionintelligence.databinding.ActivityCultureBinding;
import com.example.bionintelligence.presentation.adapters.CultureRvAdapter;

import java.util.List;

public class CultureActivity extends AppCompatActivity implements CultureView {
    private CulturePresenter culturePresenter;
    private ActivityCultureBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_culture);
        binding.rvCulture.setLayoutManager(new LinearLayoutManager(this));

        culturePresenter = new CulturePresenterImpl(new CultureRepositoryImpl(new DatabaseSourceImpl()));
        culturePresenter.attachView(this);
        culturePresenter.getCultureData();

    }

    @Override
    public void displayData(List<CultureModel> cultureModelList) {
        RecyclerView.Adapter adapter = new CultureRvAdapter(cultureModelList);
        binding.rvCulture.setAdapter(adapter);
    }

    @Override
    protected void onDestroy() {
        culturePresenter.detachView();
        super.onDestroy();
    }
}
