package patterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        UserData userData = new UserDataProxy();


        System.out.println(userData.getUserInfo("1"));

        System.out.println(userData.getUserInfo("2"));

        System.out.println(userData.getUserInfo("3"));

        System.out.println("----------------------------");

        System.out.println(userData.getUserInfo("1"));

        System.out.println(userData.getUserInfo("2"));

        System.out.println(userData.getUserInfo("3"));
    }
}
