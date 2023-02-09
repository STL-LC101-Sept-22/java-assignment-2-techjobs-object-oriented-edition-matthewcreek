package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField {
    private String value;

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.
    public Location(String aValue) {
        super();
        this.value = aValue;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    // Getters and Setters:

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
