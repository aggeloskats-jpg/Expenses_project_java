import java.util.Scanner;

public class Expense {
	String description;
	double amount;
	String category;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] categories = {"Διατροφή","Λογαριασμοί","Άλλα έξοδα","Επισκευές"};

		Expense e1 = new Expense();

		System.out.println("Δώσε περιγραφή εξόδου: ");
		e1.description = scanner.nextLine();

		System.out.println("Δώσε ποσό (€): ");
		e1.amount = scanner.nextDouble();

		System.out.println("Eπίλεξε κατηγορία: ");
		for (int i=0; i< categories.length; i++){
			System.out.println((i + 1) + ". " + categories[i]);
		}
		int choice = scanner.nextInt();
		e1.category = categories[choice - 1];

		System.out.println("Επιτυχία");
		System.out.println("Περιγραφή: " + e1.description + " | Κατηγορία: " + e1.category + " | Ποσό: " + e1.amount + "€");

		scanner.close();
	}
}
