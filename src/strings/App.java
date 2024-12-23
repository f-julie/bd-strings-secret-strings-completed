package strings;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.println("Enter a noun: ");
        String noun1 = scanner.nextLine();

        System.out.println("Enter another noun: ");
        String noun2 = scanner.nextLine();

        System.out.println("Enter an adverb: ");
        String adverb = scanner.nextLine();

        System.out.println("Enter one last noun: ");
        String noun3 = scanner.nextLine();

        String beginning = " your ";
        // Concatenation method 1
        beginning = verb + ", " + verb + ", " + verb + beginning + noun1 + '\n';

        String middle = "gently down the ";
        // Concatenation method 2
        //middle = middle.concat(noun2).concat(".");
        // Or
        middle = middle.concat(noun2 + "." + '\n');

        String end = "life is but a";
        // Method 3 using format
        //end = String.format("%s %s %s %s, %s %s", adverb, adverb, adverb, adverb, end, noun3);
        // Or
        end = String.format("%1$s, %1$s, %1$s, %1$s, %2$s %3$s%n", adverb, end, noun3);

        // Uppercase the first letter of beginning, middle, and end
        beginning = Character.toUpperCase(beginning.charAt(0)) + beginning.substring(1);
        middle = Character.toUpperCase(middle.charAt(0)) + middle.substring(1);
        // Another way
        end = end.substring(0, 1).toUpperCase() + end.substring(1);

        System.out.println("Your Song: ");
        System.out.println(beginning + middle + end);
    }
}
