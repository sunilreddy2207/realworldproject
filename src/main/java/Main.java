import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("====IT HELP DESK====");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many tickets you want to solved");
        int j = sc.nextInt();
        System.out.println("The entered no.of tickets is:" + "  " + j);
        System.out.println("Enter Severity Type:");
        int severity = sc.nextInt();

        for (int i = 1; i <= j; i++) {
         String CaseID="Case-"+i;
            System.out.println("  "+"\n"+"Please choose category of your issue:");
            System.out.println("1.Network Issue");
            System.out.println("2.Laptop Issue");
            System.out.println("3.Email Issue");
            System.out.println("4.Software Installation");
            System.out.println("5.Enter Issue Manually");
            int issue = sc.nextInt();
            String issueType = "";
            String severityType = "";

             switch (issue) {
                case 1->
                    issueType = "Network Issue";
                case 2->
                    issueType = "Laptop Issue";
                case 3->
                    issueType = "Email Issue";
                case 4->
                    issueType = "Software Installation";
                case 5->
                       {
                           System.out.println("Enter your Issue:");
                           sc.nextLine();
                   issueType= sc.nextLine();
                       }

                 default->
                         System.out.println("Enter Valid Issue");





            };


            if (severity > 9) {
                severityType = "High Priority";
            } else if (severity >= 5) {
                severityType = "Medium Priority";
            }else {
                severityType="Low Priority";
            }
System.out.println(("Issue type:"+"  "+issueType+"\n"+"Priority:"+"  "+severityType+"\n"+CaseID));


        }

    }
    }
