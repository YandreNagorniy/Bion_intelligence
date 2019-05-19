package com.example.bionintelligence.presentation.settings.one;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bionintelligence.R;
import com.example.bionintelligence.data.model.SoilFactorsModel;
import com.example.bionintelligence.data.repositories.CalculatorRepositoryImpl;
import com.example.bionintelligence.data.source.DatabaseSourceImpl;
import com.example.bionintelligence.data.source.LocalSourceImpl;
import com.example.bionintelligence.databinding.FragmentSettings1Binding;

import java.lang.ref.WeakReference;

public class SettingsFragmentOne extends Fragment implements SettingsOneView {
    FragmentSettings1Binding binding;
    SettingsOnePresenter settingsOnePresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_settings1, container, false);
        settingsOnePresenter = new SettingsOnePresenterImpl(new CalculatorRepositoryImpl(
                new LocalSourceImpl(new WeakReference<>(getActivity())), new DatabaseSourceImpl()));
        settingsOnePresenter.attachView(this);
        settingsOnePresenter.getSoilFactorsData();


        return binding.getRoot();
    }

    @Override
    public void displaySoilFactors(SoilFactorsModel soilFactors) {
        binding.setSoilFactor(soilFactors);
    }

    @Override
    public void onDestroy() {
        settingsOnePresenter.detachView();
        super.onDestroy();
    }
}
