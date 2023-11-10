package vsu.course2.task6atta2.meat;

import vsu.course2.task6atta2.Product;

public class Sausage extends Product implements MeatProduct {

    private String animalType;
    private boolean frozen;

    public Sausage(String name, int price, double weight, String country, String animalType, boolean frozen) {
        super(name,price,weight,country);
        this.animalType = animalType;
        this.frozen = frozen;
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
        return getWeight() * getPrice();
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
        System.out.println("Вес: " + getWeight());
        System.out.println("Итоговая цена: " + calculatePrice());

    }
}
