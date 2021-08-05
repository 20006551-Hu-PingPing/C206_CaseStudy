import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Stall> StallList = new ArrayList<Stall>();

		ArrayList<Item> ItemList = new ArrayList<Item>();

		ArrayList<Order> OrderList = new ArrayList<Order>();

		ArrayList<PromoOffer> PromoOfferList = new ArrayList<PromoOffer>();

		StallList.add(new Stall("Stall 1", "10/7/2020"));
		StallList.add(new Stall("Stall 2", "10/9/2020"));

		ItemList.add(new Item("Pork", 10));
		ItemList.add(new Item("Steak", 10));

		OrderList.add(new Order("01", "Milo", 3));
		OrderList.add(new Order("02", "Tea", 4));

		PromoOfferList.add(new PromoOffer("Chicken Rice", 2, 1, "26 Jan", "29 Jan"));

		int option = 0;

		while (option != 4) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// add new stall
				addStall(StallList, inputStall());

			} else if (option == 2) {
				// view a existing stall
				C206_CaseStudy.viewAllStall(StallList);

			} else if (option == 3) {
				// Delete Stall
				deleteStall(StallList);
			} else if (option == 4) {

				System.out.println("Thank You!");
			} else {
				System.out.println("Invalid option");
			}
		}
		// oscar
		int option2 = -1;
		while (option != 4) {

			menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				addItem(ItemList);

			} else if (option == 2) {
				viewItem(ItemList);

			} else if (option == 3) {
				deleteItem(ItemList);
			} else if (option == 4) {
				System.out.println("Bye");
			} else {
				System.out.println("Invalid option");
			}
		}
		// jordan
		int option3 = 0;

		while (option != 4) {

			MainOrder.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// add new Order
				addOrder(OrderList, inputOrder());

			} else if (option == 2) {
				// view existing Order
				MainOrder.viewExistingOrder(OrderList);

			} else if (option == 3) {
				// Delete Order
				deleteOrder(OrderList);
			} else if (option == 4) {

				System.out.println("Thank You!");
			} else {
				System.out.println("Invalid option");
			}
		}

		// shafrizan
		int option4 = 0;
		while (option != 4) {
			PromoCodes.menu();
			option = Helper.readInt("Enter an option > ");
			if (option == 1) {
				// ADD PROMOTIONAL OFFERS
				addPromoOffer(PromoOfferList, inputPromoOffer());

			} else if (option == 2) {
				// VIEW PROMOTIONAL OFFERS
				PromoCodes.viewExistingPromoOffer(PromoOfferList);
			} else if (option == 3) {
				// DELETE PROMOTIONAL OFFERS
				deletePromoOffer(PromoOfferList);
			} else if (option == 4) {

				System.out.println("Thank You!");
			} else {
				System.out.println("Invalid option");
			}
		}

	}

	// ping
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

	// oscar
	public static void menu2() {

		Helper.line(30, "=");
		System.out.println("CANTEEN FOOD ITEM MENU");
		Helper.line(30, "-");
		System.out.println("1. Add New Food Item");
		System.out.println("2. View existing Food Item");
		System.out.println("3. Delete an existing Food Item");
		System.out.println("4. Quit");
		Helper.line(30, "=");
	}

	// jordan
	public static void menu3() {

		Helper.line(30, "=");
		System.out.println("PURCHASE ORDERS OF INGREDIENTS");
		Helper.line(30, "-");
		System.out.println("1. Add New Order");
		System.out.println("2. View An Existing Order");
		System.out.println("3. Delete An Existing Order");
		System.out.println("4. Quit");
		Helper.line(30, "=");
	}

	// shafrizan
	public static void menu4() {

		Helper.line(30, "=");
		System.out.println("PROMOTIONAL OFFERS");
		Helper.line(30, "-");
		System.out.println("1. Add New Promotion");
		System.out.println("2. View an existing Promotion");
		System.out.println("3. Delete an existing Promotion");
		System.out.println("4. Quit");
		Helper.line(30, "=");
	}

	// View existing stall by pingping
	public static String retrieveAllStall(ArrayList<Stall> StallList) {
		String output = "";

		for (int i = 0; i < StallList.size(); i++) {

			output += String.format("%-20s %-20s\n", StallList.get(i).getName(), StallList.get(i).getDate());

		}
		return output;

	}

	public static void viewAllStall(ArrayList<Stall> StallList) {
		Helper.line(30, "=");
		String output = String.format("%-20s %-20s\n", "STALL NAME", "START OPERATION DATE");
		Helper.line(30, "=");
		output += retrieveAllStall(StallList);
		System.out.println(output);
	}

	// Add Stall by ping ping
	public static Stall inputStall() {
		String name = Helper.readString("Enter name of Stall > ");
		String operDate = Helper.readString("Enter start date of operation (dd/MM/yyyy) > ");

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

			}
		}

	}

	// oscar
	public static String retrieveItem(ArrayList<Item> ItemList) {
		String output = "";

		String search = Helper.readString("Enter Item name to view > ");
		for (int i = 0; i < ItemList.size(); i++) {
			boolean stuff = false;
			if (search.equalsIgnoreCase(ItemList.get(i).getName())) {
				output += String.format("%-20s $%-20d\n", ItemList.get(i).getName(), ItemList.get(i).getPrice());
				stuff = true;
			} else if (stuff == false) {
				output = "Item cannot be found ";
			}
		}
		return output;
	}

	public static void viewItem(ArrayList<Item> ItemList) {
		Helper.line(30, "=");
		String output = String.format("%-20s %-20s\n", "ITEM NAME", "ITEM PRICE");
		Helper.line(30, "=");
		for (int i = 0; i < ItemList.size(); i++) {
			output += String.format("%-20s $%-20d\n", ItemList.get(i).getName(), ItemList.get(i).getPrice());
		}
		System.out.println(output);
	}

	public static void addItem(ArrayList<Item> ItemList) {
		String name = Helper.readString("Enter name of Item > ");
		int Price = Helper.readInt("Enter price >$ ");

		ItemList.add(new Item(name, Price));
		System.out.println("New Item added");
	}

	public static void deleteItem(ArrayList<Item> ItemList) {

		String deleteItem = Helper.readString("Enter Item to delete > ");
		boolean choice = false;
		// for (Item i : ItemList) {
		for (int i = 0; i < ItemList.size();) {
			// if (deleteItem.equalsIgnoreCase(i.getName())) {
			if (deleteItem.equalsIgnoreCase(ItemList.get(i).getName())) {
				ItemList.remove(i);
				System.out.println("Item deleted successfully");
				choice = true;
				i++;
			}
			i++;
		}
		if (choice == false) {
			System.out.println("Item no exist");
		}
	}

	// Add New Order
	public static Order inputOrder() {
		String name = Helper.readString("Enter Order Number > ");
		String ingri = Helper.readString("Enter Ingredient >");
		int qty = Helper.readInt("Enter Quantity >");
		Order o = new Order(name, ingri, qty);
		return o;
	}

	public static void addOrder(ArrayList<Order> CategoryList, Order o) {
		CategoryList.add(o);
		System.out.println("New Order added!");
	}

	// View Existing Order
	public static String retrieveOrder(ArrayList<Order> OrderList) {
		String output = "";

		String search = Helper.readString("Enter Purchase Order Number to view > ");
		for (int i = 0; i < OrderList.size(); i++) {

			if (search.equalsIgnoreCase(OrderList.get(i).getOrderNum())) {

				output += String.format("%-30s %-30s %-20s\n", OrderList.get(i).getOrderNum(),
						OrderList.get(i).getName(), OrderList.get(i).getQuantity());
			} else {
				System.out.println("Order not found!");
				;
			}
		}
		return output;
	}

	public static void viewExistingOrder(ArrayList<Order> OrderList) {
		Helper.line(30, "=");
		String output = String.format("%-30s %-30s %-20s\n", "PURCHASE ORDER NUMBER", "INGREIDENT", "QUANTITY");
		Helper.line(30, "=");
		output += retrieveOrder(OrderList);
		System.out.println(output);

	}

	public static void deleteOrder(ArrayList<Order> OrderList) {

		String deleteOrder = Helper.readString("Enter Order to delete > ");
		for (int i = 0; i < OrderList.size(); i++) {
			if (deleteOrder.equalsIgnoreCase(OrderList.get(i).getOrderNum())) {
				OrderList.remove(i);
				System.out.println(" Order deleted successfully");
				break;

			} else {
				System.out.println(" Order cannot be found");
				break;
			}
		}
	}

	// View existing promotion by Shafrizan Danial
	public static String retrievePromoOffer(ArrayList<PromoOffer> PromoOfferList) {
		String output = "";

		String search = Helper.readString("Enter Promotions to view > ");
		for (int i = 0; i < PromoOfferList.size(); i++) {

			if (search.equalsIgnoreCase(PromoOfferList.get(i).getitemName())) {

				output += String.format("%-20s %-20s %-20s %-20s %-20s\n", PromoOfferList.get(i).getitemName(),
						PromoOfferList.get(i).getitemPrice(), PromoOfferList.get(i).getdiscItemPrice(),
						PromoOfferList.get(i).getpromoStart(), PromoOfferList.get(i).getpromoEnd());
				break;

			}
		}
		return output;
	}

	public static void viewExistingPromoOffer(ArrayList<PromoOffer> PromoOfferList) {
		Helper.line(30, "=");
		String output = String.format("%-20s %-20s %-20s %-20s %-20s\n", "PROMOTIONAL OFFERS", "PRICE",
				"DISCOUNTED PRICE", "PROMOTION START", "PROMOTION END");
		Helper.line(30, "=");
		output += retrievePromoOffer(PromoOfferList);
		System.out.println(output);
	}

	// Add Promotion by Shafrizan Danial
	public static PromoOffer inputPromoOffer() {
		String itemName = Helper.readString("Enter promotional item name > ");
		int itemPrice = Helper.readInt("Enter promotional item original price > ");
		int itemDiscPrice = Helper.readInt("Enter promotional item discounted price > ");
		String promoStart = Helper.readString("Enter promotion start date > ");
		String promoEnd = Helper.readString("Enter promotion end date> ");

		PromoOffer po = new PromoOffer(itemName, itemPrice, itemDiscPrice, promoStart, promoEnd);
		return po;
	}

	public static void addPromoOffer(ArrayList<PromoOffer> PromoOfferList, PromoOffer po) {

		PromoOfferList.add(po);
		System.out.println("New Promotion added");
	}

	// Delete Promotional items by Shafrizan Danial
	public static void deletePromoOffer(ArrayList<PromoOffer> PromoOfferList) {
		String deletePromoOffer = Helper.readString("Enter Promotion to delete > ");
		for (int i = 0; i < PromoOfferList.size(); i++) {
			if (deletePromoOffer.equalsIgnoreCase(PromoOfferList.get(i).getitemName())) {
				PromoOfferList.remove(i);
				System.out.println("Promotional item deleted successfully");
				break;

			}

			else {
				System.out.println("Item Not Found");
			}
		}

	}
}
