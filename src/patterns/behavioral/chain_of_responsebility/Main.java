package patterns.behavioral.chain_of_responsebility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ComplaintHandler support = new SupportHandler();
        ComplaintHandler manger = new ManagerHandler();
        ComplaintHandler director = new DirectorHandler();

        support.setNextHandler(manger);
        manger.setNextHandler(director);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the complaint: ");
        String complaint = scanner.nextLine();

        support.handleComplaint(complaint);

        scanner.close();
    }
}
