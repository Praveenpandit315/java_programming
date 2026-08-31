import java.util.Scanner;

public class method {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Row");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            pattern.Dollar(i);
            pattern.Hash(n, i);
            System.out.println();
        }
    }
}

class pattern{
    
    public static void Dollar(int row) {
        for (int j = 1; j <= row; j++) {
            System.out.print("$ ");
        }
    }

    public static void Hash(int n, int row) {
        for (int j = 1; j <= n - row; j++) {
            System.out.print("# ");
        }
    }

}
