package com.example.bionintelligence.presentation.calculator;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bionintelligence.R;
import com.example.bionintelligence.data.model.CalculatorModel;
import com.example.bionintelligence.data.repositories.CalculatorRepositoryImpl;
import com.example.bionintelligence.data.source.DatabaseSourceImpl;
import com.example.bionintelligence.data.source.LocalSourceImpl;
import com.example.bionintelligence.databinding.FragmentCalculatorBinding;
import com.example.bionintelligence.domain.usecase.GetCalculatorUseCase;
import com.example.bionintelligence.presentation.culture.CultureActivity;

import java.lang.ref.WeakReference;

public class CalculatorFragment extends Fragment implements CalculatorView {
    private FragmentCalculatorBinding binding;
    private CalculatorPresenter calculatorPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_calculator, container, false);
        calculatorPresenter = new CalculatorPresenterImpl(new GetCalculatorUseCase(
                new CalculatorRepositoryImpl(new LocalSourceImpl(new WeakReference<>(getActivity())), new DatabaseSourceImpl())));
        calculatorPresenter.attachView(this);
        calculatorPresenter.getCalculatorData(binding.numberPicker.getValue());

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.numberPicker.setValueChangedListener((value, action) -> calculatorPresenter.getCalculatorData(value));

        binding.clSelectCulture.setOnClickListener(v -> {
            v.setEnabled(false);
            Intent intent = new Intent(getContext(), CultureActivity.class);
            startActivityForResult(intent, 1);
            v.setEnabled(true);
        });
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void displayData(CalculatorModel calculatorModel) {
        binding.setElement(calculatorModel);
    }

    @Override
    public void onDestroy() {
        calculatorPresenter.detachView();
        super.onDestroy();
    }
}
