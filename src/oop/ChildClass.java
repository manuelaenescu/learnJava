package oop;

public class ChildClass

        extends ParentClass

    implements Learnable
{

    //fields
    private String schoolName;

    //constructor
    public ChildClass(
            String name, int age,String schoolName) {

        //parent constructor
        super(name, age);

        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {

        return super.toString()
                +"- School:" + schoolName;
    }


    @Override
    public void learn() {
        System.out.println("learning...");
    }
}
