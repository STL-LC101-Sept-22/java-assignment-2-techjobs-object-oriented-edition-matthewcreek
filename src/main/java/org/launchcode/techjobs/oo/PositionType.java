package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {
    private String value;

    public PositionType(String value) {
        super();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    @Override
    public String toString() {
        return value;
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.


    // Getters and Setters:

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
