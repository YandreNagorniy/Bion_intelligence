package com.example.bionintelligence.presentation.adapters;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.bionintelligence.presentation.custom.ChemistryView;
import com.example.bionintelligence.presentation.custom.PhaseView;
import com.example.bionintelligence.presentation.custom.SoilFactorView;

public class BindingAdapters {

//    @InverseBindingAdapter(attribute = "sf_value")
//    public static double getItemValue(SoilFactorView view) {
//        return view.getItemValue();
//    }
//
//    @BindingAdapter(value = {
//            "android:onTextChanged",
//            "android:textAttrChanged"},
//            requireAll = false)
//    public static void setTextWatcher(SoilFactorView view,
//                                      final TextViewBindingAdapter.OnTextChanged on,
//                                      final InverseBindingListener textAttrChanged) {
//        TextWatcher newValue = new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                if (on != null) {
//                    on.onTextChanged(s, start, before, count);
//                }
//                if (textAttrChanged != null) {
//                    textAttrChanged.onChange();
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {}
//        };
//
//        TextWatcher oldValue = ListenerUtil.trackListener(view, newValue, R.id.textWatcher);
//        if (oldValue != null) {
//            view.getEtItemValue().removeTextChangedListener(oldValue);
//        }
//        view.getEtItemValue().addTextChangedListener(newValue);
//    }

    //заполнение chemistryView значениями с помощью атрибута "item_value"
    @BindingAdapter({"item_value"})
    public static void setItemValue(ChemistryView chemistryView, int value) {
        chemistryView.setItemValue(String.valueOf(value));
    }

//    @BindingAdapter({"sf_value"})
//    public static void setItemValue(SoilFactorView soilFactorView, double value) {
//        soilFactorView.setItemValue(String.valueOf(value));
//    }

//    @BindingAdapter({"sf_value"})
//    public static void setItemValue(EditText editText, double value) {
//        editText.setText(String.valueOf(value));
//    }

    @BindingAdapter({"new_src"})
    public static void setImage(ImageView imageView, int link) {
        Glide.with(imageView.getContext()).load(link).into(imageView);
    }

    @BindingAdapter({"phase_img"})
    public static void setPhaseImage(PhaseView phaseView, int link) {
        phaseView.setPhaseImage(link);
    }

    @BindingAdapter({"phase_value"})
    public static void setPhases(PhaseView phaseView, double value) {
        if (value < 0) {
            phaseView.setVisibility(View.GONE);
        } else {
            phaseView.setVisibility(View.VISIBLE);
            phaseView.set_phaseValue(value);
        }
    }
}
