package Exeption;

public class Examp {
    public static void main(String[] args) {
        System.out.println(0);
        try {
            System.out.println(1);
            if(true){
                throw new NullPointerException();
            }
            System.out.println(2);
        }catch (RuntimeException e){
            System.out.println(3);
            if(true){
                throw new NullPointerException();
            }
            System.out.println(4);
        }finally {
            System.out.println(5);
            if(true){
                /**/
            }
            System.out.println(6);
        }
        System.out.println(7);
    }
}
