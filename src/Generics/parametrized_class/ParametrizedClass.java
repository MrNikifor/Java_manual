package Generics.parametrized_class;

// ОСНОВНАЯ ЦЕЛЬ GENERICS - ВВОДИТЬ БЕЗОПАСНЫЙ МНОГОРАЗОВЫЙ КОД!
public class ParametrizedClass {
    public static void main(String[] args) {
        // создадим объект нашего класса Info и сделаем его стринговым(можно любым)
        Info<String> infoStr = new Info<>("Привет мой друг");
        System.out.println(infoStr);
        String getStr = infoStr.getValue();   // вызываем метод
        // аналогичто только с Integer
        Info<Integer> infoInt = new Info<>(22);
        System.out.println(infoInt);
        Integer getInt = infoInt.getValue();

    }
}

// Создадим класс который возвращать будет значение в красивых скобках
class Info<T> {     // T - является нашим типом к котрому мы будем обращаться для изменения значения в нужной необходимости
    private T value;  // создадим перерменную

    public Info(T value) {   // создадим конструктор класса
        this.value = value;
    }

    // можно использовать параметризированные методы в классе, только без использования <>(даймонда), так как в классе он
    // уже обозначен.
    public T getSecond(T value) {
        return value;
    }

    public String toString() {    // создадим  метод возвращающий значение
        return "<<{" + value + "}>>";
    }

    public T getValue() {    //  можно создать метод и пользоваться им
        return value;
    }

    // также в generics можно унаследоваться от других классов и имплементить(реализовывать) интерфейсы
    class Test<E extends Number & If1 & If2> {

    }

    interface If1 {
    }

    interface If2 {
    }
}
