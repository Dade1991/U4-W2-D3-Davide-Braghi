package model;

public class Customer {

    //Attributi

    private long id;
    private String name;
    private int tier;

    //Costruttori

    public Customer(long id, String name, int tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
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

    public int getTier() {
        return tier;
    }

    //Setter

    public void setTier(int tier) {
        this.tier = tier;
    }
}
