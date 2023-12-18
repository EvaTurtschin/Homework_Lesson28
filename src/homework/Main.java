package homework;

public class Main {
    public static void main(String[] args) {

        Money johnsMoney = new Money(7, 1, 4, 2,
                1, 2);
        Wallet john = new Wallet("John", johnsMoney);


        Wallet kate = new Wallet("Kate", new Money(15, 5,
                3,3,10,3));

        System.out.println(john);
        System.out.println(kate);
    }
}
