package ex1;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite um n�mero:");
		double num = leitor.nextDouble();
		if(num >=20 && num <=90)
			System.out.println("O n�mero est� entre 20 e 90");
		else {
			System.out.println("O n�mero n�o est� entre 20 e 90");
		}

	}

}
