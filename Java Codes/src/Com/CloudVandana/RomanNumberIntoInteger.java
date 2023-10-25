package Com.CloudVandana;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class RomanNumberIntoInteger {

	     public static int romanToInt(String s) {
	         Map<Character, Integer> Map = new HashMap<>();
	         Map.put('I', 1);
	         Map.put('V', 5);
	         Map.put('X', 10);
	         Map.put('L', 50);
	         Map.put('C', 100);
	         Map.put('D', 500);
	         Map.put('M', 1000);

	         int result = 0;
	         int prevValue = 0;

	         for (int i = s.length() - 1; i >= 0; i--) {
	             char currentSymbol = s.charAt(i);
	             int currentValue = Map.get(currentSymbol);

	             if (currentValue < prevValue) {
	                 result -= currentValue;
	             } else {
	                 result += currentValue;
	             }

	             prevValue = currentValue;
	         }

	         return result;
	     }

	     public static void main(String[] args) {
	         Scanner scanner = new Scanner(System.in);

	         System.out.print("Enter a Roman number: ");
	         String romanNumber = scanner.nextLine();

	         int result = romanToInt(romanNumber.toUpperCase());
	         System.out.println("Integer equivalent: " + result);

	         scanner.close();
	     } 
	 }

 