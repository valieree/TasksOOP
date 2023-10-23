package vsu.course2.task6atta2;

public abstract class Product implements Info {
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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String getCountryOfOrigin() {
        return country;
    }

    @Override
    public void printProductInfo() {
        System.out.println("Название: " + getName() +
                ", Цена: " + getPrice() +
                ", Вес: " + getWeight() +
                ", Страна производства: " + getCountryOfOrigin());

    }

    @Override
    public void buy() {
        System.out.println("Покупка...");
        System.out.println("Вес: " + weight);
        System.out.println("Цена: " + price);

    }
}
