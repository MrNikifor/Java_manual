package patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyCollection implements IterableCollection{
    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(items);
    }
}
