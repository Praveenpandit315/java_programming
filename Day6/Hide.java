import java.io.Console;

public class Hide {
    public static void main(String[] args) {
        
        Console console = System.console();
        
        if (console == null) {
            System.out.println("Console is not available.");
            return;
        }
        
        char[] password = console.readPassword("Enter Password: ");
        int pass = Integer.parseInt(new String(password));
        System.out.println("Password entered successfully! " +pass);
    }
}