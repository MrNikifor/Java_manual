package Collection.Set;
/*Set - колекция которая хранит уникальные элементы.
* Методы данной коллекции очень быстры.
*
* HashSet не запоминает порядок добавления элементов.
* В основе HashSet лежит HashMap. У элементов данного HashMap ключ - это значения HashSet,
* а значение это константа заглушка*/
import java.util.HashSet;
import java.util.Set;

public class SetMethods {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Serg");
        set.add("Kolya");
        set.add("David");
        set.add("Nikita");
        System.out.println(set);
/*методы remov,size по классике везде одинаковы. мы их пропустим
 */
        //isEmpty() - дает инфу есть ли елементы в коллекции
        System.out.println(set.isEmpty());

        //set.contains() - делает проверку на наличие элемента
        System.out.println(set.contains("Misha"));
    }
}
