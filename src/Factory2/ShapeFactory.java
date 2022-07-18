package Factory2;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        try {
            if (shapeType == null){
                return null;
            }
            else if(shapeType.equalsIgnoreCase("Circle") ){
                return new Circle();
            }
            else if(shapeType.equalsIgnoreCase("Square") ){
                return new Square();
            }
            else if(shapeType.equalsIgnoreCase("Rectangle") ){
                return new Rectangle();
            }
        }catch (NullPointerException ne){
            ne.printStackTrace();
        }


        return null;
    }
}
