package oop;

public class ParentClass {

    private String name;

    private int age;

    public ParentClass (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}

    public int getAge () {
        return age;
    }

    @Override

    public String toString () {

        return  String.format("Name: %s - Age: %s,",
                name,
                age);
    }
}
