package org.launchcode.techjobs.oo;

import java.util.Objects;

public class JobField {
    private int id;
    private static int nextId = 1;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
