import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	// ping ping
	private Stall s1;
	private Stall s2;
	private ArrayList<Stall> StallList;

	// oscar
	private Item I1;
	private Item I2;
	private ArrayList<Item> ItemList;

	// jordan
	private Order o1;
	private Order o2;
	private ArrayList<Order> OrderList;

	// shafrizan
	private PromoOffer p1;
	private PromoOffer p2;

	private ArrayList<PromoOffer> PromoOfferList;

	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		// ping ping
		s1 = new Stall("Stall 1", "10/7/2020");
		s2 = new Stall("Stall 2", "10/9/2020");

		StallList = new ArrayList<Stall>();

		// oscar
		I1 = new Item("Pork", 10);
		I2 = new Item("Steak", 15);
		ItemList = new ArrayList<Item>();

		// jordan
		o1 = new Order("01", "Milo", 3);
		o2 = new Order("02", "Tea", 4);

		OrderList = new ArrayList<Order>();

		// shafrizan
		p1 = new PromoOffer("Chicken Rice", 2, 1, "26 Jan", "29 Jan");
		p2 = new PromoOffer("Chicken Rice", 2, 1, "26 Jan", "29 Jan");

		PromoOfferList = new ArrayList<PromoOffer>();

	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

	@Test
	public void addStallTest() { // ping ping
		// Stall list is not null, so that can add a new Stall - boundary
		assertNotNull("Test if there is valid Category arraylist to add to", StallList);

		// Given an empty list, after adding 1 Stall, the size of the list is 1 -
		// normal
		// The Stall just added is as same as the first Stall of the list
		C206_CaseStudy.addStall(StallList, s1);
		assertEquals("Test that Stall arraylist size is 1", 1, StallList.size());
		assertSame("Test that Stall is added", s1, StallList.get(0));

		// Add another Stall. test The size of the list is 2? - normal
		// The Stall just added is as same as the second Stall of the list
		C206_CaseStudy.addStall(StallList, s2);
		assertEquals("Test that Stall arraylist size is 2", 2, StallList.size());
		assertSame("Test that Category is added", s2, StallList.get(1));
	}

	@Test

	public void retrieveAllStallTest() {
		// Test if Stall list is not null but empty -boundary
		assertNotNull("Test if there is valid Stall arraylist to add to ", StallList);

		// test if the list of Stall retrieved from the case study is empty -
		// boundary
		String allStall = C206_CaseStudy.retrieveAllStall(StallList);
		String testOutput = "";
		assertEquals("Check that ViewAllStalllist", testOutput, allStall);

		// Given an empty list, after adding 2 Stalls, test if the size of the list is
		// 2 - normal
		C206_CaseStudy.addStall(StallList, s1);
		C206_CaseStudy.addStall(StallList, s2);
		assertEquals("Test that Stall arraylist size is 2", 2, StallList.size());

		// test if the expected output string same and date same as the list of Stall
		// retrieved
		// from the case study
		allStall = C206_CaseStudy.retrieveAllStall(StallList);
		testOutput = String.format("%-20s %-20s\n", "Stall 1", "10/7/2020");
		testOutput += String.format("%-20s %-20s\n", "Stall 2", "10/9/2020");
		assertEquals("Test that ViewAllStalllist", testOutput, allStall);
	}

	@Test
	public void deleteStallTest() {
		// Test if the Stall is not empty
		assertNotNull("Test if there is valid Stall arrayList to add to", StallList);

		StallList.add(s1);
		StallList.add(s2);
		assertEquals("Test if that Stall arrayList size is 2?", 2, StallList.size());

		StallList.remove(s1);
		assertEquals("Test if that Stall arrayList size is 1", 1, StallList.size());

		StallList.remove(s2);
		assertEquals("Test if that Stall arrayList size is 0", 0, StallList.size());

	}

	// oscar
	@Test
	public void addItemTest() {
		assertNotNull("Test if there is valid Item arraylist to add to", ItemList);

		ItemMain.addItem(ItemList);
		assertEquals("Test that Item arraylist size is 1", 1, ItemList.size());
		assertSame("Test that Item is added", I1, ItemList.get(0));

		ItemMain.addItem(ItemList);
		assertEquals("Test that Item arraylist size is 2", 2, ItemList.size());
		assertSame("Test that Item is added", I2, ItemList.get(1));
	}

	@Test
	public void retrieveAllItemTest() {
		assertNotNull("Test if there is valid Item arraylist to add to", ItemList);

		ItemList.add(I1);
		ItemList.add(I2);
		System.out.println(ItemList.size());

		assertEquals("Test if that Item arraylist size is 2?", 2, ItemList.size());
	}

	@Test
	public void deleteItemTest() {
		// Test if the Item is not empty
		assertNotNull("Test if there is valid Item arrayList to add to", ItemList);

		ItemList.add(I1);
		ItemList.add(I2);
		assertEquals("Test if that Item arrayList size is 2?", 2, ItemList.size());

		ItemList.remove(0);
		assertEquals("Test if that Item arrayList size is 1", 1, ItemList.size());
	}

	// jordan
	@Test
	public void addOrderTest() {

		assertNotNull("Test if there is valid Category arraylist to add to", OrderList);

		MainOrder.addOrder(OrderList, o1);
		assertEquals("Test that Orderarraylist size is 1", 1, OrderList.size());
		assertSame("Test that Order is added", o1, OrderList.get(0));

		MainOrder.addOrder(OrderList, o2);
		assertEquals("Test that Order arraylist size is 2", 2, OrderList.size());
		assertSame("Test that Category is added", o2, OrderList.get(1));
	}

	@Test

	public void retrieveAllStallTest() {

		assertNotNull("Test if there is valid Order arraylist to add to", OrderList);

		OrderList.add(o1);
		OrderList.add(o2);
		System.out.println(OrderList.size());

		assertEquals("Test if that Order arraylist size is 2?", 2, OrderList.size());
	}

	@Test
	public void deleteStallTest() {
		// Test if the Stall is not empty
		assertNotNull("Test if there is valid Order  arrayList to add to", OrderList);

		OrderList.add(o1);
		OrderList.add(o2);
		assertEquals("Test if that Order  arrayList size is 2?", 2, OrderList.size());

		OrderList.remove(0);
		assertEquals("Test if that Order  arrayList size is 1", 1, OrderList.size());
	}

	// shafrizan
	@Test
	public void addPromoOfferTest() {
		assertNotNull("Test if there is valid PromoOffer arraylist to add to", PromoOfferList);

		PromoOffer.addPromoOffer(PromoOfferList);
		assertEquals("Test that PromoOffer arraylist size is 1", 1, PromoOfferList.size());
		assertSame("Test that PromoOffer is added", p1, PromoOfferList.get(0));

		PromoOffer.addPromoOffer(PromoOfferList);
		assertEquals("Test that PromoOffer arraylist size is 2", 2, PromoOfferList.size());
		assertSame("Test that PromoOffer is added", p2, PromoOfferList.get(1));
	}

	@Test
	public void retrieveAllPromoOfferTest() {
		assertNotNull("Test if there is valid PromoOffer arraylist to add to", PromoOfferList);

		PromoOfferList.add(p1);
		PromoOfferList.add(p2);
		System.out.println(PromoOfferList.size());

		assertEquals("Test if that PromoOffer arraylist size is 2?", 2, PromoOfferList.size());
	}

	@Test
	public void deletePromoOfferTest() {
		// Test if the PromoOffer is not empty
		assertNotNull("Test if there is valid PromoOffer arrayList to add to", PromoOfferList);

		PromoOfferList.add(p1);
		PromoOfferList.add(p2);
		assertEquals("Test if that PromoOffer arrayList size is 2?", 2, PromoOfferList.size());

		PromoOfferList.remove(0);
		assertEquals("Test if that PromoOffer arrayList size is 1", 1, PromoOfferList.size());
	}

	@After
	public void tearDown() throws Exception {
		// ping ping
		s1 = null;
		s2 = null;
		StallList = null;

		// oscar
		I1 = null;
		I2 = null;
		ItemList = null;

		// jordan
		o1 = null;
		o2 = null;
		OrderList = null;

		// shafrizan
		p1 = null;
		p2 = null;
		PromoOfferList = null;

	}

}
