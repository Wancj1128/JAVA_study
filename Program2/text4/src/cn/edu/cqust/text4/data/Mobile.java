package cn.edu.cqust.text4.data;

public class Mobile {

    /**
     * Holds the name of the mobile.
     */
    private String name;

    /**
     * Holds the price of the mobile.
     */
    private float price;

    /**
     * Creates a new mobile object.
     */
    public Mobile(String name, float price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Gets the name of the mobile.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the price of the mobile.
     */
    public float getPrice() {
        return price;
    }
}
