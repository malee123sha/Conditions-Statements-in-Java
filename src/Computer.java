import java.util.Scanner;
public class Computer {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter ID:-");
        String ID = c.nextLine();

        System.out.println("Enter Brand:-");
        String b = c.nextLine();

        System.out.println("Enter Generation:-");
        int gen = c.nextInt();

        if (gen <= 5) {
            System.out.println("10000");
        } else if (gen == 6) {
            System.out.println("50000");
        } else if (gen == 7) {
            System.out.println("2000000");
        } else {
            System.out.println("500000");
        }
    }
}
