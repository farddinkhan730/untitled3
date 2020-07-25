import java.util.Scanner;

public class prog_1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a[ ] = {12,15,65,7,855,41,25,36,14,15,24,5,75,68,7,4,5,5,2324,165,4,534,865,48,4,65,84,65,8} ;
        int sume = 0 ;
        int sumo = 0 ;
        for(int i=0 ; i<a.length ; i++)
        {
            if(i%2==0){
                sume+=a[i] ;

            }
            else {
                sumo+=a[i] ;
            }
        }
        System.out.println("Sum of Even output =" + sume);
        System.out.println("Sum of odd output =" + sumo);
    }
}

