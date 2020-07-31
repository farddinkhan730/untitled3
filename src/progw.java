/*import java.util.Scanner;

public class progw {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        n.nextLine();
        String b = n.nextLine();
        if(a >=1 && a<=58  && b == "Female" ) {
            System.out.println("The percentage of intrest is 8.2%");

        }
        else if(a >= 59 && a<= 100 && b == "Female"){
            System.out.println("the persentage of intrest is 9.2%");

        }
        else if(a >=1 && a<=58 && b == "Male") {
            System.out.println("The persentage of intrest is 8.4%");
        }
        else if(a>=59 && a<=100 && b == "Male" ){
            System.out.println("The persentage of interest is 10.5%");
        }
        else{
            System.out.println("fk");
        }
    }
} */
class aw{
    public static void main(String[] args) {
        int b = Integer.parseInt(args[0]) ;
        if(b >=1 && b<=58  && args[1] == "Female" ) {
            System.out.println("The percentage of intrest is 8.2%");

        }
        else if(b >= 59 && b <= 100 && args[1] == "Female"){
            System.out.println("the persentage of intrest is 9.2%");

        }
        else if(b >=1 && b <=58 && args[1] == "Male") {
            System.out.println("The persentage of intrest is 8.4%");
        }
        else if(b>=59 && b<=100 && args[1] == "Male" ){
            System.out.println("The persentage of interest is 10.5%");
        }
        else{
            System.out.println("fk");
        }
    }
}




