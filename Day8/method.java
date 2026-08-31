public class method {

    public static void printDollar(int row) {
        for (int j = 1; j <= row; j++) {
            System.out.print("$ ");
        }
    }

    public static void printHash(int n, int row) {
        for (int j = 1; j <= n - row; j++) {
            System.out.print("# ");
        }
    }

    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            printDollar(i);
            printHash(n, i);
            System.out.println();
        }
    }
}
