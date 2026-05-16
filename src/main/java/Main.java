//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Main {
    Scanner scanner=new Scanner(System.in);
    double tax=0.08;
double total=0;
            public static void main(String[] args) {

CustomerDetails cd=new details();
                System.out.println("PLEASE ENTER YOU DETAILS");
                cd.CustomerDetails();
                VehicleAvailable va=new VehicleAvailable();
                va.available(va);

                VehiclePreCheckUp vp=new VehiclePreCheckUp();
                vp.preCheckup();
Main main=new Main();
main.billing();
main.payment();
main.receipt();
                VehicleReturnCheckUp vr=new VehicleReturnCheckUp();
                vr.returnCheckup();


        }

public void billing(){
        VehicleAvailable va=new VehicleAvailable();
        double finalTotal=va.available(null);
        System.out.println("YOUR TOTAL IS:"+"  "+finalTotal);

    }




                public void payment() {
    VehicleAvailable va1=new VehicleAvailable();
    double total= va1.price+(va1.price*va1.tax);

                    System.out.println("PAYMENT TYPE");
                    System.out.println("1.CREDIT CARD");
                    System.out.println("2.CASH");
                    int paymenttype = scanner.nextInt();
                    if (paymenttype == 1) {
                        System.out.println("TAP OR INSERT YOUR CARD");
                        System.out.println("ENTER YOUR PIN");
                        scanner.nextInt();
                        System.out.println("TRANSCATION SUCCESSFUL");

                    } else if (paymenttype == 2) {
                        System.out.println("PAYMENT RECEIVED BY CASH");

                    }

                }
                public void receipt(){
                System.out.println("===RECEIPT TYPE");
                System.out.println("1.PAPER RECIPT");
        System.out.println("2.EMAIL OR PHONE RECEIPT");
        System.out.println("3.NO RECEIPT");
        int receipttype=scanner.nextInt();
        if(receipttype==1){
            System.out.println("RECEIPT IS PRINTING");

        } else if (receipttype==2) {
            System.out.println("PLEASE ENTER YPUR PHONE NUMBER");
            scanner.nextLong();
            System.out.println("PLEASE ENETER EMAIL:");
            scanner.next();

        }else{

            System.out.println("======THANK YOU=======::"+" \n "+"PLEASE VISIT US AGAIN");
        }

                }
    }

