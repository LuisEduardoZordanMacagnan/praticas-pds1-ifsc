package lista01;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		Integer aint;
		String sint;
		for (i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "° número:");
			sint = scan.nextLine();
			aint = Integer.valueOf(sint);
			System.out.println(aint);
		}
	}
}
