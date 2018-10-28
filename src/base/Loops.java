package base;

public class Loops {


    public Loops(){
        System.out.println("loops constructor ");
    }


    public void printSimpleArray() {
        System.out.println("first runnable app");

        int[] integersArray = new int[4];


        integersArray[0] = 0;
        integersArray[1] = 1;
        integersArray[2] = 2;
        integersArray[3] = 3;

        for (int i = 0; i < integersArray.length; i++) {
            System.out.println(integersArray[i]);
        }
    }

    public static String message (){

        return "Loops message";
    }

}
