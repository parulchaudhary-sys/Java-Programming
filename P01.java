public class P01 {
    public static void main(String[] args){
        System.out.println("===Deployment Health Checker v1.0===");
        System.out.println("Arguments received : " + args.length);

        if(args.length==0){
            System.out.println("Usage: java P01 <service> <port>");
            return;   // graceful exit, not System.exit(1)
        }

        for(int i=0; i < arg.length ; i++){
            System.out.println("args["+i+"]= +args[i]");
        }
        String services = args[0];
        int port = Integer.parseInt(args[1]); //args are ALWAYS string
        System.out.println("Pinging" + service + "on port" + port+ ".....OK");
    }
}
