package Collection.LinkedList;
/*LinkedList - это коллекция которая наследуется так же как и ArrayList от List и от Collection.
* Элементы LinkedList - это звенья одной цепочки. Эти элементы хранят определенные данные и ссылки на предыдущий и
* следующий элемент.
* Как правило его используют редко, в основном в том случае когда много операций по добавлению и удалению элементов.
* Методы одинаковы как и в ArrayList(методы смотрим там)*/
import java.util.LinkedList;

public class Methods {
    public static void main(String[] args) {
        LinkedList<String> arrayStr = new LinkedList<>();
        arrayStr.add("Иван");
        arrayStr.add("Вася");
        arrayStr.add("Инна");
        arrayStr.add("Томара");
        System.out.println(arrayStr);
    }
}
