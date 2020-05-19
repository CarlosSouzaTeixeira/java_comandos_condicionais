package ex2;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite sua idade:");
		int idade = leitor.nextInt();
		if(idade >=5 && idade <=10)
			System.out.println("Infantil");
		if(idade >11 && idade <=17)
			System.out.println("Juvenil");
		else if(idade >=18)
			System.out.println("Adulto");
		}

	}


