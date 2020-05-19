package ex3;
import java.util.Scanner;
public class ex3 {


		public static void main(String[] args) {
			
			Scanner leitor =new Scanner (System.in);
			double n1, n2, n3, n4, n5, n6;
			
			System.out.print("Digite o salario: ");
			n1 = leitor.nextDouble();
			n2= n1*15/100;
			n3=n1*7/100;
			n5= n2+n1;
			n6=n3+n1;
			
			
			if(n1>=0 && n1<=1000) {
				System.out.println("Percentual de aumento: 15%");
				System.out.printf("Novo Salario em R$: "+ n5);
				}
			else if (n1 >=1000.01 && n1 <=2500) {
				System.out.println("Percentual de aumento: 7%");
			System.out.printf("Novo Salario em R$: %.2f", n6);
			}
			else{
				System.out.println("Esse valor de salário não recebe aumento");
				System.out.println("Salário em R$: "+n1);
		}

	}
		}
	