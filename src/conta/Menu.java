package conta;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opc;
		Scanner leia = new Scanner(System.in);
		
		while (true) {
			System.out.println("*******************************************");
			System.out.println("\n\t     BRAZILLIAN BANK");
			System.out.println("\n*******************************************");
			System.out.println("\n\t1 - Criar uma conta");
			System.out.println("\t2 - Listar contas");
			System.out.println("\t3 - Buscar conta por número");
			System.out.println("\t4 - Atualizar dados da conta");
			System.out.println("\t5 - Apagar conta");
			System.out.println("\t6 - Sacar valor");
			System.out.println("\t7 - Depositar valor");
			System.out.println("\t8 - Transferir valores");
			System.out.println("\t9 - Sair");
			System.out.println("\n*******************************************");
			System.out.println("\nDigite a operação desejada");
			
			opc=leia.nextInt();
			
			if (opc==9) {
				System.out.println("\nBRAZILLIAN BANK - Invest in your future.\n");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opc) {
				
			case 1:
				System.out.println("Criar conta\n\n");
				break;
			
			case 2:
				System.out.println("Listar contas\n\n");
				break;
			
			case 3:
				System.out.println("Consulta de dados da conta - por número\n\n");
				break;
				
			case 4:
				System.out.println("Atualizar dados da conta\n\n");
				break;
				
			case 5:
				System.out.println("Apagar conta\n\n");
				break;
				
			case 6:
				System.out.println("Saque\n\n");
				break;
				
			case 7:
				System.out.println("Depósito\n\n");
				break;
				
			case 8:
				System.out.println("Transferência\n\n");
				break;
				
			default:
				System.out.println("\nOpção inválida!!\n");
				break;
			}
		}
	}
	
	public static void sobre() {
		System.out.println("*******************************************");
		System.out.println("\nProjeto desenvolvido por: ");
		System.out.println("Giovanna Oliveira - giovannasoliveira58@gmail.com");
		System.out.println("https://github.com/GiovannaSOliveira\n");
		System.out.println("*******************************************");
	}

}
