import java.util.Scanner;

public class Repetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int max = 1;
        String input = sc.next();
        for(int i = 1; i < input.length(); i++) {
            if(input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
        sc.close();
    }
}
