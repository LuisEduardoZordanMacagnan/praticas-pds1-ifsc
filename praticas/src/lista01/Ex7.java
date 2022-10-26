package lista01;

public class Ex7 {

	public static void main(String[] args) {
		Integer vint[] = { 7, 42, 68, 34, 72, 0, 69, 420, 12, 16 };
		for (int i = 0; i < 10; i++) {
			System.out.println(vint[i]);
		}
		System.out.println("Tamanho: " + vint.length);
		System.out.println("Ultimo: " + vint[(vint.length - 1)]);
	}
}
