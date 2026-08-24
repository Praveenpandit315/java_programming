import java.util.*;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = 4564;
        int attempt = 3;

        for (int i=1; i<= attempt; i++){
            System.out.println("Enter Password");
            int passwd = sc.nextInt();

            if (passwd == password){
                System.out.println("Welcome Back to the Game");
                break;
            }
            else{
                System.out.println("Password is Incorrect");
            }

            if (i == 3){
                System.out.println("You are Locked out");
                break;
            }
            System.out.println("Attempt left"+(attempt-i));

        }

        sc.close();
    }    
}
