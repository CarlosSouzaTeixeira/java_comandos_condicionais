package ex5;
import java.util.Scanner;
public class ex5 {


		public static void main(String[] args) {
			
			Scanner leitor =new Scanner (System.in);
			Double n1, n2, n3,n4, media;
			
			System.out.print("Digite a primeira nota: ");
			n1 = leitor.nextDouble();
			
			System.out.print("Digite a segunda nota: ");
			n2 = leitor.nextDouble();
			
			System.out.print("Digite a terceira nota: ");
			n3 = leitor.nextDouble();
			
			System.out.print("Digite a quarta nota: ");
			n4 = leitor.nextDouble();
			
			media = ((n1+n2+n3+n4)/4); 
			
			if(media>7) {
				
				System.out.printf("Sua m�dia foi %.2f. Par�bens voc� foi aprovado!", media);
			}else if (media>=3.5 && media<7)
				System.out.printf("Sua m�dia foi %.2f. Voc� est� de recupera��o!", media); 
			else {
				System.out.printf("Sua m�dia foi %.2f. Voc� foi reprovado!", media);
		}

	}
		}
	


