package vsu.course2.task6atta2;

public abstract class Product {
    private String name;
    private int price;
    private double weight;
    private String country;

    public Product(String name, int price, double weight, String country) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.country = country;
    }


    public String getName() {
        return name;
    }



    public int getPrice() {
        return price;
    }


    public double getWeight() {
        return weight;
    }


    public String getCountryOfOrigin() {
        return country;
    }


    public void printProductInfo() {
        System.out.println("Название: " + getName() +
                ", Цена: " + getPrice() +
                ", Вес: " + getWeight() +
                ", Страна производства: " + getCountryOfOrigin());

    }


    public void buy() {
        System.out.println("Покупка...");
        System.out.println("Вес: " + weight);
        System.out.println("Цена: " + price);

    }
}
