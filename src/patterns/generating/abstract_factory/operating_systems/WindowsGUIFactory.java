package patterns.generating.abstract_factory.operating_systems;

public class WindowsGUIFactory implements GUIFactory {

    public WindowsGUIFactory() {
        System.out.println("Windows GUI Factory");
    }

    @Override
    public Button createButton() {
        System.out.println("Windows GUI Button");
        return new WindowsButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("Windows GUI Select");
        return new WindowsSelect();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Windows GUI TextField");
        return new WindowsTextField();
    }
}
