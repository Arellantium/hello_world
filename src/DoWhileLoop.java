import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("Sekeziona il numero del'opzione scelta");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Quit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 0:
                    System.out.println("Grazie per visitarci");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("scegliere una opzione valida");
            }
        }while(response != 0);
    }
}
