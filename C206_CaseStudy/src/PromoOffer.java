
//shafrizan
import java.util.ArrayList;

public class PromoOffer {
	private String itemName;
	private int itemPrice;
	private int discItemPrice;
	private String promoStart;
	private String promoEnd;

	public PromoOffer(String itemName, int itemPrice, int discItemPrice, String promoStart, String promoEnd) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.discItemPrice = discItemPrice;
		this.promoStart = promoStart;
		this.promoEnd = promoEnd;
	}

	public String getitemName() {
		return itemName;
	}

	public int getitemPrice() {
		return itemPrice;
	}

	public int getdiscItemPrice() {
		return discItemPrice;
	}

	public String getpromoStart() {
		return promoStart;
	}

	public String getpromoEnd() {
		return promoEnd;
	}

	public static void viewAllPromoOffer(ArrayList<PromoOffer> promoOfferList) {
		// TODO Auto-generated method stub

	}

	public static void menu() {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

	}

	public static void addPromoOffer(ArrayList<PromoOffer> promoOfferList) {
		// TODO Auto-generated method stub

	}

}
