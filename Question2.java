import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println("Sum of factors = " + sum);
    }
}
