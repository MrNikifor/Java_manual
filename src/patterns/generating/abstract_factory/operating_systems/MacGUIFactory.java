package patterns.generating.abstract_factory.operating_systems;

public class MacGUIFactory implements GUIFactory {
    public MacGUIFactory() {
        System.out.println("Mac GUI Factory");
    }

    @Override
    public Button createButton() {
        System.out.println("Mac Button");
        return new MacButton();
    }

    @Override
    public Select createSelect() {
        System.out.println("Mac Select");
        return new MacSelect();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Mac TextField");
        return new MacTextField();
    }
}
