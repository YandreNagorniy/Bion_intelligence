package com.example.bionintelligence.presentation.adapters;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bionintelligence.R;
import com.example.bionintelligence.data.model.CultureModel;
import com.example.bionintelligence.databinding.CardCultureBinding;

import java.util.List;

public class CultureRvAdapter extends RecyclerView.Adapter<CultureRvAdapter.ViewHolder> {
    private List<CultureModel> cultureList;

    public CultureRvAdapter(List<CultureModel> cultureList) {
        this.cultureList = cultureList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        CardCultureBinding binding = DataBindingUtil.inflate(inflater, R.layout.card_culture, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.setCultureModel(cultureList.get(position));
    }

    @Override
    public int getItemCount() {
        return cultureList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        CardCultureBinding binding;

        ViewHolder(CardCultureBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
