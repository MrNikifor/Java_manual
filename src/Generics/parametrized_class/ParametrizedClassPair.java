package Generics.parametrized_class;
// поработаем с двумя типами
public class ParametrizedClassPair {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Привет", 22);  // объекты можно создавать с разными типами данных
        System.out.println(pair.getFirstVelue() + pair.getSecondVelue());

        OtherPair<String> otherPair = new OtherPair<>("Привет", "Друг");
    }

    static class Pair<V1, V2> {
        private V1 velue1;
        private V2 velue2;

        public Pair(V1 velue1, V2 velue2) {
            this.velue1 = velue1;
            this.velue2 = velue2;
        }

        public V1 getFirstVelue() {
            return velue1;
        }

        public V2 getSecondVelue() {
            return velue2;
        }
    }
    // также можно создать класс с двумя но одинаковыми значениями(если нужно иметь два объекта с одинаковыми типами)
    static class OtherPair<V> {
        private V velue1;
        private V velue2;

        public OtherPair(V velue1, V velue2) {
            this.velue1 = velue1;
            this.velue2 = velue2;
        }

        public V getFirstVelue() {
            return velue1;
        }

        public V getSecondVelue() {
            return velue2;
        }
    }
}
