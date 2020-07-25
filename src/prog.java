import java.util.Scanner;

public class prog {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();
        int y = n.nextInt();
        float z = n.nextFloat();
        long a = n.nextLong();
        n.nextLine();
        String b = n.nextLine();
        String c =n.nextLine();
        System.out.println("Name =" + b);
        System.out.println("Age =" + x );
        System.out.println("4-digit code =" + y );
        System.out.println("CPI = " + z);
        System.out.println("Mobile No. =" + a);
        System.out.println("Passes =" + c);
    }
}
