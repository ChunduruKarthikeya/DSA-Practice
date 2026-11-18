import java.util.Scanner;
public class BinarySearch {
    public static int Binary(int numbers[], int key) {
        int left = 0;
        int right = numbers.length - 1;
        while (left  <= right) {
            int mid = (left + right) / 2;
            
            if(numbers[mid] == key) {
                return mid;
            }
            else if(numbers[mid] < key) {
                left = mid +  1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1; // if element not found
    }


public static void main(String[] args) {
    System.out.print("Enter the size of the array:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int numbers[] = new int[n];
    for(int i = 0; i < n; i++) {
        numbers[i] = sc.nextInt();
    }
    System.out.println("Enter the key to search:");
    int key  = sc.nextInt();
    int result = Binary(numbers, key);
    if(result == -1) {
        System.out.println("Element not found");
    }
    else {
        System.out.println("Element found at index: " + result);
    }

    sc.close();

}
}