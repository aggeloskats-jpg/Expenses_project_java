import java.util.Scanner;

public class Expense {
	String description;
	double amount;
	String category;

	public Expense(String description, double amount, String category )
	{
		this.description = description;
		this.amount = amount;
		this.category = category;
	}

	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		String[] categories = {"Διατροφή","Λογαριασμοί","Άλλα έξοδα","Επισκευές"};


		System.out.println("Δώσε περιγραφή εξόδου");
		String desc = scanner.nextLine();


		System.out.println("Δώσε ποσό (€): ");
		double amt = scanner.nextDouble();


		System.out.println("Eπίλεξε κατηγορία: ");
		for (int i=0; i< categories.length; i++){
			System.out.println((i + 1) + ". " + categories[i]);
	}

		int choice = scanner.nextInt();
		String cat = categories[choice - 1];

		Expense e1 = new Expense(desc, amt, cat);

		System.out.println("Επιτυχία");
		System.out.println("Περιγραφή: " + e1.description + " | Κατηγορία: " + e1.category + " | Ποσό: " + e1.amount + "€");

		scanner.close();
	}
}
