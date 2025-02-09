package patterns.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();

        myCollection.addItem("микроголубь");
        myCollection.addItem("наноосминог");
        myCollection.addItem("жопокрот");

        Iterator iterator = myCollection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
