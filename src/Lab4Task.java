import java.util.Scanner;
public class Lab4Task {

    private static final byte TOTAL_PARTICIPANTS = 100;

    private static void sellTicket(String participantName) {
        String message = "Congratulations, " + participantName + ". " +
                "See you at the conference!";
        System.out.println(message);
    }

    public static void main(String[] args) {

        byte a = 0;

        int i = 0 ;
        while (i <=100) {

            System.out.println("Total ticket left = " + (100-i));

            System.out.println("Enter your name");


            Scanner n = new Scanner(System.in);
            String name = n.nextLine();


            sellTicket(name);


            i++;


            if (i == TOTAL_PARTICIPANTS ) {

                System.out.println("SOrry, The tickets are sold-out !");

            }
        }
        }
}


