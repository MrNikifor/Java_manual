package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

// Iterator - итерфейс который служит для проверки, вывода и удаления элеметнов в листе
public class IteratorWork {
    public static void main(String[] args) {
        ArrayList<String> arrayStr = new ArrayList<>();
        arrayStr.add("Иван");
        arrayStr.add("Вася");
        arrayStr.add("Инна");
        arrayStr.add("Томара");
        System.out.println(arrayStr);

        // Выведем элементы с листа
        Iterator<String> iterator = arrayStr.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Удалим элементы
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayStr);
    }
}
