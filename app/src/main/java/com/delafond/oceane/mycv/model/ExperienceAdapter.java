package com.delafond.oceane.mycv.model;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.delafond.oceane.mycv.R;

import java.util.ArrayList;

public class ExperienceAdapter extends ArrayAdapter<String> {

    private String[] entreprise;
    private String[] poste;
    private String[] duree;
    private Integer[] imgid;
    private Activity context;

    public ExperienceAdapter(Activity context, String[] entreprise, String[] poste, String[] duree, Integer[] imgid) {
        super(context, R.layout.experience_item, entreprise);

        this.context = context;
        this.entreprise = entreprise;
        this.poste = poste;
        this.duree = duree;
        this.imgid = imgid;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r = convertView;
        ViewHolder viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.experience_item, null, true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) r.getTag();
        }
        viewHolder.ivw.setImageResource(imgid[position]);

        viewHolder.tvw1.setText(entreprise[position]);
        viewHolder.tvw2.setText(poste[position]);
        viewHolder.tvw3.setText(duree[position]);

        return r;

    }

    class ViewHolder {

        TextView tvw1;
        TextView tvw2;
        TextView tvw3;
        ImageView ivw;

        ViewHolder(View v) {
            tvw1 = (TextView) v.findViewById(R.id.textViewEntreprise);
            tvw2 = (TextView) v.findViewById(R.id.textViewPoste);
            tvw3 = (TextView) v.findViewById(R.id.textViewDuree);
            ivw = (ImageView) v.findViewById(R.id.imageView);
        }

    }
}