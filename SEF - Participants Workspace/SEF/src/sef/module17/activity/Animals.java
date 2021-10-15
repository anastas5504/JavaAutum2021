package sef.module17.activity;

import java.util.ArrayList;

public class Animals {
    private ArrayList<String> species = new ArrayList<>();
    private String color;

    public Animals(){
        species.add("Cat");
        species.add("Mouse");
        species.add("Dog");
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        }
    }

    public String getColor(int index) {
        return color;
    }

    public void setSpecies(int index, String specie) {
        if ( index >= 0 && index <= this.species.size() )
        this.species.add(index, specie);
    }

    public String getSpecies(int index) {
        if (index >= 0 && index <= this.species.size()) {
            return species.get(index);
        }
        throw new IllegalArgumentException("Index was out of bounds");
    }

    public String getColorSpecies(int index) {
        return "Animal species are " + species.get(index) + "and its color is " + color;
    }
}
