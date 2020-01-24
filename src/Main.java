import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.next();
        System.out.print("Enter a number as an index: ");
        int index = input.nextInt();

        int length = word.length();
        System.out.println("The length of " + word + " is: " + index);
        String slice = word.substring(0, index);
        System.out.println("The substring from 0 to " + index + " is: " + slice);
    }
}
