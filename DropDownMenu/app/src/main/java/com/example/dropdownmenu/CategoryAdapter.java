package com.example.dropdownmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CategoryAdapter extends ArrayAdapter<Category>{
    public CategoryAdapter(Context context, int resource,List<Category> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position,View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_selected,parent,false);
        TextView txtSelected = convertView.findViewById(R.id.txtSelected);

        Category category = (Category) this.getItem(position);
        if(category != null){
            txtSelected.setText(category.getName());
        }
        return convertView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category,parent,false);
        TextView txtCategory = convertView.findViewById(R.id.txtCategory);

        Category category = (Category) this.getItem(position);
        if(category != null){
            txtCategory.setText(category.getName());
        }
        return convertView;
    }
}
