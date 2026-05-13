import java.util.Scanner;

public class VehicleInspection {

    Scanner sc = new Scanner(System.in);

    public void VehicleInspection() {
        System.out.println("====VehicleInspection====");
        int i = 1;
        for (i = 1; i <= 4; ) {
            if (i == 1) {
                System.out.println("Checking Engine Oil");
                System.out.println("Take time for 5 minutes");
                System.out.println("Enter GOOD Or BAD");
                sc.nextLine();
                String str = sc.nextLine();
                System.out.println(str);
                i++;
            } else if (i == 2) {
                System.out.println("Checking Brake oil");
                System.out.println("Take time for 20 minutes");
                System.out.println("Enter GOOD Or BAD");
                sc.nextLine();
                String str = sc.nextLine();
                System.out.println(str);
                i++;

            } else if (i == 3) {
                System.out.println("Checking Head Lights");
                System.out.println("Take time for 5 minutes");
                System.out.println("Enter GOOD Or BAD");
                sc.nextLine();
                String str = sc.nextLine();
                System.out.println(str);
                i++;

            } else {
                System.out.println("Checking Battery");
                System.out.println("Take time for 5 minutes");
                System.out.println("Enter GOOD Or BAD");
                sc.nextLine();
                String str = sc.nextLine();
                System.out.println(str);
                i++;
            }
        }
        System.out.println("====Completed Inspection====");
    }
}
