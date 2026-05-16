import java.util.Scanner;

public class VehicleServices {
    int total = 0;
    public int services()
    {
        int price = 0;
        String serviceType = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nof of services you want");

        int enterServices = sc.nextInt();
        for (int i = 1; i <= enterServices; i++) {
            System.out.println("====CHOOSE SERVICES====");
            System.out.println("1.ENGINE OIL CHANGE:" + "  " + "PRICE=$60");
            System.out.println("2.BRAKE OIL CHANE:" + "  " + "PRICE=$100");
            System.out.println("3.AIR FILTER CHANGE:" + "  " + "PRICE=$15");
            System.out.println("4.HEADLIGHT CHANGE:" + "  " + "PRICE=$50");
            System.out.println("5.TIRE CHANGE:" + "  " + "PRICE=$75");


            int service = sc.nextInt();
            switch (service) {
                case 1 -> price = 60;


                case 2 -> price = 100;


                case 3 -> price = 15;


                case 4 -> price = 50;

                case 5 -> price = 75;


                default -> System.out.println("Enter Valid Service");

            }
            System.out.println("your price is :"+"  "+price);
            total = total + price;
        }

        System.out.println("Your Total Price is:"+total);
        return  total;



    }
}
