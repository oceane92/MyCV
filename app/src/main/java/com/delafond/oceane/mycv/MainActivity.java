package com.delafond.oceane.mycv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonCompetences = (Button) findViewById(R.id.buttonCompetences);
        Button buttonExperiences = (Button) findViewById(R.id.buttonExperience);
        Button buttonFormations = (Button) findViewById(R.id.buttonFormations);

        buttonCompetences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), CompetencesActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
        buttonExperiences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), ExperienceActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
        buttonFormations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), FormationActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
