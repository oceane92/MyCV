package com.delafond.oceane.mycv;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.delafond.oceane.mycv.model.ExperienceAdapter;

public class ExperienceActivity extends Activity {

    private ListView lst;
    String[] entreprise = {"GDV Informatique (Paris 14ème)","RATP M2E ITV (La Défense)"};
    String[] poste = {"Technicienne","Technicienne supérieure"};
    String[] duree = {"18 semaines","6 semaines"};
    Integer[] imgid = {R.drawable.logo_gdv,R.drawable.logo_ratp};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.experiences);

        lst = (ListView) findViewById(R.id.ListViewExperience);

        ExperienceAdapter customListView = new ExperienceAdapter(this,entreprise,poste,duree,imgid);
        lst.setAdapter(customListView);
        lst.setOnItemClickListener(new ItemList());
    }

    /**
     * Action sur listView avec lien vers le site des différentes entreprises
     */
    class ItemList implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            ViewGroup vg = (ViewGroup) view;
            TextView tv = (TextView) vg.findViewById(R.id.textViewEntreprise);

            if (tv.getText().toString() == "GDV Informatique (Paris 14ème)"){
                Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse("http://www.gdvinformatique.fr"));
                startActivity(intent);
            } else if(tv.getText().toString() == "RATP M2E ITV (La Défense)"){
                Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse("https://www.ratp.fr/groupe-ratp"));
                startActivity(intent);
            }
        }
    }
}
