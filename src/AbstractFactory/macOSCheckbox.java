package AbstractFactory;

public class macOSCheckbox implements CheckBox{
    @Override
    public void paintCheckbox() {
        System.out.println("render a macos type checkbox");
    }
}
