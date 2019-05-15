package com.example.bionintelligence.presentation.settings;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bionintelligence.R;
import com.example.bionintelligence.databinding.FragmentSettings1Binding;
import com.example.bionintelligence.databinding.FragmentSettings2Binding;

public class SettingsFragmentTwo extends Fragment {
    FragmentSettings2Binding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_settings2, container, false);
        return binding.getRoot();
    }
}
