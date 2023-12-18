package homework;

public class Money {

    int banknotes5;
    int banknotes10;
    int banknotes20;
    int banknotes50;
    int banknotes100;
    int coins;

    public Money(int coins, int banknotes5, int banknotes10,
                 int banknotes20, int banknotes50, int banknotes100){
        this.coins = coins;
        this.banknotes5 = banknotes5;
        this.banknotes10 = banknotes10;
        this.banknotes20 = banknotes20;
        this.banknotes50 = banknotes50;
        this.banknotes100 = banknotes100;
    }

    public String toString (){
        return (coins+" coins, "+banknotes5+" of 5-Euro-Banknotes, "+banknotes10+" of 10-Euro-Banknotes "+
        banknotes20+" of 20-Euro-Banknotes, "+banknotes50+" of 50-Euro-Bannotes, and "+banknotes100+
        " of 100-Euro-Banknotes.");
    }

}
