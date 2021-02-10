// Written by: Andre Hazim 101141843
// Partner: Shuvaethy Neill 101143478

/**
 * The Product class is a template for products that will be sold in the store
 * @author Andre Hazim
 *
 * @version 1.0
 *
 * @since 2021-02-06
 *
 */

public class Product {
    private final String name;    // The name of the product
    private final int id;         // The id of the product
    private final double price;   // The price of the product

    public Product() {
        this("", 0, 0.0);
    }

    /**
     * Creates a new product with the supplied attributes.
     * The product id and price is by default 0.
     * @param name
     * @param id
     * @param price
     */
    public Product(String name, int id, double price){
        this.name = name;
        this.id = id;
        this.price = price;
    }

    /**
     * Get the name of the product
     * @return name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * Get the id of the product
     * @return product id
     */
    public int getId() {
        return id;
    }
    /**
     * Get the price of the product
     * @return price of product
     */
    public double getPrice() {
        return price;
    }
}
