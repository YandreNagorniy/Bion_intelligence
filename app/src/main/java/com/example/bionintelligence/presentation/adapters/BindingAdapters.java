package com.example.bionintelligence.presentation.adapters;

import android.databinding.BindingAdapter;

import com.example.bionintelligence.presentation.custom.ChemistryView;

public class BindingAdapters {
    //заполнение chemistryView значениями с помощью атрибута "item_value"
    @BindingAdapter({"item_value"})
    public static void setItemValue(ChemistryView chemistryView, int value) {
        chemistryView.setItemValue(String.valueOf(value));
    }
}
