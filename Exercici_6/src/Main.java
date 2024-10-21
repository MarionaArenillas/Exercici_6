//llibreria que utilitzarem per llegir el número demanat a l'usuari
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Benvingut al programa!");
        Scanner input = new Scanner(System.in);

        double litres;
        do {
            //preguntar-li a l'usuari quants litres plou
            System.out.println("Quants litres per metre quadrat plou? ");
            litres = input.nextDouble();

            if (litres >= 90) {
                System.out.println("Obrir les comportes per desviar del riu Onyar al riu Ter.");
            } else {
                System.out.println("No obrim les comportes. ");
            }
        } while (litres < 90);
        //estem a la branca 2
    }
}