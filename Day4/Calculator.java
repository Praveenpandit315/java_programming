import java.util.Scanner;
public class Calculator {

    public static void main(String[] args){
        Scanner st =new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the value of num1");
        num1=st.nextInt();
        System.out.println("Enter the value of num2");
        num2=st.nextInt();
        System.out.println("Sum of " +num1+"and"+num2+"is :"+(num1+num2));
        System.out.println("Difference of " +num1+"and"+num2+"is :"+(num1-num2));
        System.out.println("Product of " +num1+"and"+num2+"is :"+(num1*num2));
        System.out.println("Divisor of " +num1+"and"+num2+"is :"+(num1/num2));
    }

}