package AbstractFactory;

public class Application {

   public static GuiFactory getFactory(String factoryType){
       if(factoryType == null){
           return null;
       }
       else if(factoryType.equalsIgnoreCase("Windows")){
           return new WinFactory();
       }
       else if(factoryType.equalsIgnoreCase("MACOS")){
           return new MacFactory();
       }
       return null;
   }
}
