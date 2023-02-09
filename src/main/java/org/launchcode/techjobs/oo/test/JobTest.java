package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        String spec = "each instance of Job should have a unique ID";
        Job expected = new Job();
        Job actual = new Job();
        assertNotEquals(spec, expected.getId(), actual.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        String spec = "each instance of Job should have all fields set correctly";
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertEquals(testJob.getEmployer().getValue(), "ACME");
        assertTrue(testJob.getLocation() instanceof Location);
        assertEquals(testJob.getLocation().getValue(), "Desert");
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertEquals(testJob.getPositionType().getValue(), "Quality control");
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");
        assertTrue(testJob instanceof Job);
        assertEquals(testJob.getName(), "Product tester");
    }

    @Test
    public void testJobsForEquality() {
        String spec = "job entries with the same fields will still have unique IDs";
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob1.equals(testJob2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        String spec = "each job listing starts and ends with a newline character";
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(testJob.toString());
        ;
        String testString = testJob.toString();
        char firstChar = testString.charAt(0);
        int lastLength = testString.length() - 1;
        char lastChar = testString.charAt(lastLength);
        assertEquals(firstChar, '\n');
        assertEquals(lastChar, '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        String spec = "value of fields is reported correctly";
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String actual = testJob.toString();
        String expected = "\nID: " + testJob.getId() +
                "\nName: " + testJob.getName() +
                "\nEmployer: " + testJob.getEmployer() +
                "\nLocation: " + testJob.getLocation() +
                "\nPosition Type: " + testJob.getPositionType() +
                "\nCore Competency: " + testJob.getCoreCompetency() +
                "\n";
        assertEquals(expected, actual);
    }

    @Test
    public void testToStringEmptyName() {
        String spec = "if name reports null 'Data not available' is returned";
        Job nullName = new Job(null, new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = "\nID: " + nullName.getId() +
                "\nName: Data not available" +
                "\nEmployer: " + nullName.getEmployer() +
                "\nLocation: " + nullName.getLocation() +
                "\nPosition Type: " + nullName.getPositionType() +
                "\nCore Competency: " + nullName.getCoreCompetency() +
                "\n";
        String actual = nullName.toString();
        System.out.println(nullName.toString());
        assertEquals(spec, expected, actual);
    }

    @Test
    public void testToStringEmptyEmployer() {
        String spec = "if employer reports null 'Data not available' is returned";
        Job nullEmployer = new Job("Product tester", null, new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = "\nID: " + nullEmployer.getId() +
                "\nName: " + nullEmployer.getName() +
                "\nEmployer: Data not available" +
                "\nLocation: " + nullEmployer.getLocation() +
                "\nPosition Type: " + nullEmployer.getPositionType() +
                "\nCore Competency: " + nullEmployer.getCoreCompetency() +
                "\n";
        String actual = nullEmployer.toString();
        System.out.println(nullEmployer.toString());
        assertEquals(spec, expected, actual);
    }

    @Test
    public void testToStringEmptyLocation() {
        String spec = "if location reports null 'Data not available' is returned";
        Job nullLocation = new Job("Product tester", new Employer("ACME"), null, new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = "\nID: " + nullLocation.getId() +
                "\nName: " + nullLocation.getName() +
                "\nEmployer: " + nullLocation.getEmployer() +
                "\nLocation: Data not available" +
                "\nPosition Type: " + nullLocation.getPositionType() +
                "\nCore Competency: " + nullLocation.getCoreCompetency() +
                "\n";
        String actual = nullLocation.toString();
        System.out.println(nullLocation.toString());
        assertEquals(spec, expected, actual);
    }

    @Test
    public void testToStringEmptyPositionType() {
        String spec = "if positionType reports null 'Data not available' is returned";
        Job nullPosition = new Job("Product tester", new Employer("ACME"), new Location("Desert"), null, new CoreCompetency("Persistence"));
        String expected = "\nID: " + nullPosition.getId() +
                "\nName: " + nullPosition.getName() +
                "\nEmployer: " + nullPosition.getEmployer() +
                "\nLocation: " + nullPosition.getLocation() +
                "\nPosition Type: Data not available" +
                "\nCore Competency: " + nullPosition.getCoreCompetency() +
                "\n";
        String actual = nullPosition.toString();
        System.out.println(nullPosition.toString());
        assertEquals(spec, expected, actual);
    }

    @Test
    public void testToStringEmptyCoreCompetency() {
        String spec = "if coreCompetency reports null 'Data not available' is returned";
        Job nullCoreCompetency = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), null);
        String expected = "\nID: " + nullCoreCompetency.getId() +
                "\nName: " + nullCoreCompetency.getName() +
                "\nEmployer: " + nullCoreCompetency.getEmployer() +
                "\nLocation: " + nullCoreCompetency.getLocation() +
                "\nPosition Type: " + nullCoreCompetency.getPositionType() +
                "\nCore Competency: Data not available" +
                "\n";
        String actual = nullCoreCompetency.toString();
        System.out.println(nullCoreCompetency.toString());
        assertEquals(spec, expected, actual);
    }
    @Test
    public void testToStringHandlesEmptyField() {
        String spec = "if empty strings are used as values 'Data not available' is returned";
        Job testJob = new Job("Web Developer",new Employer(""),new Location("StL"),new PositionType(""),new CoreCompetency("Java"));
        String actual = testJob.toString();
        String expected = "\nID: " + testJob.getId() +
                "\nName: " + testJob.getName() +
                "\nEmployer: Data not available" +
                "\nLocation: " + testJob.getLocation() +
                "\nPosition Type: Data not available" +
                "\nCore Competency: " + testJob.getCoreCompetency() +
                "\n";
        assertEquals(actual,expected);
    }
    @Test
    public void testEmptyJobReturnsString() {
        String spec = "if ID is the only parameter return 'Job doesn't exist'";
        Job testJob = new Job();
        String expected = "OOPS! This job does not seem to exist.";
        String actual = testJob.toString();
        assertEquals(spec,expected,actual);
    }
}
