package oops1;

import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product name ");
		String product = sc.next();
		System.out.println("Enter the price of product ");
		int price = sc.nextInt();
		System.out.println("Enter the quantity in hand");
		int numbers = sc.nextInt();
		System.out.println("Enter the sale details");
		int sale = sc.nextInt();
		System.out.println("enter the purchases today");
		int purchases = sc.nextInt();
		Product stf = new Product(product, price, numbers);
		System.out.println(stf.getNetprice());
		System.out.println(stf.sale(sale));
		stf.print();
		stf.setTaxrate(10);
		System.out.println(Product.getTaxrate());
	}

}
