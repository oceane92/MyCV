package com.delafond.oceane.mycv;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import com.delafond.oceane.mycv.model.ExperienceAdapter;
import com.delafond.oceane.mycv.model.Experiences;

import java.util.ArrayList;

public class ExperienceActivity extends Activity {

    ArrayList<Experiences> experiences = new ArrayList<Experiences>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.experiences);

        experiences.add(new Experiences("logo", "GDV Informatique", "18 semaines", "Paris 14ème", "Technicienne"));
        experiences.add(new Experiences("logo", "RATP", "6 semaines", "La défense", "Technicienne Superieure"));

        ListView listViewExperiences = (ListView) findViewById(R.id.ListViewExperience);

        ExperienceAdapter experiencesAdapter = new ExperienceAdapter(this, experiences);

        listViewExperiences.setAdapter(experiencesAdapter);
    }
}
