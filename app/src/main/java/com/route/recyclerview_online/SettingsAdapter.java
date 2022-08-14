package com.route.recyclerview_online;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SettingsAdapter extends RecyclerView.Adapter<SettingsAdapter.SettingsViewHolder> {
    public SettingsAdapter( ArrayList<SettingsItem> items) {
        this.items = items;
    }

    ArrayList<SettingsItem> items;

    @NonNull
    @Override
    public SettingsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_settings, parent, false);
        return new SettingsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SettingsViewHolder holder, int position) {
        SettingsItem item = items.get(position); // 0
        holder.titleTextView.setText(item.title);
        holder.subtitleTextView.setText(item.subtitle);
        holder.settingsIcon.setImageResource(item.imageId);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class SettingsViewHolder extends RecyclerView.ViewHolder{
        TextView titleTextView,subtitleTextView;
        ImageView settingsIcon;
        public SettingsViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.item_settings_title);
            subtitleTextView = itemView.findViewById(R.id.item_settings_subtitle);
            settingsIcon = itemView.findViewById(R.id.item_settings_icon);
        }
    }
}
