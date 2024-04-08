public class nestedIf {
    public static void main(String[] args) {
        int a = 100;
        if (a == 100 ) { //Condition 1

            if (a < 200) { //Condition 2
                // execute when condition 1 is true
                System.out.println("a is smaller than 200");

                if (a < 150)
                    // execute when condition 2 is true
                    System.out.println("a is smaller than 150");
            }else {
                // execute when condition 2 is false
                System.out.println("a is grater than 200");
            }
        }
    }
}
