package Collection.ArrayList.Methods;

import java.util.Arrays;
import java.util.List;
// asList() - вызывавает это метод только с помощи Array и на выходе вы имеете лис этого же типа.
// пр.(Array.isList(Data Type[]) -> List(Data Type))
public class Method_isList {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder[] arr = {sb1,sb2,sb3};
        List<StringBuilder> myList = Arrays.asList(arr);// myList - будет полностью связан с массивом arr,
        System.out.println(myList);                     // любые манипуляции будут отражаться
        arr[0].append("!!!"); // добавин к первому элементу "!!!"
        System.out.println(myList);
        arr[1] = new StringBuilder("HI"); // заменим второй элемен
        System.out.println(myList);

    }
}
