package AbstractFactory;

public class MacFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new macOSCheckbox();
    }
}
