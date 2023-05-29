package Iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

// ListIterator - это интерфейс который также работает как Iterator но еще с одной возможность проверки элементов
// в обратном порядке
// В примере ниже будем проверять слово на полиндром
public class ListIteratorWork {
    public static void main(String[] args) {
      String s = "madam";
      // создадим лист символов из слова s с помощи метода toCharArray() и заполним с помощи цыкла свой лист
        List<Character> myList = new LinkedList<>();
        for (char ch :s.toCharArray()) {
            myList.add(ch);
        }
        // создадим два листа итератора, которые будут проверять с начала myList и с конца
        ListIterator<Character> iterator = myList.listIterator();
        ListIterator<Character> reverseIterator = myList.listIterator(myList.size());
        boolean isPalindrome = true;

        // создадим проверку через цыкл while;
        while (iterator.hasNext() && reverseIterator.hasPrevious()){
            if (iterator.next() != reverseIterator.previous()){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}
