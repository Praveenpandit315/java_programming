public class Demo{
    static int x=10;
    public static void main(String[] args) {
        System.out.println("Hello world");
        InnerDemo obj = new InnerDemo();
        obj.display();
    }
}
// Interpreter compiler and bytecode class file ko bolte hai or plateform independent 

/**
 * InnerDemo
 */
class InnerDemo {
    void display(){
        Demo.x=20;
    }    
}