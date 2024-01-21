package Collection.Set;

import java.util.HashSet;

public class HashSetMethods {
    public static void main(String[] args) {
        HashSet<Integer> setInt1 = new HashSet<>();
        setInt1.add(2);
        setInt1.add(3);
        setInt1.add(1);
        setInt1.add(8);

        HashSet<Integer> setInt2 = new HashSet<>();
        setInt2.add(7);
        setInt2.add(4);
        setInt2.add(3);
        setInt2.add(5);
        setInt2.add(8);
// addAll() может объеденить два множества игнорирюя одинаковые
        HashSet<Integer> union = new HashSet<>(setInt1);
        union.addAll(setInt2);
        System.out.println(union);
// retainAll() выводит только одинаковые элементы из двух сеттов
        HashSet<Integer> intersect = new HashSet<>(setInt1);
        intersect.retainAll(setInt2);
        System.out.println(intersect);

// removeAll() удаляет все элементы которых нет в первом сетте
        HashSet<Integer> subtract = new HashSet<>(setInt1);
        subtract.removeAll(setInt2);
        System.out.println(subtract);

    }
}
