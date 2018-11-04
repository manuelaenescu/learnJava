package bank;

public class BankAccountTest {

    public static void main(String[] args) {

        Person employee1 = new Person("John",
                Employer.BRD,
                "Timisoara"
        );

        employee1.setName("Jane");

        System.out.println(employee1);

        BankAccount johnsAccount = new BankAccount (employee1, 10000, 1111);

        System.out.println(johnsAccount);

    }
}
