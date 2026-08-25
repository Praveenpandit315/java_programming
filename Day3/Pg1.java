public class Pg1 {
    public static void main(String[] args) {
        System.out.println("=== Deployment Health Checker v1.0 ===");
        System.out.println("Argument received :" + args.length);

        if(args.length == 0){
            System.out.println("Usage : java P01 <service> <port>");
            return;
        }
        for (int i =0; i<args.length;i++){
            System.out.println("args["+i+"] ="+args[i]);
        }
        String service = args[0];
        int port =Integer.parseInt(args[1]);
        System.out.println("Pinging"+service+"on port"+port+"....ok");
    }
}
