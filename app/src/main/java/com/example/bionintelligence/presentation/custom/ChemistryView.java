package com.example.bionintelligence.presentation.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.bionintelligence.R;

public class ChemistryView extends FrameLayout {
    private TextView tvItemText;
    private TextView tvItemName;
    private EditText etItemValue;
    private int value;

    public ChemistryView(Context context) {
        this(context, null);
    }

    public ChemistryView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ChemistryView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        inflate(context, R.layout.chemistry_layout, this);

        TypedArray array = getContext().obtainStyledAttributes(attrs, R.styleable.ChemistryView);
        String text = array.getString(R.styleable.ChemistryView_item_text);
        String name = array.getString(R.styleable.ChemistryView_item_name);
        value = array.getInt(R.styleable.ChemistryView_item_value, 0);

        tvItemText = findViewById(R.id.tv_itemText);
        tvItemName = findViewById(R.id.tv_itemName);
        etItemValue = findViewById(R.id.et_itemValue);

        tvItemText.setText(text);
        tvItemName.setText(name);
        etItemValue.setText(String.valueOf(value));
        array.recycle();
    }

    // rename and add to databinding

    public void setItemValue(String element) {
        etItemValue.setText(element);
    }

    public String getItemName() {
        return String.valueOf(tvItemName.getText());
    }

    public void setItemName(String text) {
        tvItemName.setText(text);
    }

    public void setItemName(Spannable text) {
        tvItemName.setText(text, TextView.BufferType.SPANNABLE);
    }
}
