package lt.vcd;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Įveskite metus: ");
        int year = scanner.nextInt();

        // Olimpinės žaidynės prasidėjo 1896 m. ir vyksta kas 4 metus
        if (year >= 1896 && (year - 1896) % 4 == 0) {
            int edition = (year - 1896) / 4 + 1;
            System.out.println(year + " metai yra olimpiniai. Žaidynių numeris (edition): " + edition);
        } else {
            System.out.println(year + " metai nėra olimpiniai.");
        }

        scanner.close();
    }
}

