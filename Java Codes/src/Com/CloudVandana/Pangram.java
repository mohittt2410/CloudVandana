package Com.CloudVandana;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        if (isPangram(input.toLowerCase())) {
            System.out.println("It's a pangram!");
        } else {
            System.out.println("It's not a pangram.");
        }
    }

    private static boolean isPangram(String input) {
        Set<Character> alphabetSet = new HashSet<>(); 

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.add(c);
            }
        }

        return alphabetSet.size() == 26;
    

    }
    }
