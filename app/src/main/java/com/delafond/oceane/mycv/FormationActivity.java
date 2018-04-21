package com.delafond.oceane.mycv;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import com.delafond.oceane.mycv.model.Formation;
import com.delafond.oceane.mycv.model.FormationAdapter;

import java.util.ArrayList;

public class FormationActivity extends Activity {

    ArrayList<Formation> formations = new ArrayList<Formation>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formation);

        formations.add(new Formation("BAC Pro Systeme Electronique Numerique", "2013-2015", "Lycee Eugene Ionesco, Issy-les-Moulineaux"));
        formations.add(new Formation("BTS SNIR", "2015-2017", "Lycee Jules Ferry, Versailles"));

        ListView listViewFormations = (ListView) findViewById(R.id.ListViewFormation);
        FormationAdapter formationsAdapter = new FormationAdapter(this, formations);
        listViewFormations.setAdapter(formationsAdapter);
    }
}
