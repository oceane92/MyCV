package com.delafond.oceane.mycv.model;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.delafond.oceane.mycv.R;

public class FormationAdapter extends ArrayAdapter<String> {

    private String[] diplome;
    private String[] ecole;
    private String[] annee;
    private Integer[] imgid;
    private Activity context;

    public FormationAdapter(Activity context, String[] diplome, String[] ecole, String[] annee, Integer[] imgid) {
        super(context, R.layout.formation_item, diplome);

        this.context = context;
        this.diplome = diplome;
        this.ecole = ecole;
        this.annee = annee;
        this.imgid = imgid;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r = convertView;
        FormationAdapter.ViewHolder viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.formation_item, null, true);
            viewHolder = new FormationAdapter.ViewHolder(r);
            r.setTag(viewHolder);
        } else {
            viewHolder = (FormationAdapter.ViewHolder) r.getTag();
        }
        viewHolder.ivw.setImageResource(imgid[position]);

        viewHolder.tvw1.setText(diplome[position]);
        viewHolder.tvw2.setText(ecole[position]);
        viewHolder.tvw3.setText(annee[position]);

        return r;

    }

    class ViewHolder {

        TextView tvw1;
        TextView tvw2;
        TextView tvw3;
        ImageView ivw;

        ViewHolder(View v) {
            tvw1 = (TextView) v.findViewById(R.id.textViewDiplome);
            tvw2 = (TextView) v.findViewById(R.id.textViewEcole);
            tvw3 = (TextView) v.findViewById(R.id.textViewAnnee);
            ivw = (ImageView) v.findViewById(R.id.imageViewFormation);
        }

    }
}