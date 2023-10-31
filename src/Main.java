//import klasy Scanner z pakietu util
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //tworzenie instancji klasy Scanner oraz obiektu klasy Scanner, argument System.in
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Podaj imię studenta");
        // deklaracja zmiennej String imie i wczytanie wprowadzoneego tekstu do tej zmiennej
        String imie = scanner.nextLine();

        System.out.println(" Podaj wiek studenta!");
        // deklaracja zmiennej całlkowitoliczbowej int wiek
        int wiek = scanner.nextInt();

        // wyswietlenie
        System.out.println("Student: " + imie );
        System.out.println(" Wiek: " + wiek + " lat");

        scanner.close();


        }
    }
