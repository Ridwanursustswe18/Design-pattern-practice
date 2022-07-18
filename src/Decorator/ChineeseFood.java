package Decorator;

public class ChineeseFood extends FoodDecorator{
    public ChineeseFood(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + "momo";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice() + 200;
    }
}
