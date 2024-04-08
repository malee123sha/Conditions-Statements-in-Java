import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Student Name:-");
        String name = s.nextLine();

        System.out.println("Enter University ID:-");
        String id = s.nextLine();

        System.out.println("Enter Subject 1 Marks:-");
        int marks1 = s.nextInt();

        System.out.println("Enter Subject 2 Marks:-");
        int marks2 = s.nextInt();

        System.out.println("Enter Subject 3 Marks:-");
        int marks3 = s.nextInt();

        double avg = (marks1 + marks2 +marks3)/3;
        if (avg >= 40) {
            System.out.println(id +" "+ "Pass");
        } else {
            System.out.println(id +" "+ "Fail");
        }
    }
}
