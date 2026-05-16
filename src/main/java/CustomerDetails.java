import java.util.Scanner;

public class CustomerDetails {


    public void details() {
        String name = "";
        String licensenumber = " ";
        int dateofbirth = 0;
        long phonenumber = 0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("=====CUSTOMER DETAILS====");
        for (int i = 0; i <= 4; i++) {
            switch (i) {
                case 1 -> {
                    System.out.println("Enter your name");
                    name = scanner.next();
                }
                case 2 -> {
                    System.out.println("ENTER DATE OF BIRTH YEAR");
                    dateofbirth = scanner.nextInt();

                    if (dateofbirth >= 1998) {
                        System.out.println("Eligible for Rent a Car");
                    } else {
                        System.out.println("Not Eligible to Rent A Car");
                        System.out.println("THANKS FOR VISITING US");

                        System.exit(0);
                    }

                }
                case 3 ->
                        {
                            System.out.println("ENTER YOUR LICENSE NUMBER");
                            licensenumber = scanner.next();
                        }
                case 4 ->{
                    System.out.println("ENTER YOUR PHONE NUMBER");
                    phonenumber = scanner.nextLong();
                }


            }

        }
    }}
