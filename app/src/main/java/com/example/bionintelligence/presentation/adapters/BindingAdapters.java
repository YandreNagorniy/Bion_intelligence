package com.example.bionintelligence.presentation.adapters;

import android.databinding.BindingAdapter;

import com.example.bionintelligence.presentation.custom.ChemistryView;

public class BindingAdapters {
    //заполнение chemistryView значениями с помощью атрибута "item_value"

    @BindingAdapter({"item_value"})
    public static void setItemValue(ChemistryView chemistryView, int value) {
        chemistryView.setItemValue(String.valueOf(value));
    }

//    @BindingAdapter({"item_name_s"})
//    public static void item_name_s(ChemistryView chemistryView, String itemName) {
//        Spannable newElement = new SpannableString(itemName);
//        switch (itemName) {
//            case "K2O": {
//                newElement.setSpan(new RelativeSizeSpan(0.6f), 1, 2, 0);
//                chemistryView.setItemName(newElement);
//            }
//            break;
//            case "H2O": {
//                newElement.setSpan(new RelativeSizeSpan(0.6f), 1, 2, 0);
//                chemistryView.setItemName(newElement);
//            }
//            break;
//            case "P2O5": {
//                newElement.setSpan(new RelativeSizeSpan(0.6f), 1, 2, 0);
//                newElement.setSpan(new RelativeSizeSpan(0.6f), 3, 4, 0);
//                chemistryView.setItemName(newElement);
//            }
//            break;
//        }
//    }
}
