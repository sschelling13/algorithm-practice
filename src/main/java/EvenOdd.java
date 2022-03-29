import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        while (input.hasNextInt()) {
            num = input.nextInt();
            System.out.println((num % 2) == 0 ? "even" : "odd");
        }
    }
}
