import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {
		
		/* 3.Fa�a um algoritmo que gere aleatoriamente atrav�s de um la�o de  repeti��o  PARA  um  vetor  de  50  elementos  inteiros  (entre  0 -9), calcule e exiba:
		 * �A quantidade de n�meros entre 3 e 7;
		 * �Quantidade de n�meros pares;
		 * �A quantidade de n�meros menores que 3;
		 * �Quantidade de n�meros �mpares.
		 * 
		 * Obs.: O  vetor  com  os  50  elementos  deve  ser  impresso  na  tela tamb�m. 
		 */
		
		
		int numeros[] = new int[10];
		int total3ou7 = 0, totalpares = 0, totalmenor3 = 0, totalimpares = 0;
		Random rnd = new Random();
			
		for(int i=0; i<numeros.length; i++) {
			numeros[i] = rnd.nextInt(10);
			if(numeros[i] % 2 == 0)
				totalpares++;
			else
				totalimpares++;
			if(numeros[i] == 3 || numeros[i] == 7)
				total3ou7++;
			if(numeros[i] < 3)
				totalmenor3++;
		}
		
		System.out.println("O n�mero de valores 3 ou 7: " + total3ou7);
		System.out.println("O n�mero de valores pares: " + totalpares);
		System.out.println("O n�mero de valores menores que 3: " + totalmenor3);
		System.out.println("O n�mero de valores impares: " + totalimpares);
		
		System.out.println("Vetor gerado:");
		for(int i=0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		

	}

}
