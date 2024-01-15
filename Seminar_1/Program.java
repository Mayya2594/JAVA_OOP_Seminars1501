package Seminar_1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new BottleOfWater("name1", 10, 1));
        products.add(new BottleOfWater("name2", 20, 2));

        BottleOfWaterVendingMachine vendWater1 = new BottleOfWaterVendingMachine (products);

        System.out.println(vendWater1.getProduct("name1", 1));
        System.out.println(vendWater1.getProduct("name2", 2));
        
    }
}
