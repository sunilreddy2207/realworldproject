import java.util.Objects;
import java.util.Scanner;

public class VehicleType {
    Scanner sc=new Scanner(System.in);
    int baseprice=0;
    public int VehicleType() {

        System.out.println("=====PLEASE ENTER VEHICLE TYPE====");
        System.out.println("car");
        System.out.println("bike");
        System.out.println("truck");


        String str = sc.nextLine();
        System.out.println(str);
        if (Objects.equals(str, "car")) {
            baseprice=20;
           System.out.println(baseprice);

        }else if(Objects.equals(str,"bike")){
            baseprice=20;
            System.out.println(baseprice);

        }else {
            baseprice=30;
            System.out.println(baseprice);
        }
System.out.println("VehicleType is:"+"   "+str+"  "+"baseprice is:"+"  "+baseprice);
        return baseprice;
    }
}
