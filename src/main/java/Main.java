import java.util.Scanner;

public class Hello {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU--");
        System.out.println("1.burger---$5");
        System.out.println("2.Tenders---$6");
        System.out.println("3.Chicken Burrito---$7");
        System.out.println("4.chicken strips---$9");

        int choice = sc.nextInt();
        double price = 0;

        switch (choice) {
            case 1 -> price = 5;
            case 2 -> price = 6;
            case 3 -> price = 7;
            case 4 -> price = 9;
            default -> price = 0;
        };
        System.out.println("price" + price);



        System.out.println("----Discount");
        System.out.println("1.Zero Discount");
        System.out.println("2. $1 off");
        System.out.println("3.10% off");
        int discount=sc.nextInt();
        if(discount==2)
        {
            price=price-1;

        }else if(discount==3) {
            price=price-(price*0.07);
        }
        System.out.println(price);

        System.out.println("---Choose Tax Type---");
        System.out.println("1.tax is 5%");
        System.out.println("2.Tax is 6%");
        int tax=sc.nextInt();
        if(tax==1)
        {
            price=price+(price*0.05);
        }else if(tax==2)
        {
            price=price+(price*0.06);
        }
        System.out.println(price);
        System.out.println("----Membership---");
        System.out.println("1.Membership is there");
        System.out.println("2.Membership is not there");
        int enter=sc.nextInt();
        if (enter== 1
        ) {


            System.out.println("enter membershipID");


            String membership=sc.next();

            if(membership.length()==10){
                System.out.println("valid membershipID");


            }
            else {
                System.out.println("not a valid membesrhip");
            }
        }

        else if(enter==2){
            System.out.println("no memebrshipID");
        }

        System.out.println("----Print Receipt");
        System.out.println("1.print paper receipt");
        System.out.println("2.email receipt");
        System.out.println("3.no receipt");
        int receipt=sc.nextInt();
        if(receipt==1){
            System.out.println("Receipt is on the way");
        }
        if(receipt==2) {
            System.out.println("enter you email or phone");
            System.out.println("1.Phone number");
            System.out.println("2.Email");
            int virtualReceipt = sc.nextInt();
            if (virtualReceipt == 1) {
                System.out.println("entyer phone number");
                String phoneNumber = sc.next();
                System.out.println("your receipt is sent to your phone number"+"---"+phoneNumber);
                if (phoneNumber.length() == 10) ;
                {
                    System.out.println("valid phone number");
                    System.out.println(phoneNumber);
                }
            } else {
                System.out.println("invalid number");
            }

            if(virtualReceipt==2) {
                System.out.println("enter email");
                String email = sc.next();
                System.out.println("your recipt is emailed to "+"---" + email);
                if (email.contains("@") && email.contains(".") && email.length() >= 5) {
                    System.out.println("valid email");
                } else {
                    System.out.println("Invalid Email");
                }

            }else if (receipt==3)
            {
                System.out.println("no receipt entered");
            }
        }}

}






