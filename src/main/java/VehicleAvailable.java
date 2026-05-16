import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class VehicleAvailable {
    String car = " ";
    String truck = " ";
    String bike = " ";
double tax=0.08;
    int price = 0;



    Scanner scanner = new Scanner(System.in);


    public double available(Object obj) {

        System.out.println("====PLEASE CHOOSE VEHICLE TYPE");
        System.out.println("1.CAR");
        System.out.println("2.TRUCK");
        System.out.println("3.BIKE");
        int vehicle = scanner.nextInt();

        switch (vehicle) {
            case 1 -> {
                car = "minimum 1day";
                String Car[] = new String[4];
                Car[0] = " Toyota";
                Car[1] = "BENZ";
                Car[2] = "BMW";
                Car[3] = "DODGE";
                for (int i = 0; i < Car.length; i++) {

                    System.out.println("Car NAME IS:" + i + "." + Car[i]);

                }


                System.out.println("===PLEASE CHOOSE CAR MODEL===");


                int model = scanner.nextInt();
                switch (model) {
                    case 0 -> {
                        System.out.println("TRUCK NAME IS :" + Car[0]);
                        price = 150;


                        System.out.println("Price is:" + " " + "$150/DAY");

                        int days = scanner.nextInt();
                        price = price * days;
                        System.out.println(price);
                    }

                    case 1 -> {

                        System.out.println("CAR NAME IS:" + " " + Car[1]);
                        price = 200;


                        System.out.println("Price is:" + " " + "$200/DAY");

                        int days = scanner.nextInt();
                      price = price * days;

                        System.out.println(price);
                    }

                    case 2 -> {
                        System.out.println("CAR NAME IS:" + " " + Car[2]);
                        price = 250;


                        System.out.println("Price is:" + " " + "$250/DAY");
                        int days = scanner.nextInt();
                        price = price * days;
                        System.out.println(price);

                    }

                    case 3 -> {
                        System.out.println("CAR NAME IS:" + " " + Car[3]);
                        price = 300;


                        System.out.println("Price is:" + " " + "$300/DAY");
                        System.out.println("ENTER NUMBER OF DAYS");
                        int days = scanner.nextInt();
                        price = price * days;

                        System.out.println(price);


                    }
                    default -> System.out.println("INVALID ENTRY");
                }double total=price+(price*tax);
                System.out.println(total);
                return total;

            }


            case 2 -> {
                truck = "minimum 1day";
                String truck[] = {"1TOYOTA L MODEL", "CHEVEROLT MODEL 3", "FORD", "DODGE TRUCK CHALLENGER"};
                for (int i = 0; i < truck.length; i++) {

                    System.out.println("TRUCK NAME IS:" + i + "." + truck[i]);

                }
                System.out.println("===PLEASE CHOOSE TRUCK MODEL===");


                int model = scanner.nextInt();
                switch (model) {
                    case 0 -> {
                        System.out.println(truck[0]);
                       price = 150;


                        System.out.println("Price is:" + " " + "$150/DAY");
                        System.out.println("ENTER NUMBER OF DAYS");
                        int days = scanner.nextInt();
                        price = price * days;
                        System.out.println(price);
                    }

                    case 1 -> {
                        System.out.println("TRUCK NAME IS :" + truck[1]);
                        price = 200;


                        System.out.println("Price is:" + " " + "$200/DAY");
                        System.out.println("ENTER NUMBER OF DAYS");
                        int days = scanner.nextInt();
                        this.price = price * days;
                        System.out.println(price);
                    }

                    case 2 -> {

                        System.out.println("TRUCK NAME IS :" + truck[2]);
                        price = 250;


                        System.out.println("Price is:" + " " + "$250/DAY");
                        System.out.println("ENTER NUMBER OF DAYS");
                        int days = scanner.nextInt();
                        price = price * days;
                        System.out.println(price);

                    }

                    case 3 -> {
                        System.out.println("TRUCK NAME IS :" + truck[3]);
                        price = 300;


                        System.out.println("Price is:" + " " + "$300/DAY");
                        System.out.println("ENTER NUMBER OF DAYS");
                        int days = scanner.nextInt();
                        price = price * days;
                        System.out.println(price);

                    }

                    default -> System.out.println("INVALID ENTRY");
                }double total=price+(price*tax);
                System.out.println(total);
                return total;


            }

            case 3 -> {
                bike = "minimum 1day";

                System.out.println("===PLEASE CHOOSE BIKE MODEL===");
                String bike[] = {"HARLEY", "HONDA", "BMW"};
                for (int i = 0; i < bike.length; i++) {

                    System.out.println("TRUCK NAME IS:" + i + "." + bike[i]);

                }
                int model = scanner.nextInt();
                switch (model) {
                    case 0 -> {
                        System.out.println("BIKE NAME IS:" + " " + bike[0]);
                        price = 150;


                        System.out.println("Price is:" + " " + "$150/DAY");
                        System.out.println("ENTER NUMBER OF DAYS");
                        int days = scanner.nextInt();
                        this.price = price * days;
                        System.out.println(price);
                    }

                    case 1 -> {
                        System.out.println("BIKE NAME IS:" + " " + bike[1]);
                        price = 200;


                        System.out.println("Price is:" + " " + "$200/DAY");
                        System.out.println("ENTER NUMBER OF DAYS");
                        int days = scanner.nextInt();
                        price = price * days;
                        System.out.println(price);

                    }

                    case 2 -> {
                        System.out.println("BIKE NAME IS:" + " " + bike[2]);
                        price = 250;


                        System.out.println("Price is:" + " " + "$250/DAY");
                        System.out.println("ENTER NUMBER OF DAYS");
                        int days = scanner.nextInt();
                        price = price * days;
                        System.out.println(price);
                    }


                    default -> System.out.println("INVALID ENTRY");
                }



            }
        }
        double total=price+(price*tax);
        System.out.println("YOUR TOTAL IS:"+"  "+total);
        return total;
    }
    }





