public class Continue {
    public static void main(String[] args) {
        for(int x = 0; x < 20; x++) {
            //if the number is Even, skip it and continue
            if (x % 2 == 0)
                continue;
            //if the number is Odd, print it
            System.out.print(x+" " );
        }
    }
}
