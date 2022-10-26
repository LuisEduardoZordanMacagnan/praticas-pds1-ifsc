package lista01;

import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Scanner;

public class Ex10 {

	public static Double MF(Double no1, Double no2, Double no3) {
		Double media;
		media = (no1 + no2 + no3) / 3;
		return media;
	}

	public static boolean isNumeric(String str) {
		NumberFormat formatter = NumberFormat.getInstance();
		ParsePosition pos = new ParsePosition(0);
		formatter.parse(str, pos);
		return str.length() == pos.getIndex();
	}
	
	public static void main(String[] args) {
		int i;
		Double  no1, no2, no3;
		Scanner scan = new Scanner(System.in);
		String n1, n2, n3, str;
		do {
			System.out.println("Digite a 1° notas do aluno");
			n1 = scan.nextLine();
			str = n1;
		} while (n1.isEmpty() || !Ex10.isNumeric(str));
		do {
			System.out.println("Digite a 2° notas do aluno");
			n2 = scan.nextLine();
			str = n2;
		} while (n2.isEmpty() || !Ex10.isNumeric(str));
		do {
			System.out.println("Digite a 3° notas do aluno");
			n3 = scan.nextLine();
			str = n3;
		} while (n3.isEmpty() || !Ex10.isNumeric(str));
		no1 = Double.valueOf(n1);
		no2 = Double.valueOf(n2);
		no3 = Double.valueOf(n3);
		if (Ex10.MF(no1, no2, no3) >= 6) {
			System.out.println("Aprovado!");
		} else {
			if (Ex10.MF(no1, no2, no3) >= 4) {
				System.out.println("Recuperação!");
			} else {
				System.out.println("Reprovado!");
			}
		}
	}
}
