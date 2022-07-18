package AbstractFactory;

public class WinButton implements Button{
    @Override
    public void paint() {
        System.out.println("render an button windows style");
    }
}
