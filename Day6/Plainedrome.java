import java.util.Scanner;

public class Plainedrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int num=sc.nextInt();
        int temp = num;
        int sum=0;
        while(num>0){
            int ld=num%10;
            sum=sum*10+ld;
            num=num/10;
        }
        if( temp == sum){
            System.out.println("Planedrome" + sum);
        }
        else{
            System.out.println("Not Plainedrome");
        }
    
    }
}