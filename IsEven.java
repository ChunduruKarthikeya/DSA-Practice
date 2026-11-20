import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println("Number is Even !");
        }
         else {
            System.out.println("Number is Odd !");
         }
         sc.close();
    }
}
