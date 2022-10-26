package lista01;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome, sIdade;
		System.out.println("Digite um nome e idade: ");
		nome = scan.nextLine();
		sIdade = scan.nextLine();
		while (sIdade.isEmpty()) {
			System.out.println("Erro! Digite idade corretamente:");
			sIdade = scan.nextLine();
		}
		Integer idade = Integer.valueOf(sIdade);
		System.out.println("Nome: " + nome + ". Idade: " + idade);
	}

}
