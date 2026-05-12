
import java.time.LocalTime;
import java.util.Scanner;

import static java.awt.Color.black;
import static java.awt.Color.white;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---SMART PARKING SYSTEM---");
        System.out.println("Pleae Enter Your Vehicle NUmber");
        String vehicleNumber = sc.nextLine();
        System.out.println("Please check your vehicle number  :" + "..." + vehicleNumber);

        System.out.println("---Vehicle Type");
        System.out.println("1.Car");
        System.out.println("2.Bike");
        System.out.println("3.Truck");
        double vehicleType = sc.nextInt();
        double cost = 0;
        int hours = 0;
        if (vehicleType == 1) {
            cost = 2;
            System.out.println("For 1 hour cost is :" + ".." + cost);
            System.out.println("enter how many hours you want parking");
            hours = sc.nextInt();
            System.out.println("For the hours you entered is" + ".." + hours + "hours : " + cost * hours);
        } else if (vehicleType == 2) {
            cost = 4;
            System.out.println("For 1 hour cost is :" + ".." + cost);
            System.out.println("enter how many hours you want parking");
            hours = sc.nextInt();
            System.out.println("For the hours you entered  is" + ".." + hours + "hours : " + cost * hours);

        } else if (vehicleType == 3) {
            cost = 6;

            System.out.println("For 1 hour Cost is:" + ".." + cost);
            System.out.println("enter how many hours you want parking");
            hours = sc.nextInt();
            System.out.println("For the hours you entered is" + ".." + hours + "hours : " + cost * hours);

        } else {
            System.out.println("Enter Valid vehicleType");
        }
        System.out.println("\n===== QR CODE (SCAN INFO)===");
        generateQRCode(vehicleNumber, vehicleType, cost, hours);
        System.out.println("==========");
        System.out.println("Thanks for using smart fee parking system");

    }
        public static void generateQRCode (String vehicleNumber,double vehicleType, double cost, int hours){
           String black="\u001B[40m  \u001B[0m";
           String white="  \u001B[47m  \u001B[0m";
            String data = vehicleNumber + "|" + vehicleType + "|" + cost + "|" + hours;
            for (int i = 0; i < data.length(); i++) {
                int code = data.charAt(i);
                for (int bit = 0; bit < 8; bit++) {
                    if ((code & (1 << bit)) != 0) {
                        System.out.print(black);
                    } else {
                        System.out.print(white);
                    }
                }
                System.out.println();
            }
        }

    }

