package lista01;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, maior, menor;
		Integer vint[] = new Integer[10];
		System.out.println("Digite o 1° número:");
		vint[0] = Integer.valueOf(scan.nextLine());
		maior = vint[0];
		menor = vint[0];
		for (i = 1; i < vint.length; i++) {
			System.out.println("Digite o " + (i + 1) + "° número:");
			vint[i] = Integer.valueOf(scan.nextLine());
			if (vint[i] > maior) {
				maior = vint[i];
			} else {
				if (vint[i] < menor) {
					menor = vint[i];
				}
			}
		}
		System.out.println("Maior: " + maior + ". Menor: " + menor);
	}

}
