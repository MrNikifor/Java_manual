package Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

/*Элементами HashMap являются пары ключ/значение.HashMap не запоминает порядок добавления элементов.
* Его методы работают очень быстро.
* Ключи элементов должны быть уникальными.Ключ может быть null
* Значение элементов могут повторяться. Значение может быть null*/
public class HashMapMetods {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(4343,"Вася Дацко");
        map1.put(2363,"Миша Курк");
        map1.put(9890,"Кирилл Вап");
        map1.put(2756,"Даша Мигина");
        System.out.println(map1);

        // putIfAbsent - добавь элемент если еще такого нет.
        map1.putIfAbsent(4343,"Костя Лапшин");
        System.out.println(map1);

        // get - беретзначени по ключу
        System.out.println(map1.get(2363));

        // remove - удаляет элемент
        map1.remove(9890);
        System.out.println(map1);

        // containsValue - возвращает true если имеется значение с таким объектом
        System.out.println(map1.containsValue("Миша Курк"));

        // containsKey - возвращает true если имеется ключь с таким объектом
        System.out.println(map1.containsKey(2363));

        // keySet - возвращает все ключи
        System.out.println(map1.keySet());

        // values - возвращает все значения
        System.out.println(map1.values());



    }
}
