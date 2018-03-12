import java.util.Scanner;

/**
 * Created by Mateusz Wyrzykowski
 */

/**
 * Prosta gra, w której zadaniem użytkownika jest odgadnięcie
 * jaka liczba została wybrana przez komputer.
 * Liczba znajduje sie w przedziale od 1 do 100.
 */


public class NumberGame {

    public static void main(String[] args) {
        /**
         * Ponieważ Math.random to losowa liczba typu long, która może być również = 0,
         * została zamieniona na typ int przemnożona przez 100 i dodane do całości jeden.
         */
        int randomNumber = (int) (Math.random() * 100) + 1;

        //zmienna dzięki której wiadomo czy użytkownik odgadł liczbę.
        boolean hasWon = false;

        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it.");

        //Inicjalizacja Scannera aby można było podac dane.
        Scanner scanner = new Scanner(System.in);

        //Pętla w której gracz ma 10 szans na odgadnięcie.
        for(int i = 10; i > 0; i--){
            System.out.println("You have " + i + "guess(es) left. Choose again: ");

            //liczba wskazana przez gracza.
            int guess = scanner.nextInt();

            //jeżeli wylosowana liczba jest mniejsza.
            if(randomNumber < guess){
                System.out.println("It's smaller than " + guess + "guess.");
            }

            //jeżeli wylosowana liczba jest większa.
            if(randomNumber > guess){
                System.out.println("It's larger than " + guess + "guess.");
            }

            //jeżeli gracz trafił to ustawia wartość hasWon na true i opuszcza pętlę.
            if(randomNumber == guess){
                hasWon = true;
                break;
            }
        }

        //Obwieszczenie wyniku.
        if (hasWon == true){
            System.out.println("Correct... You win!");
        }else{
            System.out.println("Game over... You lose.");
            System.out.println("The random number was: " + randomNumber);
        }


    }

}
