package AbstractFactory;

public class WinCheckBox implements CheckBox{
    @Override
    public void paintCheckbox() {
        System.out.println("render an window style checkbox");
    }
}
