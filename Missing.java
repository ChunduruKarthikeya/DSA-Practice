import java.util.Scanner;

public class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n - 1];
        int xor = 0;

        for(int i = 0; i <= n; i++) {
           xor ^= i; 
        }
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            xor ^= arr[i];
        }
        System.out.println(xor);
        sc.close();
    }
}