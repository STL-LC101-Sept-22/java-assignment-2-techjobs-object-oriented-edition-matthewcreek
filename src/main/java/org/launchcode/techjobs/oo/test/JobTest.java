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
    public void testSettingJobId (){
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
        assertEquals(testJob.getLocation().getValue(),"Desert");
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertEquals(testJob.getPositionType().getValue(), "Quality control");
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(testJob.getCoreCompetency().getValue(),"Persistence");
        assertTrue(testJob instanceof Job);
        assertEquals(testJob.getName(),"Product tester");
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
        System.out.println(testJob.toString());;
        String testString = testJob.toString();
        String firstChar = String.valueOf(testString.charAt(0));
        int lastLength = testString.length() - 1;
        String lastChar = String.valueOf(testString.charAt(lastLength));
        assertEquals(firstChar,"\n");
        assertEquals(lastChar,"\n");
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
        assertEquals(spec,expected,actual);
    }
}
