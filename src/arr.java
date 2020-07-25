import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        String[] cars = {"BMW", "polo", "audi"};
        for (String i : cars) {
            System.out.println(i);

        }
    }
}

class arr1{
    public static void main(String[] args) {
        char a = 'a' ;
        int as =  a ;
        System.out.println(as);
    }
}
class arr2 {
    public static void main(String[] args) {
        int dividend=422 ;
        int divider= 55 ;
        int b = dividend/divider ;
        int c = dividend % divider ;
        System.out.println("Quotient =" + b);
        System.out.println("Remainder =" + c);

    }
}
class arr3 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt() ;
        int b = n.nextInt();
        int c = 0;
         c = a ;
         a = b ;
         b = c ;
        System.out.println(a);
        System.out.println(b);

    }
}
                // or
class arr4{
    public static void main(String[] args) {
        int a1 = 5 ;
        int b1 = 6;
        b1=(b1+a1)-b1;
        a1=((a1+b1)/10)+b1 ;
        System.out.println(a1);
        System.out.println(b1);
    }
}

