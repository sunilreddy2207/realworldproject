import java.util.Scanner;

public class VehiclePreCheckUp {
    Scanner scanner=new Scanner(System.in);
    public void VehiclePreCheckup(){
        System.out.println("===START PRECHECKUP===");
        String checkup[]={"Engeine Checkup","BODY CHECKUP","INSIDE CHECKUP"};
        for(int i=0;i<checkup.length;i++){
            System.out.println(checkup[i]);
            if(checkup[i]==checkup[0]){
                System.out.println("START ENGINE CHECKUP");
                System.out.println("TAKES 5 MINUTES");
                System.out.println("IS EVERYTHING OK");
                scanner.nextLine();
            }
            if(checkup[i]==checkup[1]){
                System.out.println("START BODY CHECKUP");
                System.out.println("TAKES 10 MINUTES");
                System.out.println("IS EVERYTHING OK");
                scanner.nextLine();
            }
            if(checkup[i]==checkup[2]){
                System.out.println("START INSIDE CHECKUP");
                System.out.println("TAKES 20 MINUTES");
                System.out.println("IS EVERYTHING OK");
                scanner.nextLine();
            }
        }

    }
}
