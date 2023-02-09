package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {
    private String value;

    public Employer(String value) {
        super();
        this.value = value;
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
