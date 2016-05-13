package chp13.strings;
import java.util.*;

public class Receipt {
	private double total = 0;
	private Formatter f = new Formatter(System.out);
	public void printTitle() {
		f.format("%-15s %15s %15s\n", "Item", "Qty", "Price");
		f.format("%-15s %15s %15s\n", "----", "----", "-----");
	}
	public void print(String name, int qty, double price) {
		f.format("%-15.15s %15s %15.2f\n", name, qty, price);
		total += price;
	}
	public void printTotal() {
		f.format("%-15s %15s %15.2f\n", "Tax", "", total*0.06);
		f.format("%-15s %15s %15s\n", "", "", "-----");
		f.format("%-15s %15s %15.2f\n", "Total", "", total*1.06);
	}
	public static void main(String[] args) {
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("Jack's Magic Beans", 4, 4.25);
		receipt.print("Pricess Peas", 3, 5.1);
		receipt.print("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();
	}

}
