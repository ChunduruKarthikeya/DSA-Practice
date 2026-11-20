import java.util.Scanner;
public class BinaryToDecimal {
    public static int BinaryToDec(int number) {
        int dec = 0;
        int pow = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            dec = dec + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            number = number / 10;
        }
        return dec;
    }
    public static void main(String[] args) {
        System.out.println("Enter a binary number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = BinaryToDec(number);
        System.out.println("The decimal equivalent is: ");
        System.out.println(BinaryToDec(result));
        sc.close();
    }
}
