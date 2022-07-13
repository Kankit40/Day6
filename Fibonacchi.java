import java.util.Scanner;

public class Fibonacchi {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = Sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1; i<= N; i++){
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }
}
