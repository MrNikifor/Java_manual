package patterns.generating.abstract_factory.operating_systems;

public interface GUIFactory {
    public Button createButton();
    public Select createSelect();
    public TextField createTextField();

}
