import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		/* 2.O professor Wuni Jim Yensonal precisa de um programa para ajudar  com  um  problema  simples:  para  uma  turma  com  50  alunos precisa calcular a média da sala e descobrir quais são os alunos que precisarão  de  um  atendimento personalizado.  O  fluxo  do  programa deve ser o seguinte: 
		 * A.Digitar as 50 notasem um vetor e, para cada nota digitada, digitar o nome do aluno correspondente em outro vetor
		 * B.Calcular a média das notas digitadas
		 * C.Para cada uma das notas que foi digitada e ficou abaixo da média, exibir uma mensagem que diga “Chamar o aluno para conversar”
		 */
		
		int qtdNotas = 4;
		double notas[] = new double[qtdNotas];
		String nomes[] = new String[qtdNotas];
		double soma = 0, media;
		Scanner leitor = new Scanner(System.in);
		
		for(int i=0; i<qtdNotas; i++) {
			System.out.print("Nota " + (i+1) + ": ");
			notas[i] = leitor.nextDouble();
			System.out.print("Aluno " + (i+1) + ": ");
			nomes[i] = leitor.nextLine();
			soma += notas[i];
		}
		
		media = soma / qtdNotas;
		
		System.out.println("\nA media da sala é: " + media);
		System.out.println("Chamar os seguintes alunos para conversar:");
		
		for(int i=0; i<qtdNotas; i++) {
			if(notas[i] < media)
				System.out.println(" - " + nomes[i]);
		}
		
		
		leitor.close();	

	}

}
