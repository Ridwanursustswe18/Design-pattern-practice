package AbstractFactory;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("render a button macos type");
    }
}
