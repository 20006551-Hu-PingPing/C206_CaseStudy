import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Stall> StallList = new ArrayList<Stall>();
		ArrayList<Item> ItemList = new ArrayList<Item>();
		
		int options = 0;
		while (options != 5) {
			
			C206_CaseStudy.menu();
			options = Helper.readInt("Enter an optionss > ");

			if (options == 1) {
				C206_CaseStudy.menu1();

			} else if (options == 2) {
				C206_CaseStudy.menu2();

			} else if (options == 3) {
			//	C206_CaseStudy.menu3();
				
			} else if (options == 4) {
			//	C206_CaseStudy.menu4();
				
			}else if (options == 5) {

				System.out.println("Thank You!");
			} else {
				System.out.println("Invalid option");
			}
		
		StallList.add(new Stall("Stall 1", "10/7/2020"));
		StallList.add(new Stall("Stall 2", "10/9/2020"));
		
		ItemList.add(new Item("Pork", 10));
		ItemList.add(new Item("Steak", 10));

		int option = 0;
		if(options ==1) {
		while (option != 4) {

			C206_CaseStudy.menu1();
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
				C206_CaseStudy.menu();
			} else {
				System.out.println("Invalid option");
			}
		}
		} else if (options == 2) {         //change
		while (option != 4) {

			C206_CaseStudy.menu2();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				addItem(ItemList, inputItem());

			} else if (option == 2) {
				C206_CaseStudy.viewExistingItem(ItemList);

			} else if (option == 3) {
				deleteItem(ItemList);
			} else if (option == 4) {
				C206_CaseStudy.menu();
			} else {
				System.out.println("Invalid option");
			}
		}
		}else if (options == 3) {
		
		}
		
		} 
	}
	public static void menu() {

		Helper.line(30, "=");
		System.out.println("CANTEEN OPTIONS");
		Helper.line(30, "-");
		System.out.println("1. Stall");
		System.out.println("2. Item");
		System.out.println("3. food");
		System.out.println("4. Promotions");
		System.out.println("5. Quit");
		Helper.line(30, "=");
	}
	public static void menu1() {

		Helper.line(30, "=");
		System.out.println("CANTEEN STALLS");
		Helper.line(30, "-");
		System.out.println("1. Add New Stall");
		System.out.println("2. View an existing stall");
		System.out.println("3. Delete an existing stall");
		System.out.println("4. Quit");
		Helper.line(30, "=");
	}
	public static void menu2() {

		Helper.line(30, "=");
		System.out.println("CANTEEN FOOD ITEM MENU");
		Helper.line(30, "-");
		System.out.println("1. Add New Food Item");
		System.out.println("2. View an existing Food Item");
		System.out.println("3. Delete an existing Food Item");
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
		// Oscar
		public static String retrieveItem(ArrayList<Item> ItemList) {
			String output = "";

			String search = Helper.readString("Enter Item name to view > ");
			for (int i = 0; i < ItemList.size(); i++) {

				if (search.equalsIgnoreCase(ItemList.get(i).getName())) {

					output += String.format("%-20s $%-20d\n", ItemList.get(i).getName(), ItemList.get(i).getPrice());
				}else {
					output+="Item cannot be found ";
				}
				
			}
			return output;
		}
		public static void viewExistingItem(ArrayList<Item> ItemList) {
			Helper.line(30, "=");
			String output = String.format("%-20s %-20s\n", "ITEM NAME", "ITEM PRICE");
			Helper.line(30, "=");
			output += retrieveItem(ItemList);
			System.out.println(output);
		}

		// Add Stall by ping ping
		public static Item inputItem() {
			String name = Helper.readString("Enter name of Item > ");
			int Price = Helper.readInt("Enter price >$ ");

			Item i = new Item(name, Price);
			return i;

		}

		public static void addItem(ArrayList<Item> CategoryList, Item i) {

			CategoryList.add(i);
			System.out.println("New Item added");
		}

		public static void deleteItem(ArrayList<Item> ItemList) {

			String deleteItem = Helper.readString("Enter Item to delete > ");
			for (int i = 0; i < ItemList.size(); i++) {
				if (deleteItem.equalsIgnoreCase(ItemList.get(i).getName())) {
					ItemList.remove(i);
					System.out.println("Item deleted successfully");
					break;

				}else {
					System.out.println("Item cannot be found");
					break;
			}
		}
	}
}
