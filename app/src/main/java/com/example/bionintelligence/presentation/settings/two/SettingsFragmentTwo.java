package com.example.bionintelligence.presentation.settings.two;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.example.bionintelligence.R;
import com.example.bionintelligence.data.pojo.AnalyticalFactors;
import com.example.bionintelligence.data.repositories.CalculatorRepositoryImpl;
import com.example.bionintelligence.data.source.DatabaseSourceImpl;
import com.example.bionintelligence.data.source.LocalSourceImpl;
import com.example.bionintelligence.databinding.FragmentSettings1Binding;
import com.example.bionintelligence.databinding.FragmentSettings2Binding;
import com.example.bionintelligence.presentation.settings.one.SettingsOnePresenterImpl;

import java.lang.ref.WeakReference;

public class SettingsFragmentTwo extends Fragment implements SettingsTwoView {
    private FragmentSettings2Binding binding;
    private SettingsTwoPresenter settingsTwoPresenter;
    private AnalyticalFactors analyticalFactors;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_settings2, container, false);
        settingsTwoPresenter = new SettingsTwoPresenterImpl(new CalculatorRepositoryImpl(
                new LocalSourceImpl(new WeakReference<>(getActivity())), new DatabaseSourceImpl()));
        settingsTwoPresenter.attachView(this);
        settingsTwoPresenter.getAnalyticalFactors();

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.rgN.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId) {
                case R.id.rb_mineralN:
                    analyticalFactors.setAfN(1);
                    break;
                case R.id.rb_shelochN:
                    analyticalFactors.setAfN(2);
                    break;
                default:
                    analyticalFactors.setAfN(3);
            }
        });
        binding.rgP2O5.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId) {
                case R.id.rb_machiginP2O5:
                    analyticalFactors.setAfP2O5(1);
                    break;
                case R.id.rb_chirikovP2O5:
                    analyticalFactors.setAfP2O5(2);
                    break;
                default:
                    analyticalFactors.setAfP2O5(3);
            }
        });
        binding.rgK2O.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId) {
                case R.id.rb_machiginK2O:
                    analyticalFactors.setAfK2O(1);
                    break;
                case R.id.rb_chirikovK2O:
                    analyticalFactors.setAfK2O(2);
                    break;
                default:
                    analyticalFactors.setAfK2O(3);
            }
        });
    }

    @Override
    public void displayAnalyticalFactors(AnalyticalFactors analyticalFactors) {
        this.analyticalFactors = analyticalFactors;
        switch (analyticalFactors.getAfN()) {
            case 1:
                binding.rbMineralN.setChecked(true);
                break;
            case 2:
                binding.rbShelochN.setChecked(true);
                break;
            case 3:
                binding.rbLiteN.setChecked(true);
                break;
        }
        switch (analyticalFactors.getAfP2O5()) {
            case 1:
                binding.rbMachiginP2O5.setChecked(true);
                break;
            case 2:
                binding.rbChirikovP2O5.setChecked(true);
                break;
            case 3:
                binding.rbKirsanovP2O5.setChecked(true);
                break;
        }
        switch (analyticalFactors.getAfK2O()) {
            case 1:
                binding.rbMachiginK2O.setChecked(true);
                break;
            case 2:
                binding.rbChirikovK2O.setChecked(true);
                break;
            case 3:
                binding.rbKirsanovK2O.setChecked(true);
                break;
        }
    }

    @Override
    public void onDestroy() {
        settingsTwoPresenter.saveAnalyticalFactors(analyticalFactors);
        settingsTwoPresenter.detachView();
        super.onDestroy();
    }
}