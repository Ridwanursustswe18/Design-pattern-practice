package Decorator;

public class VegFood implements Food{
    @Override
    public String prepareFood() {
        return "VegFood";
    }

    @Override
    public double foodPrice() {
        return 50;
    }
}
