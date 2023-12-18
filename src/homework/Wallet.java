package homework;

public class Wallet {

    String owner;
    Money money;

    public Wallet(String owner, Money money){
        this.owner = owner;
        this.money = money;
    }

    public String toString(){
        return "In "+owner+"'s Wallet there are "+money;    }

}
