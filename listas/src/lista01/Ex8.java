package lista01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> listaDeElementos = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "° elemento:");
			listaDeElementos.add(scan.nextLine());
		}
		System.out.println("===");
		for (String string : listaDeElementos) {
			System.out.println(string);
		}
	}

}
