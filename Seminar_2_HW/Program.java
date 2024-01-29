package Seminar_2_HW;

public class Program {
    public static void main(String[] args) {
        Human human1 = new Human("Петя");
        Human human2 = new Human("Вася");
        Human human3 = new Human("Игорь");

        Market market = new Market();
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.update();
    }
}
