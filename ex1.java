package ex1;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite um número:");
		double num = leitor.nextDouble();
		if(num >=20 && num <=90)
			System.out.println("O número está entre 20 e 90");
		else {
			System.out.println("O número não está entre 20 e 90");
		}

	}

}
