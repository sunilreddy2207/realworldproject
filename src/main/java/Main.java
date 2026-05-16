import java.util.Scanner;

public class Main {
    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        VehicleType vehicletype = new VehicleType();
        vehicletype.type();
        VehicleInspection vehicleinspection = new VehicleInspection();
        vehicleinspection.inspection();
        VehicleServices vehicleservice = new VehicleServices();
        vehicleservice.services();
        Main m=new Main();
        m.payment();
        m.printReceipt();

    }
        public void payment(){
        VehicleServices vehicleservice1=new VehicleServices();
            VehicleType vehicletype1 = new VehicleType();

        System.out.println("YOUR TOTAL IS"+" "+  vehicleservice1.total);
        System.out.println(("PLEASE CHOOSE PAYMENT TYPE"));
System.out.println("1.CREDIT CARD");
System.out.println("2.CASH");
int paymenttype= scanner.nextInt();
if(paymenttype==1){
    System.out.println("PLEASE CHECK THE AMOUNT YOU ENTERED"+"  "+ vehicleservice1.total);
    System.out.println("PLEASE INSERT YOUR CARD "+" OR "+"TAP YOUR CARD");
    System.out.println("PLEASE ENTER YOUR PIN");
    scanner.nextInt();
    System.out.println("PLEASE CLICK APPROVE");
    System.out.println("YOUR TRANSCATION IS SUCCESSFUL");
}
else if(paymenttype==2){
    System.out.println("PLEASE CHECK THE TOTAL AMOUNT:"+"  "+ vehicleservice1.total);
    System.out.println("TRANSCATION SUCCESSFULL");
}else{
    System.out.println("INVALID ENTRY");
}
        }

        public void printReceipt(){
        System.out.println("CHOOSE RECEIPT");
        System.out.println("1.PAPER RECEIPT");
        System.out.println("2.VIRTUAL RECEIPT");
    System.out.println("3.NO RECEIPT");
   int sc= scanner.nextInt();
   if(sc==1){
       System.out.println("RECEIPT IS PRINTING");
   } else if (sc==2) {
       System.out.println("PLEASE CHOOSE ONE OF THE FOLLOWING");
       System.out.println("1.MOBILE NUMBER");
       scanner.next();
       System.out.println("2.EMAILID");
scanner.nextLine();


   }else{
       System.out.println("=======THANKS YOU=======:"+"\n"+"PLEASE VISIT US AGAIN");
   }
        }
    }
