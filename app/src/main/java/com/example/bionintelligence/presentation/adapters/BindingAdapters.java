package com.example.bionintelligence.presentation.adapters;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.bionintelligence.presentation.custom.ChemistryView;

public class BindingAdapters {
    //заполнение chemistryView значениями с помощью атрибута "item_value"
    @BindingAdapter({"item_value"})
    public static void setItemValue(ChemistryView chemistryView, int value) {
        chemistryView.setItemValue(String.valueOf(value));
    }

    @BindingAdapter({"new_src"})
    public static void setImage(ImageView imageView, int link) {
        Glide.with(imageView.getContext()).load(link).into(imageView);
    }
}
