package ex4;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {

	    double a, b, c;
	        Scanner leitor = new Scanner(System.in);

	        System.out.print("Tamanho do lado 1:");
	        a = leitor.nextDouble();
	        System.out.print("Tamanho do lado 2:");
	        b = leitor.nextDouble();
	        System.out.print("Tamanho do lado 3:");
	        c = leitor.nextDouble();

	        if ( a==b && b==c) {
	                System.out.println("Triângulo Equilátero");
	        }else if((a == b) || (a == c)){
	            System.out.println("Triângulo Isósceles");
	          }else
	              System.out.println("Triângulo Escaleno");
	         }

	      }
	  