package generics.parametrized_method;
import java.util.ArrayList;
// ParametrizedMethod работает практически аналогично как ParametrizedClass(описание работы у класса)
public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(44);
        arr.add(32);
        arr.add(22);
        int a = GetMethod.getSecondElement(arr);
        System.out.println(a);

        ArrayList<String> arrS = new ArrayList<>();
        arrS.add("my");
        arrS.add("re");
        arrS.add("dy");
        String s = GetMethod.getSecondElement(arrS);
        System.out.println(s);
    }
}

class GetMethod {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(2);
    }
}