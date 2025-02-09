package patterns.structural.adapter;

public class AdapterAppToDateBase extends Application implements DateBase {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }
}
