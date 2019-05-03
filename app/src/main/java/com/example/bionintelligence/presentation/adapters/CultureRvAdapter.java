package com.example.bionintelligence.presentation.adapters;

import android.content.Intent;
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
    private static ClickListener clickListener;

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

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        CardCultureBinding binding;

        ViewHolder(CardCultureBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            binding.containerCulture.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            clickListener.onItemClick(getAdapterPosition(), v);
        }
    }

    public void setOnItemClickListener(ClickListener clickListener) {
        CultureRvAdapter.clickListener = clickListener;
    }

    public interface ClickListener {
        void onItemClick(int position, View v);
    }
}
