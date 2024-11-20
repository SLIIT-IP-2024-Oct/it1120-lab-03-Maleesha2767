import java.util.Scanner;
public class LAB3Q2
{
public static void main(String args[])
{
	Scanner scanner = new Scanner (System.in);

	System.out.print("Enter the monthly salary:");
	double monthlysalary = scanner.nextDouble();

	System.out.print("Enter the OT hours:");
	double OThours=scanner.nextDouble();

	System.out.print("Enter the OT hourly rate:");
	double OThourlyrate=scanner.nextDouble();

	double OTamount=OThours*OThourlyrate;
	double totalsalary = monthlysalary + OTamount;
	
	System.out.println("The total salary including OT is:"+totalsalary);

	scanner.close();
	}
}

 
	
