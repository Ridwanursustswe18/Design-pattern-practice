package AbstractFactory;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Enter `start` to start to start the app");
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();

            while (!command.equalsIgnoreCase("stop")) {
                Application application = new Application();
                Scanner scanner = new Scanner(System.in);
                String factoryName = scanner.nextLine();
                try{
                    GuiFactory guiFactory = application.getFactory(factoryName);
                    Button button = guiFactory.createButton();
                    button.paint();
                    CheckBox checkBox = guiFactory.createCheckBox();
                    checkBox.paintCheckbox();

                }catch (NullPointerException e){
                    e.printStackTrace();
                }

            }


    }
}
