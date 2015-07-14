package com.stevencipriano.hellouniverse;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by steve on 7/13/15.
 */
public class EditGalaxy extends Activity {
    Button colonyButton, popButton, fleetButton, shipsButton;
    EditText colonyEdit, popEdit, fleetEdit, shipsEdit;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        this.instantiateUi();

        this.colonyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.leninsWay.galaxy_colonies = Long.parseLong(colonyEdit.getText().toString());
            }
        });

        this.popButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity.leninsWay.galaxy_lifeforms = Double.parseDouble(popEdit.getText().toString());
            }
        });

        this.fleetButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity.leninsWay.galaxy_fleets = Integer.parseInt(fleetEdit.getText().toString());
            }
        });

        this.shipsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MainActivity.leninsWay.galaxy_starships = Integer.parseInt(shipsEdit.getText().toString());
            }
        });
    }

    private void instantiateUi() {
        this.colonyButton = (Button)findViewById(R.id.submit_colony);
        this.popButton = (Button)findViewById(R.id.submit_pop);
        this.fleetButton = (Button)findViewById(R.id.submit_fleet);
        this.shipsButton = (Button)findViewById(R.id.submit_ships);

        this.colonyEdit = (EditText)findViewById(R.id.edit_colony);
        this.popEdit = (EditText)findViewById(R.id.edit_pop);
        this.fleetEdit = (EditText)findViewById(R.id.edit_fleet);
        this.shipsEdit = (EditText)findViewById(R.id.edit_ships);
    }
}
