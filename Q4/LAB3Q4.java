import java.util.Scanner;

public class LAB3Q4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();
        
         String numberStr = String.valueOf(number);
        for (int i = 0; i < numberStr.length(); i++) {
            System.out.print(numberStr.charAt(i) + " ");
        }
    }
}