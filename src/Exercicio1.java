import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		/* 1.Faça um programa que permita ao usuário digitar 30 atividades que ele realizou no dia. Ao final, o programa deve possibilitar que o usuário escolha se quer exibir as atividades na ordem em que digitou ou em ordem reversa. */

		
		String atividades[] = new String[10];
		int opt;
		Scanner leitor = new Scanner(System.in);
		
		for(int i=0; i<atividades.length; i++) {
			System.out.print("Atividade " + (i+1) + ": ");
			atividades[i] = leitor.nextLine();
		}
		
		System.out.println("Como deseja imprimir os resultados?");
		System.out.println("   1 - Ordem normal");
		System.out.println("   2 - Order inversa");
		System.out.print("Opção: ");
		opt = leitor.nextInt();
	
		if(opt == 1) {
			for(int i=0; i<atividades.length; i++) {
				System.out.println("Atividade " + (i+1) + ": " + atividades[i]);
			}
		}
		
		else {
			for(int i=atividades.length-1; i>=0; i--) {
				System.out.println("Atividade " + (i+1) + ": " + atividades[i]);
			}	
		}

		
		leitor.close();	

	}

}
