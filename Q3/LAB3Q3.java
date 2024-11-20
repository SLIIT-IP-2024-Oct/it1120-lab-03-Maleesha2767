import java.util.Scanner;
public class LAB3Q3
{
public static void main(String args[])
{
	Scanner scanner = new Scanner (System.in);

	System.out.print("Enter the money amount:");
	int amount = scanner.nextInt();
	
	int count5000 = amount/5000;
	amount = amount % 5000;

	int count1000 = amount/1000;
	amount = amount%1000;

	int count500 = amount/500;
	amount = amount%500;

	int count200 = amount/200;
	amount = amount%200;

	int count100 = amount/100;
	amount = amount%100;

	int count50 = amount/50;
	amount = amount%50;

	int count20 = amount/20;
	amount = amount%20;

	int count10 = amount/10;
	amount = amount%10;

	int count5 = amount/5;
	amount = amount%5;

	int count2 = amount/2;
	amount = amount%2;

	int count1 = amount/1;
	amount = amount%1;


	System.out.println("5000 notes : "+ count5000);
	System.out.println("1000 notes : "+ count1000);
	System.out.println("500 notes : "+ count500);
	System.out.println("200 notes : "+ count200);
	System.out.println("100 notes : "+ count100);
	System.out.println("50 notes : "+ count50);
	System.out.println("20 notes : "+ count20);
	System.out.println("10 notes : "+ count10);
	System.out.println("5 coins : "+ count5);
	System.out.println("2 coins : "+ count2);
	System.out.println("1 coins : "+ count1);




	scanner.close();
	}
}
