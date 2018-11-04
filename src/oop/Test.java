package oop;

import static oop.Learnable.learnJava;

public class Test {

    public static void main(String[] args) {



        ChildClass child = new ChildClass(
                "Adela", 2,"Colegiul Banatean");

        System.out.println(child);//calls child.toString

        //methods from Learnable
        child.learn();
        //static
        learnJava(8);
        System.out.println(child.speak("mama"));


        //UppercaseChild
        ChildClass uppercaseChild = new UppercaseChild(
                "Maria",
                8,
                "Colegiul Banatean");

        System.out.println("uppercaseChild is an instance of:"
               + uppercaseChild.getClass().getName());


        System.out.println(uppercaseChild instanceof UppercaseChild);
        System.out.println(uppercaseChild instanceof ChildClass);
        System.out.println(uppercaseChild instanceof ParentClass);
        System.out.println(uppercaseChild instanceof Object);

        System.out.println(uppercaseChild);
        uppercaseChild.learn();
        //overrided Learnable default method "speak"
        System.out.println(uppercaseChild.speak("this is my first school year"));
    }
}
