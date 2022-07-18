package Decorator;

public class Demo {
    public static void main(String[] args) {
       VegFood vegFood = new VegFood();
       NonVegFood nonVegFood = new NonVegFood(new ChineeseFood(vegFood));
        System.out.println(nonVegFood.foodPrice());

    }
}
