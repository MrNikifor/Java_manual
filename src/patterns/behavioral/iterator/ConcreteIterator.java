package patterns.behavioral.iterator;

import java.util.List;

public class ConcreteIterator implements Iterator {
    private List<String> items;
    private int position = 0;

    public ConcreteIterator(List<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Object next() {
        return hasNext() ? items.get(position++) : null;
    }
}
