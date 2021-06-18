import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		/* 4.Considere  a  criação  de  um  vetor  de  50  posições  chamado vetCarrinhoValores que servirá   para armazenar   os valores de produtos  comprados  por  um  cliente,  e  outro  vetor  de  50  posições chamado  vetCarrinhoNomes  que  servirá  para  armazenar  os  nomes de produtos comprados por um cliente.Crie uma estrutura de menus para que o programa tenha as seguintes funcionalidades:
		 * •Digitar  onome  de  um  produto  e  seu  preço.  (Quando  não  for mais possível inserir itens, deve ser exibida a mensagem: “Carrinho cheio”)
           •Remover um produto através de seu nome. (O nome do produto deve ser substituído por “”e o preço por 00. A posição não poderá ser reutilizada para armazenar novos valores)
           •Calcular o valor total da compra•Exibir a quantidade de produtos comprados
           •Exibir o nome do produto de maior valor(Em caso de produtos de igual valor, escolher uma das ocorrências)
           •Exibir o nome de cada produto ao lado de seu preço */
		
		
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
			
			System.out.print("Opção: ");
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
					System.out.println("Item de maior valor é:");
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
					System.out.println("Escolha uma opção válida!");
					break;
			}
		}
		
		
		
		leitor.close();	

	}

}
