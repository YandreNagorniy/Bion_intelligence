package com.example.bionintelligence.presentation.settings.one;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bionintelligence.R;
import com.example.bionintelligence.data.model.SoilFactorsModel;
import com.example.bionintelligence.data.repositories.CalculatorRepositoryImpl;
import com.example.bionintelligence.data.source.DatabaseSourceImpl;
import com.example.bionintelligence.data.source.LocalSourceImpl;
import com.example.bionintelligence.databinding.FragmentSettings1Binding;
import com.example.bionintelligence.presentation.custom.SoilFactorView;

import java.lang.ref.WeakReference;

public class SettingsFragmentOne extends Fragment implements SettingsOneView {
    private FragmentSettings1Binding binding;
    private SettingsOnePresenter settingsOnePresenter;
    private SoilFactorsModel soilFactorsModel;

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
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        keyboardActionDone(binding.sfvN.getEtItemValue());
        keyboardActionDone(binding.sfvP2O5.getEtItemValue());
        keyboardActionDone(binding.sfvK2O.getEtItemValue());
        keyboardActionDone(binding.sfvCaO.getEtItemValue());
        keyboardActionDone(binding.sfvMgO.getEtItemValue());
        keyboardActionDone(binding.sfvS.getEtItemValue());
        keyboardActionDone(binding.sfvZn.getEtItemValue());
        keyboardActionDone(binding.sfvCu.getEtItemValue());
        keyboardActionDone(binding.sfvMn.getEtItemValue());
        keyboardActionDone(binding.sfvCo.getEtItemValue());
        keyboardActionDone(binding.sfvMo.getEtItemValue());
        keyboardActionDone(binding.sfvB.getEtItemValue());
        keyboardActionDone(binding.sfvFe.getEtItemValue());
        keyboardActionDone(binding.sfG);
        keyboardActionDone(binding.sfPH);
        keyboardActionDone(binding.sfZPV);
    }

    private void keyboardActionDone(EditText view) {
        view.setOnEditorActionListener((v, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                String text = view.getText().toString();
                if (TextUtils.isEmpty(text) || text.equals(".")) {
                    view.setText("0");
                }
                if (view.getId() == R.id.sf_pH) {
                    double value = Double.valueOf(view.getText().toString());
                    if (value < 4) {
                        view.setText("4");
                    }
                    if (value > 10) {
                        view.setText("10");
                    }
                }
                settingsOnePresenter.setSoilFactorsData(binding.getSoilFactor());
            }
            return false;
        });
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
