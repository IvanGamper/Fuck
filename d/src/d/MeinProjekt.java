package d;

public class MeinProjekt {

	public MeinProjekt() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}

import java.util.Scanner;

public class Altersabfrage {
    public static void main(String[] args) {
        // Scanner-Objekt erstellen, um Benutzereingaben zu lesen
        Scanner scanner = new Scanner(System.in);

        // Den Benutzer nach seinem Alter fragen
        System.out.print("Bitte geben Sie Ihr Alter ein: ");
        int alter = scanner.nextInt();

        // Altersabhängige Nachricht ausgeben
        if (alter < 18) {
            System.out.println("Sie sind minderjährig.");
        } else if (alter >= 18 && alter < 65) {
            System.out.println("Sie sind erwachsen.");
        } else {
            System.out.println("Sie sind im Ruhestand oder bald im Ruhestand.");
        }

        // Scanner schließen
        scanner.close();
    }
}

