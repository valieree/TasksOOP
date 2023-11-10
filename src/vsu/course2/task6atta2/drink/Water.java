package vsu.course2.task6atta2.drink;


import vsu.course2.task6atta2.Product;

public class Water extends Product implements DrinkProduct {

    private boolean isCarbonated;
    private boolean isAlcoholic;
    private String taste;

    public Water(String name, int price, double weight, String country, boolean isCarbonated, boolean isAlcoholic, String taste) {
        super(name,price,weight,country);
        this.isCarbonated = isCarbonated;
        this.isAlcoholic = isAlcoholic;
        this.taste = taste;
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
        System.out.println("Покупка воды...");
        System.out.println("Вес: " + getWeight());
        System.out.println("Цена: " + getPrice());
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