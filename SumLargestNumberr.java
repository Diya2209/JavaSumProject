import java.util.Scanner;

public class SumLargestNumberr {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the first number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the first number:");
        int num3 = scanner.nextInt();

        int largest = Math.max(num1, Math.max(num2, num3));

        int sum = 0;
        int temp = largest;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        System.out.println("The largest number is:" + largest);
        System.out.println("The sum of the largest number is:" + sum);

        float average = (num1 + num2 + num3) / 3;
        System.out.println("The average of the three numbers is:" + average);
        scanner.close();
    }

}