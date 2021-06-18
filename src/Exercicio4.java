import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		/* 4.Considere  a  cria��o  de  um  vetor  de  50  posi��es  chamado vetCarrinhoValores que servir�   para armazenar   os valores de produtos  comprados  por  um  cliente,  e  outro  vetor  de  50  posi��es chamado  vetCarrinhoNomes  que  servir�  para  armazenar  os  nomes de produtos comprados por um cliente.Crie uma estrutura de menus para que o programa tenha as seguintes funcionalidades:
		 * �Digitar  onome  de  um  produto  e  seu  pre�o.  (Quando  n�o  for mais poss�vel inserir itens, deve ser exibida a mensagem: �Carrinho cheio�)
           �Remover um produto atrav�s de seu nome. (O nome do produto deve ser substitu�do por ��e o pre�o por 00. A posi��o n�o poder� ser reutilizada para armazenar novos valores)
           �Calcular o valor total da compra�Exibir a quantidade de produtos comprados
           �Exibir o nome do produto de maior valor(Em caso de produtos de igual valor, escolher uma das ocorr�ncias)
           �Exibir o nome de cada produto ao lado de seu pre�o */
		
		
		int vsize = 4;
		double vetCarrinhoValores[] = new double[vsize];
		String vetCarrinhoNomes[] = new String[vsize];
		int index = 0, total = 0, contadorComprados = 0,indexMaior = 0, opt = 99;
		double maiorValor;
		boolean cheio = false;
		Scanner leitor = new Scanner(System.in);
		
		while(opt!=0) {
			if(!cheio)
				System.out.println("\n\n1 - Adicionar produto");
			else
				System.out.println("X - CARRINHO CHEIO!");
			System.out.println("2 - Remover produto");
			System.out.println("3 - Exibir o nome do produto de maior valor");
			System.out.println("4 - Exibir todos produtos");
			System.out.println("0 - Sair");
			System.out.println("Valor total: " + total + " Quantidade atual: " + contadorComprados);
			
			System.out.print("Op��o: ");
			opt = leitor.nextInt();
			leitor.nextLine();
			
			switch(opt) {
				case 1:
					if(index < vsize) {
						System.out.print("Nome do produto: ");
						vetCarrinhoNomes[index] = leitor.next();
						System.out.print("Valor: ");
						vetCarrinhoValores[index] = leitor.nextDouble();
						leitor.nextLine();
						total+= vetCarrinhoValores[index];
						contadorComprados++;
						index++;
					}
					else {
						cheio = true;
					}
					break;
				case 2:
					System.out.print("Nome do produto a ser removido: ");
					String nome = leitor.next();
					for (int i=0; i<index; i++) {
						if(vetCarrinhoNomes[i].equalsIgnoreCase(nome)) {
							vetCarrinhoNomes[i] = "";
							total-= vetCarrinhoValores[i];
							vetCarrinhoValores[i] = 0.00;
							contadorComprados--;
						}
					}
					break;
				case 3:
					maiorValor = 0;
					for (int i=0; i<index; i++) {
						if(vetCarrinhoValores[i] > maiorValor) {
							maiorValor = vetCarrinhoValores[i];
							indexMaior = i;
						}
					}
					System.out.println("Item de maior valor �:");
					System.out.println("Produto: " + vetCarrinhoNomes[indexMaior] + ", valor: R$ " + vetCarrinhoValores[indexMaior]);
					break;
				case 4:
					System.out.println("--- Produtos ---");
					for (int i=0; i<index; i++) {
						if(!vetCarrinhoNomes[i].equalsIgnoreCase(""))
							System.out.println("Produto: " + vetCarrinhoNomes[i] + ", valor: R$ " + vetCarrinhoValores[i]);	
					}
					break;
				default:
					System.out.println("Escolha uma op��o v�lida!");
					break;
			}
		}
		
		
		
		leitor.close();	

	}

}
