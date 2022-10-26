package lista01;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String resp, sint;
		System.out.println("Digite um número:");
		sint = scan.nextLine();
		while (sint.isEmpty()) {
			System.out.println("Erro! Digite um número corretamente:");
			sint = scan.nextLine();
		}
		Integer aint = Integer.valueOf(sint); 
		if (aint % 2 == 0) {
			resp = "É par";
		} else {
			resp = "É impar";
		}
		System.out.println(resp);
	}
}
