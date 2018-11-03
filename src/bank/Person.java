package bank;

import com.sun.org.apache.xml.internal.utils.StringToStringTable;

public class Person {

    private String name;

    private Employer employer;

    private String location;

    public Person(String name, Employer employer, String location) {
        this.name = name;
        this.employer = employer;
        this.location = location;
    }

    @Override
    public String toString(){

        return String.format("\nName: %s\nEmployer: %s\nLocation: %s",
                name,
                employer,
                location);
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }
}
