import java.util.Scanner;
import java.util.Arrays;
/*  */
//->prog2
public class new1 {
           public static void main(String args[]) {
               System.out.println(args[0] + "\tUniversity\t"+args[1]);

   }
}
// ->prog 3
class n1 {
  public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]) ;
        System.out.println("The sum of\t" + a + "\tand\t" + b + "\tis\t" + (a+b));
    }
 }

// ->prog 4
class p{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        if(a>0){
            System.out.println("Positive");
        }
        else if(a<0){
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }
}
//->prog 5
class p1{
    public static void main(String[] args) {
        char a = 'a' ;
        if(Character.isLowerCase(a)){
            System.out.println(Character.toUpperCase(a));
        }
        if(Character.isUpperCase(a)){
            System.out.println(Character.toLowerCase(a));
        }


    }

}
// -> prog 6
class p2{
    public static void main(String[] args) {
        if(args[0].isBlank() && args[1].isBlank()){
            System.out.println("NO VALUE");
        }
        else{
            System.out.println(args[0] + "," + args[1]);
        }
    }
}

// -> prog 7
class p3{
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        int[] a = new int[8] ;
        for(int i=0 ; i<8 ; i++) {
            a[i] = n.nextInt();
        }
        for(int i=7 ; i>= 0 ; i--){
            System.out.println(a[i]);
        }
    }
}
// prog 8
class p4{
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the values of array");
        int[] b = new int[10] ;
        for(int i=0 ; i < 10 ; i++){
            b[i] = n.nextInt() ;

        }
        for(int i=0 ; i < 10 ; i++) {
            if( i % 2 == 0){
                count+=b[i];

            }

        }
        System.out.println("The sum of all Even numbers is = "+ count);


    }
}
//->prog 9
class p5{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the values of array");
        int[] b = new int[10] ;
        for(int i=0 ; i < 10 ; i++){
            b[i] = n.nextInt() ;

        }
        for(int i=0 ; i < 2 ; i++){
            System.out.println(b[i]);
        }
    }


}
//->prog 10
