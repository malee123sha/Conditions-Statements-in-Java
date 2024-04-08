import java.util.Scanner;
public class Employee {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.println("Enter Employee Name:-");
            String name = s.nextLine();

            System.out.println("Enter Employee ID:-");
            String id = s.nextLine();

            System.out.println("Enter Employee Position:-");
            String p = s.nextLine();

            System.out.println("Enter Employee NIC :-");
            int nic = s.nextInt();

            System.out.println("Enter Employee Basic Salary:-");
            double bSal = s.nextDouble();

            Scanner s1 = new Scanner(System.in);
            System.out.println("Enter Employee OT Hours:-");
            double h = s1.nextDouble();

            System.out.println("Enter Employee OT Rate:-");
            double r = s1.nextDouble();

            double netSal = h * r;
            System.out.println("Net Salary :-"+netSal);

            double totalSal = bSal + netSal;
            System.out.println("Total Salary :-"+totalSal);
        }
}
