package com.stevencipriano.hellouniverse;

/**
 * Created by steve on 7/6/15.
 */
public class Galaxy {
    String galaxy_name;
    int galaxy_solar_systems;
    int galaxy_planets;
    long galaxy_colonies;
    double galaxy_lifeforms;
    int galaxy_fleets;
    int galaxy_starships;

    public Galaxy(String name, int solar_sys, int planets) {
        this.galaxy_name = name;
        this.galaxy_solar_systems = solar_sys;
        this.galaxy_planets = planets;
        this.galaxy_colonies = 0;
        this.galaxy_lifeforms = 0;
        this.galaxy_fleets = 0;
        this.galaxy_starships = 0;
    }

    void setGalaxyColonies(long number_colonies) {
        this.galaxy_colonies = number_colonies;
    }

    long getGalaxyColonies() {
        return this.galaxy_colonies;
    }

    void setGalaxyPopulation(double number_lifeforms) {
        this.galaxy_lifeforms = number_lifeforms;
    }

    double getGalaxyPopulation() {
        return this.galaxy_lifeforms;
    }

    void setGalaxyFleets(int number_fleets) {
        this.galaxy_fleets = number_fleets;
    }

    int getGalaxyFleets() {
        return this.galaxy_fleets;
    }

    void setGalaxyStarships(int number_starships) {
        this.galaxy_starships = number_starships;
    }

    int getGalaxyStarships() {
        return this.galaxy_starships;
    }
}
