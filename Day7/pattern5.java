import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No ");
        // char n = sc.nextChar();
        for(char i = 'A'; i <= 'D'; i++ ){
            for( char j = 'A' ; j <= i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
