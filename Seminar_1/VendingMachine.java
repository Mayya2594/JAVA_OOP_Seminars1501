package Seminar_1;



public interface VendingMachine {

    Product getProduct(String name);

    
    // private List<Product> productList;
    // private int money;

    // public VendingMachine() {
    //     this.productList = initProduct();
    //     this.money = 0;
    // }

    // public Product getProduct(String name) {
    //     for (Product product : productList) {
    //         if (product.getName().equals(name)) {
    //             money += product.getPrice();
    //             return product;
    //         }
    //     }
    //     return null;
    // }

    // private List<Product> initProduct() {
    //     List<Product> products = new ArrayList<>();
    //     products.add(new Product("name1", 10));
    //     products.add(new Product("name2", 20));
    //     products.add(new Product("name3", 30));
    //     return products;
    // }
}

