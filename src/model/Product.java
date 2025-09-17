package model;

public class Product {

    //Attributi

    private long id;
    private String name;
    private String category;
    private double price;

    //Costruttori

    public Product(long id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    //Getter

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //Setter

    public void setName(String name) {
        this.name = name;
    }

    //Getter

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    //Setter

    public void setPrice(double price) {
        this.price = price;
    }
}
