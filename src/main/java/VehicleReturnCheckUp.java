import java.util.Scanner;

public class VehicleReturnCheckUp {




        Scanner scanner=new Scanner(System.in);
        public void returnCheckup(){
            System.out.println("===START RETURN CHECKUP===");
            String checkup[]={"Engine Checkup","BODY CHECKUP","INSIDE CHECKUP"};
            for(int i=0;i<checkup.length;i++){
                System.out.println(checkup[i]);
                if(checkup[i].equals(checkup[0])){
                    System.out.println("START ENGINE CHECKUP");
                    System.out.println("TAKES 5 MINUTES");
                    System.out.println("IS EVERYTHING OK");
                    scanner.nextLine();
                }
                if(checkup[i].equals(checkup[1])){
                    System.out.println("START BODY CHECKUP");
                    System.out.println("TAKES 10 MINUTES");
                    System.out.println("IS EVERYTHING OK");
                    scanner.nextLine();
                }
                if(checkup[i].equals(checkup[2])){
                    System.out.println("START INSIDE CHECKUP");
                    System.out.println("TAKES 20 MINUTES");
                    System.out.println("IS EVERYTHING OK");
                    scanner.nextLine();
                }
            }

        }
    }

