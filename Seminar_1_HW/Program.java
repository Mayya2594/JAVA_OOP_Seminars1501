package Seminar_1_HW;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        
        List<Product> productsHotDrink = new ArrayList<>();
        productsHotDrink.add(new HotDrink("tea", 35, 0.2, 50));
        productsHotDrink.add(new HotDrink("latte", 50, 0.4, 40));
        productsHotDrink.add(new HotDrink("americano", 40, 0.2, 45));

        HotDrinkVendingMachine vendHotDrink = new HotDrinkVendingMachine(productsHotDrink);

        System.out.println(vendHotDrink.getProduct("tea", 0.2, 50));
        System.out.println(vendHotDrink.getProduct("latte", 0.4, 40));
        System.out.println(vendHotDrink.getProduct("americano", 0.2, 45));

    }
}
