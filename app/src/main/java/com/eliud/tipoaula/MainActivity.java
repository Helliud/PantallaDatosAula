package com.eliud.tipoaula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity implements Spinner.OnItemSelectedListener {

    ArrayAdapter adapterGrades;
    ArrayAdapter adapterGroups;
    Spinner grades;
    Spinner groups;
    TextView textViewGrados;
    TextView textViewGrupos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grades = (Spinner) findViewById(R.id.Grado);
        groups = (Spinner) findViewById(R.id.Grupo);

        textViewGrados = (TextView) findViewById(R.id.lbl_grado);
        textViewGrupos = (TextView) findViewById(R.id.lbl_grupo);

        adapterGrades = ArrayAdapter.createFromResource(this, R.array.Select_Num_Salon, android.R.layout.simple_spinner_dropdown_item);
        adapterGroups = ArrayAdapter.createFromResource(this, R.array.Select_letra_Grupo, android.R.layout.simple_spinner_dropdown_item);

        groups.setAdapter(adapterGrades);
        groups.setOnItemSelectedListener(MainActivity .this);

        grades.setAdapter(adapterGroups);
        grades.setOnItemSelectedListener(MainActivity .this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
