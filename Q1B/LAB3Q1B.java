import java.util.Scanner;
public class LAB3Q1B
{
public static void main(String args[])
{
	Scanner scanner = new Scanner (System.in);

	System.out.print("Enter the price of 1kg of rice:");
	double priceperkg=scanner.nextDouble();

	System.out.print("Enter the number of kilograms you want to buy:");
	double kilograms=scanner.nextDouble();

	double totalamount = priceperkg*kilograms;
	double discount = totalamount * 0.1;
	double finalamount = totalamount - discount;

	System.out.println("Amount with 10% discount:"+finalamount);

	scanner.close();
	}
}

