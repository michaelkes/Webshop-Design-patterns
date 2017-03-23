package sample;

/**
 * Product class voor het aanmaken van Product objecten
 */
public class Product {

    private static int productNr;
    private static String product;
    private static String productDescription;
    private double price;
    private int Stock;


    public Product(int productNr, String product, String productDescription, double price, int Stock)
    {
        this.productNr = productNr;
        this.product = product;
        this.productDescription = productDescription;
        this.price = price;
        this.Stock = Stock;
    }

}
