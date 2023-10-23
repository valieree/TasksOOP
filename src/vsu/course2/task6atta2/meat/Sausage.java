package vsu.course2.task6atta2.meat;

import vsu.course2.task6atta2.Info;
import vsu.course2.task6atta2.Product;

public class Sausage implements MeatProduct, Info {
    private String name;
    private int price;
    private double weight;
    private String country;
    private String animalType;
    private boolean frozen;

    public Sausage(String name, int price, double weight, String country, String animalType, boolean frozen) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.country = country;
        this.animalType = animalType;
        this.frozen = frozen;
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
                ", Тип животного: " + getAnimalType() +
                ", Замороженный или охлажденный товар: " + isFrozen());
    }


    @Override
    public double calculatePrice() {
        return weight * price;
    }

    @Override
    public String getAnimalType() {
        return animalType;
    }

    @Override
    public String isFrozen() {
        if (frozen == true) {
            return "Замороженный товар";
        } else {
            return "Охлажденный товар";
        }

    }

    @Override
    public void buy() {
        System.out.println("Покупка колбасы...");
        System.out.println("Вес: " + weight);
        System.out.println("Итоговая цена: " + calculatePrice());

    }
}
