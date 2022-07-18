package Factory2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();

            while (!command.equalsIgnoreCase("stop")) {

                     command = scan.nextLine();
                    ShapeFactory shapeFactory = new ShapeFactory();
                    System.out.println("Enter the shape you want to draw");
                    Scanner scanner = new Scanner(System.in);
                    String shapeName = scanner.nextLine();
                     Shape shape = shapeFactory.getShape(shapeName);
                     try {
                         shape.draw();
                     }
                         catch (NullPointerException e){
                             e.printStackTrace();
                         }





            }
            }



        }





