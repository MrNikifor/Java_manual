package patterns.generating.prototype;

public interface Sheep {
    Sheep clone();
    String getName();
    void setName(String name);
}
