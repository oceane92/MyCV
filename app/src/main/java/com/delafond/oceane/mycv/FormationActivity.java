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

import com.delafond.oceane.mycv.model.FormationAdapter;

public class FormationActivity extends Activity {

    private ListView lst;
    String[] diplome = {"BAC Pro Systeme Electronique Numerique","BTS Système Numérique Informatique Réseau"};
    String[] ecole = {"Lycee Eugene Ionesco, Issy-les-Moulineaux","Lycee Jules Ferry, Versailles"};
    String[] annee = {"2012-2015","2015-2017"};
    Integer[] imgid = {R.drawable.logo_ionesco,R.drawable.logo_julesferry};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formation);

        lst = (ListView) findViewById(R.id.ListViewFormation);

        FormationAdapter customListView = new FormationAdapter(this,diplome,ecole,annee,imgid);
        lst.setAdapter(customListView);
        lst.setOnItemClickListener(new FormationActivity.ItemList());
    }

    /**
     * Action sur listView avec lien vers le site des différentes écoles
     */
    class ItemList implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            ViewGroup vg = (ViewGroup) view;
            TextView tv = (TextView) vg.findViewById(R.id.textViewEcole);

            if (tv.getText().toString() == "Lycee Eugene Ionesco, Issy-les-Moulineaux"){
                Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse("http://www.lyc-ionesco-issy.ac-versailles.fr/"));
                startActivity(intent);
            } else if(tv.getText().toString() == "Lycee Jules Ferry, Versailles"){
                Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse("http://www.lyc-ferry-versailles.ac-versailles.fr/pages/indexpag.html"));
                startActivity(intent);
            }
        }
    }
}
