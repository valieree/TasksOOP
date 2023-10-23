package vsu.course2.task6atta2.drink;

import vsu.course2.task6atta2.Info;

public class Juice implements DrinkProduct, Info {

    private String name;
    private int price;
    private double weight;
    private String country;
    private boolean isCarbonated;
    private boolean isAlcoholic;
    private String taste;

    public Juice(String name, int price, double weight, String country, boolean isCarbonated, boolean isAlcoholic, String taste) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.country = country;
        this.isCarbonated = isCarbonated;
        this.isAlcoholic = isAlcoholic;
        this.taste = taste;
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
                ", Страна производства: " + getCountryOfOrigin() +
                ", Газированный напиток: " + isCarbonated() +
                ", Алкогольный напиток: " + isAlcoholic());
    }

    @Override
    public void buy() {
        System.out.println("Покупка сока...");
        System.out.println("Вес: " + weight);
        System.out.println("Цена: " + price);

    }
    @Override
    public String isCarbonated() {
        if (isCarbonated == true) {
            return "Да";
        } else {
            return "Нет";
        }
    }

    @Override
    public String isAlcoholic() {
        if (isAlcoholic == true) {
            return "Да";
        } else {
            return "Нет";
        }
    }

    @Override
    public String getTaste() {
        return taste;
    }
}
