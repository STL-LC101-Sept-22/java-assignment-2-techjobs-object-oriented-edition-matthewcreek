package org.launchcode.techjobs.oo;

import java.util.Comparator;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        int aID = id;
        String aName;
        String aEmployer;
        String aLocation;
        String aPositionType;
        String aCoreCompetency;

        if(name == null && employer == null && location == null && positionType == null && coreCompetency == null) {
            return "OOPS! This job does not seem to exist.";
        }
        if (name == "" && employer.toString() == "" && location.toString() == "" && positionType.toString() == "" && coreCompetency.toString() == ""){
            return "OOPS! This job does not seem to exist.";
        }

        if (name == null || name.toString() == "") {
            aName = "Data not available";
        } else {
            aName = name;
        }
        if (employer == null || employer.toString() == "") {
            aEmployer = "Data not available";
        } else {
            aEmployer = employer.toString();
        }
        if (location == null || location.toString() == "") {
            aLocation = "Data not available";
        } else {
            aLocation = location.toString();
        }
        if (positionType == null || positionType.toString() == "") {
            aPositionType = "Data not available";
        } else {
            aPositionType = positionType.toString();
        }
        if (coreCompetency == null || coreCompetency.toString() == "") {
            aCoreCompetency = "Data not available";
        } else {
            aCoreCompetency = coreCompetency.toString();
        }

        return "\n" +
                "ID: " + aID +
                "\nName: " + aName +
                "\nEmployer: " + aEmployer +
                "\nLocation: " + aLocation +
                "\nPosition Type: " + aPositionType +
                "\nCore Competency: " + aCoreCompetency +
                "\n";

//        return "\nID: " + id +
//                "\nName: " + name +
//                "\nEmployer: " + employer +
//                "\nLocation: " + location +
//                "\nPosition Type: " + positionType +
//                "\nCore Competency: " + coreCompetency + "\n";

//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", employer=" + employer +
//                ", location=" + location +
//                ", positionType=" + positionType +
//                ", coreCompetency=" + coreCompetency +
//                '}';
    }
}
