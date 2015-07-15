package com.stevencipriano.hellouniverse;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.content.Intent;


public class MainActivity extends ActionBarActivity {
    static Galaxy leninsWay;
    TextView nameData, solarData, habitData, colonyData, popData, fleetData, shipsData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.createDefaultGalaxy();
        this.createUiTextViews();
        this.transferDataValues();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.edit_galaxy:
                Intent edit_intent = new Intent(this, EditGalaxy.class);
                this.startActivity(edit_intent);
                break;
            case R.id.action_settings:
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }

    protected void onResume() {
        super.onResume();
        this.transferDataValues();
    }

    private void createDefaultGalaxy() {
        leninsWay = new Galaxy("Lenin's Way", 511, 97);
        leninsWay.setGalaxyColonies(37579231);
        leninsWay.setGalaxyPopulation(1967387132);
        leninsWay.setGalaxyFleets(237);
        leninsWay.setGalaxyStarships(34769);
    }

    private void createUiTextViews() {
        this.nameData = (TextView)findViewById(R.id.name);
        this.solarData = (TextView)findViewById(R.id.solar);
        this.habitData = (TextView)findViewById(R.id.habit);
        this.colonyData = (TextView)findViewById(R.id.colony);
        this.popData = (TextView)findViewById(R.id.pop);
        this.fleetData = (TextView)findViewById(R.id.fleet);
        this.shipsData = (TextView)findViewById(R.id.ships);
    }

    private void transferDataValues() {
        this.nameData.setText(leninsWay.galaxy_name);
        this.solarData.setText(String.valueOf(leninsWay.galaxy_solar_systems));
        this.habitData.setText(String.valueOf(leninsWay.galaxy_planets));
        this.colonyData.setText(String.valueOf(leninsWay.galaxy_colonies));
        this.popData.setText(String.valueOf(leninsWay.galaxy_lifeforms));
        this.fleetData.setText(String.valueOf(leninsWay.galaxy_fleets));
        this.shipsData.setText(String.valueOf(leninsWay.galaxy_starships));
    }
}
