package com.delafond.oceane.mycv.model;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.delafond.oceane.mycv.R;

import java.util.ArrayList;

public class ExperienceAdapter extends BaseAdapter {
    public Activity context;
    public ArrayList<Experiences> experiences;

    public ExperienceAdapter(Activity context, ArrayList<Experiences> experiences) {
        this.context = context;
        this.experiences = experiences;
    }

    @Override
    public String toString() {
        return "ExperienceAdapter{" +
                "context=" + context +
                ", experiences=" + experiences +
                '}';
    }

    @Override
    public int getCount() {
        return this.experiences.size();
    }

    @Override
    public Object getItem(int position) {
        return this.experiences.get(position);
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.experience_item, null);
        TextView textView = (TextView) rowView.findViewById(R.id.textViewExperienceInfo);
        textView.setText(this.experiences.get(position).toString());

        return rowView;
    }
}
