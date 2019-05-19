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
import com.example.bionintelligence.data.model.PhasesImgModel;
import com.example.bionintelligence.data.model.ProductiveInfoModel;
import com.example.bionintelligence.data.model.PhasesModel;
import com.example.bionintelligence.data.model.TestCultureModel;
import com.example.bionintelligence.data.model.TestPhasesModel;
import com.example.bionintelligence.data.repositories.CalculatorRepositoryImpl;
import com.example.bionintelligence.data.source.DatabaseSourceImpl;
import com.example.bionintelligence.data.source.LocalSourceImpl;
import com.example.bionintelligence.databinding.FragmentCalculatorBinding;
import com.example.bionintelligence.domain.entities.CalculatorParams;
import com.example.bionintelligence.domain.usecase.GetCalculatorUseCase;
import com.example.bionintelligence.presentation.culture.CultureActivity;

import java.lang.ref.WeakReference;
import java.util.List;

import static android.app.Activity.RESULT_OK;

public class CalculatorFragment extends Fragment implements CalculatorView {
    private FragmentCalculatorBinding binding;
    private CalculatorPresenter calculatorPresenter;
    private TestCultureModel cultureModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_calculator, container, false);
        calculatorPresenter = new CalculatorPresenterImpl(new GetCalculatorUseCase(
                new CalculatorRepositoryImpl(new LocalSourceImpl(new WeakReference<>(getActivity())), new DatabaseSourceImpl())),
                new CalculatorRepositoryImpl(new LocalSourceImpl(new WeakReference<>(getActivity())), new DatabaseSourceImpl()));
        calculatorPresenter.attachView(this);
        calculatorPresenter.getStartData();

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.numberPicker.setValueChangedListener((value, action) -> {
            calculatorPresenter.getCalculatorData(value, cultureModel.getCultureId());
            calculatorPresenter.getPhasesData(cultureModel.getPhasesModelList(), value);
        });

        binding.clSelectCulture.setOnClickListener(v -> {
            v.setEnabled(false);
            Intent intent = new Intent(getContext(), CultureActivity.class);
            startActivityForResult(intent, 1);
            v.setEnabled(true);
        });
    }
//todo delete id in .xml

    @Override
    public void displayCalculatorData(CalculatorModel calculatorModel) {
        binding.setElement(calculatorModel);
    }

    @Override
    public void displayCultureData(TestCultureModel cultureModel) {
        this.cultureModel = cultureModel;
        binding.setCultureModel(cultureModel);
        binding.numberPicker.setMax(cultureModel.getProductiveMax());
        binding.numberPicker.setMin(cultureModel.getProductiveMin());
        binding.numberPicker.setUnit(cultureModel.getProductiveStep());
        binding.numberPicker.setValue(cultureModel.getProductiveMin());
        calculatorPresenter.getCalculatorData(cultureModel.getProductiveMin(), cultureModel.getCultureId());
        calculatorPresenter.getPhasesData(cultureModel.getPhasesModelList(), cultureModel.getProductiveMin());
    }

    @Override
    public void displayPhasesData(TestPhasesModel phasesModel) {
        binding.setPhaseValue(phasesModel);
    }

    @Override //data about select culture from CultureActivity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            calculatorPresenter.getCultureModel(data.getIntExtra("cultureId", 1));
            //todo CultureActivity.CULTURE_ID
        }
    }

    @Override
    public void onDestroy() {
        calculatorPresenter.setParamsData(new CalculatorParams(binding.numberPicker.getValue(), cultureModel.getCultureId()));
        calculatorPresenter.detachView();
        super.onDestroy();
    }
}
