package vsu.course2.task6atta2;

import vsu.course2.task6atta2.bakery.Bread;
import vsu.course2.task6atta2.drink.Juice;
import vsu.course2.task6atta2.meat.Sausage;
import vsu.course2.task6atta2.milk.Cheese;
import vsu.course2.task6atta2.sweet.Candy;

public class Main {
    public static void main(String[] args) {
        Sausage sausage = new Sausage("Krya", 100, 100, "Russia", "Svin", true);
        sausage.printProductInfo();
        sausage.buy();
        Cheese cheese = new Cheese();
        cheese.printProductInfo();
        Candy candy = new Candy("Milka", 250, 500, "France", false, 300);
        System.out.println(candy.getCaloriesPerPack());
        candy.buy();
        candy.printProductInfo();
        Juice juice = new Juice("J7", 100, 1000, "Russia", false, false, "Apple");
        juice.printProductInfo();
        Bread bread = new Bread("Bread", 100, 250, "Russia", false, false);
        bread.buy();
        bread.printProductInfo();
    }
}
