package Decorator;

public class NonVegFood extends FoodDecorator{
    public NonVegFood(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + "With Chicken Tnadoori";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice() +100.00;
    }
}
