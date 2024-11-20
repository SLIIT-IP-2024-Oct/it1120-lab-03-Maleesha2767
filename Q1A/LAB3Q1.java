import java.util.Scanner;
public class LAB3Q1
{
public static void main (String[]args)
{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the price of 1kg of rice:");
		double priceperKg = scanner.nextDouble();

		System.out.print("Enter the number of kilograms you want to buy:");
		double quantity = scanner.nextDouble();

		double totalAmount =priceperKg*quantity;

		System.out.println("Total amount to paid: " + totalAmount);

		scanner.close();

	}
}

		
	