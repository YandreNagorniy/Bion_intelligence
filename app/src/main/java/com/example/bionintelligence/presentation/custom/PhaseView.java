package com.example.bionintelligence.presentation.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.bionintelligence.R;

public class PhaseView extends FrameLayout {
    private EditText et_phaseValue;
    private ImageView et_phaseImage;

    public PhaseView(Context context) {
        this(context, null);
    }

    public PhaseView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PhaseView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflate(context, R.layout.phase_layout, this);

        TypedArray array = getContext().obtainStyledAttributes(attrs, R.styleable.PhaseView);

        Float phaseValue = array.getFloat(R.styleable.PhaseView_phase_value, 0);

        et_phaseValue = findViewById(R.id.et_phaseValue);

        et_phaseValue.setText(String.valueOf(phaseValue));
        array.recycle();
    }

    public ImageView getPhaseImage() {
        return et_phaseImage;
    }

    public void setPhaseImage(int link) {
        Glide.with(et_phaseImage.getContext()).load(link).into(et_phaseImage);
    }
}
