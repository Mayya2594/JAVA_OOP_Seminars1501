package Seminar_1_HW;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{

    private final List<Product> productList;

    public HotDrinkVendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public HotDrink getProduct(String name, double volume, int temperature) {
        for (Product product : productList) {
            if (product instanceof HotDrink) {
                if (product.getName().equals(name) &&
                    ((HotDrink)product).getVolume() == volume &&
                    ((HotDrink)product).getTemperature() == temperature) {
                    return (HotDrink) product; 
                }
            }
        }
        return null;
    }
}