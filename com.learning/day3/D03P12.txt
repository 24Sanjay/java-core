package day03;
import java.util.Scanner;

public class D03P12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean canBeSplit = canSplitIntoFourStrings(input);

        if (canBeSplit) {
            System.out.println("The string can be split into four different substrings.");
        } else {
            System.out.println("The string cannot be split into four different substrings.");
        }

        scanner.close();
    }

    public static boolean canSplitIntoFourStrings(String str) {
        int length = str.length();
        if (length < 4) {
            return false;
        }

        for (int i = 1; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    String first = str.substring(0, i);
                    String second = str.substring(i, j);
                    String third = str.substring(j, k);
                    String fourth = str.substring(k);

                    if (!first.equals(second) && !first.equals(third) && !first.equals(fourth)
                            && !second.equals(third) && !second.equals(fourth) && !third.equals(fourth)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
