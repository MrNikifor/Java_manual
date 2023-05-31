package OOP.calling_an_abstract_object;

public class Test {
    public static void main(String[] args) {
        Foo foo2 = new Foo() {
            @Override
            public void m1() {
                System.out.println("....hi");
            }

            @Override
            public void m2() {
                System.out.println(".....bye");
            }
        };
        foo2.m1();
        foo2.m2();
    }
}
