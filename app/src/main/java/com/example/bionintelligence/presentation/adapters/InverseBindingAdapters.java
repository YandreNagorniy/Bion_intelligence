package com.example.bionintelligence.presentation.adapters;

import android.databinding.BindingAdapter;
import android.databinding.InverseBindingAdapter;
import android.databinding.InverseBindingListener;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.bionintelligence.presentation.custom.SoilFactorView;

public class InverseBindingAdapters {

    @BindingAdapter(value = "sf_valueAttrChanged")
    public static void setListener(SoilFactorView view, final InverseBindingListener listener) {
        if (listener != null) {
            view.getEtItemValue().addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    listener.onChange();
                }
            });
        }
    }

    @InverseBindingAdapter(attribute = "sf_value")
    public static double getItemValue(SoilFactorView view) {
        return view.getItemValue();
    }


    @BindingAdapter({"sf_value"})
    public static void setItemValue(SoilFactorView view, double value) {
        view.setItemValue(String.valueOf(value));
    }

    @BindingAdapter(value = "sf_valueAttrChanged")
    public static void setListener(EditText view, final InverseBindingListener listener) {
        if (listener != null) {
            view.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    listener.onChange();
                }
            });
        }
    }

    @InverseBindingAdapter(attribute = "sf_value")
    public static double getItemValue(EditText view) {
        return Double.valueOf(view.getText().toString());
    }


    @BindingAdapter({"sf_value"})
    public static void setItemValue(EditText view, double value) {
        view.setText(String.valueOf(value));
    }

}
