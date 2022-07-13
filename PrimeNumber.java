import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = Sc.nextInt();
        int temp = 0;

        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("THe number is prime");
        } else
            System.out.println("The number is not prime");
    }
}