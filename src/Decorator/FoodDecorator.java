package Decorator;

public abstract class FoodDecorator implements Food{
    Food newFood;
   @Override
    public String prepareFood(){
       return  newFood.prepareFood();

   }
   @Override
    public  double foodPrice(){

       return newFood.foodPrice();
   }
   public FoodDecorator(Food newFood){
       this.newFood = newFood;
   }
}
