import java.util.Scanner;
public class checkTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Value of a :-");
        double a = s.nextDouble();

        System.out.println("Value of b :-");
        double b = s.nextDouble();

        System.out.println("Value of c :-");
        double c = s.nextDouble();

        double x = (a + b + c);
        System.out.println("Value is:-"+x);

        if (x == 180) {
            System.out.println("It's a Triangle");
        } else {
            System.out.println("It's not a Triangle");
        }
    }
}
