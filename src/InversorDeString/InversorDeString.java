package InversorDeString;

import java.util.Scanner;

public class InversorDeString {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a string:");
	
		String input = scanner.next();
		String output = "";
		
		for(int i = input.length() - 1;i>=0;i--) {
			output = output + input.charAt(i);
		}
		
		System.out.println(output);
		scanner.close();
	}
	
}
