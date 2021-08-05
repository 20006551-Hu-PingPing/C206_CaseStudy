import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Stall> StallList = new ArrayList<Stall>();

		StallList.add(new Stall("Stall 1", "10/7/2020"));
		StallList.add(new Stall("Stall 2", "10/9/2020"));

		int option = 0;

		while (option != 4) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// add new stall
				addStall(StallList, inputStall());

			} else if (option == 2) {
				// view a existing stall
				C206_CaseStudy.viewExistingStall(StallList);

			} else if (option == 3) {
				// Delete Stall
				deleteStall(StallList);
			} else if (option == 4) {

				System.out.println("Thank You!");
			} else {
				System.out.println("Invalid option");
			}
		}
	}

	public static void menu() {

		Helper.line(30, "=");
		System.out.println("CANTEEN STALLS");
		Helper.line(30, "-");
		System.out.println("1. Add New Stall");
		System.out.println("2. View an existing stall");
		System.out.println("3. Delete an existing stall");
		System.out.println("4. Quit");
		Helper.line(30, "=");
	}

	// View existing stall by pingping
	public static String retrieveStall(ArrayList<Stall> StallList) {
		String output = "";

		String search = Helper.readString("Enter Stall name to view > ");
		for (int i = 0; i < StallList.size(); i++) {

			if (search.equalsIgnoreCase(StallList.get(i).getName())) {

				output += String.format("%-20s %-20s\n", StallList.get(i).getName(), StallList.get(i).getDate());
			}else {
				output+="Stall cannot be found ";
			}
		
		
			
		}
		return output;
	}

	public static void viewExistingStall(ArrayList<Stall> StallList) {
		Helper.line(30, "=");
		String output = String.format("%-20s %-20s\n", "STALL NAME", "START OPERATION DATE");
		Helper.line(30, "=");
		output += retrieveStall(StallList);
		System.out.println(output);
	}

	// Add Stall by ping ping
	public static Stall inputStall() {
		String name = Helper.readString("Enter name of Stall > ");
		String operDate = Helper.readString("Enter start date of operation > ");

		Stall s = new Stall(name, operDate);
		return s;

	}

	public static void addStall(ArrayList<Stall> CategoryList, Stall s) {

		CategoryList.add(s);
		System.out.println("New Stall added");
	}

	// Delete Stall by ping ping 
	public static void deleteStall(ArrayList<Stall> StallList) {

		String deleteStall = Helper.readString("Enter Stall to delete > ");
		for (int i = 0; i < StallList.size(); i++) {
			if (deleteStall.equalsIgnoreCase(StallList.get(i).getName())) {
				StallList.remove(i);
				System.out.println("Stall deleted successfully");
				break;

			}else {
				System.out.println("Stall cannot be found");
				break;
			}
		}
		
	}
}
