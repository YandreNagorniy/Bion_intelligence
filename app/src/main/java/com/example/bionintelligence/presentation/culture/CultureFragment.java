package com.example.bionintelligence.presentation.culture;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bionintelligence.R;
import com.example.bionintelligence.databinding.FragmentCultureBinding;

public class CultureFragment extends Fragment implements CultureView {
    private FragmentCultureBinding binding;
    private CulturePresenter culturePresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_culture, container, false);

        return binding.getRoot();
    }
}
