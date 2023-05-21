package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// ArrayList — это структура данных в языке Java, предназначенная для хранения множества значений.
// Это усовершенствованный массив, в котором можно изменять количество элементов и с легкостью выполнять с ними
// различные операции. Такие структуры данных в целом называют динамическими массивами.
public class CreatureArrayList {
    public static void main(String[] args) {
        // 1) Способ создания: Создаем ArrayList и в дженериках<> указываем тип с которым будем работать(String)
        ArrayList <String> arrayStr = new ArrayList<>();
        arrayStr.add("Иван");
        arrayStr.add("Вася");
        arrayStr.add("Инна");

        // 2) Способ создания: Создаем на определенное количество элементов, тем самым увеличивая скорость добавления
        // эелементов в ArrayList
        ArrayList <String> array = new ArrayList<>(100);

        // 3) Способ создания: Когда при создании помещаем в параметры конструктора другой ArrayList
        ArrayList <String> arrayStr2 = new ArrayList<>(arrayStr);

        // Также можно создавать от коллекций которые стоят выше по иерархии, тоесть на основе List, Collection, Iterable
        // и весь функционал будет также работать с ArrayList
        Iterable <String> arrayStr3 = new ArrayList<>();
        Collection<String> arrayStr4 = new ArrayList<>();
        List<String> arrayStr5 = new ArrayList<>();
    }
}
