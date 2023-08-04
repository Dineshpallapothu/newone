package Day3;

import java.util.Scanner;

public class TestSalesTransaction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the qauntity in units");
		int quantity = sc.nextInt();
		System.out.println("Enter the price");
		double price = sc.nextDouble();
		SalesTransaction sales = new SalesTransaction(quantity,price);
		SalesTransaction sales1 =new SalesTransaction();
		SalesTransaction sales2=new SalesTransaction();
		sales.setRateoftax(0.12);
		System.out.println(sales.getPrice());
		System.out.println(sales.getQuantity());
		System.out.println(sales.getamount());
		System.out.println(SalesTransaction.count);
		
	}
}
