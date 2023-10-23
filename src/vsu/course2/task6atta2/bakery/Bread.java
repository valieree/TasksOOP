package vsu.course2.task6atta2.bakery;

import vsu.course2.task6atta2.Product;

public class Bread extends Product {
 private boolean isGlutenFree;
 private boolean isWholeGrain;

 public Bread(String name, int price, double weight, String country, boolean isGlutenFree, boolean isWholeGrain) {
  super(name, price, weight, country);
  this.isGlutenFree = isGlutenFree;
  this.isWholeGrain = isWholeGrain;
 }

}
