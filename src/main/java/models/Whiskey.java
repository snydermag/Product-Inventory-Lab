package models;

public class Whiskey {
    private Integer id;
    private String name;
    private String brand;
    private String location;
    private int size;
    private int qty;
    private float price;

    public Whiskey(){
        this(0, null, null, null, 0, 0, 0);
    }

    public Whiskey(Integer id, String name, String brand, String location, int size, int qty, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.location = location;
        this.size = size;
        this.qty = qty;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
