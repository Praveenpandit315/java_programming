import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // 1. Spaces print karne ke liye (Formatting)
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int num = 1; // Har row ka pehla element hamesha 1 hota hai
            
            // 2. Pascal Triangle ke numbers print karne ke liye
            for (int k = 0; k <= i; k++) {
                System.out.print(num + " ");
                // Agla number calculate karne ka formula: number = number * (row - column) / (column + 1)
                num = num * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}
