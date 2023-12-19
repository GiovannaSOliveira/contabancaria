package conta;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Testes contas:
		
		ContaCorrente cc1 = new ContaCorrente (2, 123,1,"Giovanna", 15000.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		ContaPoupanca cp1 = new ContaPoupanca (3, 123, 2, "Giovanna", 10000.0f);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();

		
		int opc;
		Scanner leia = new Scanner(System.in);
		
		while (true) {
			
			System.out.println(Cores.TEXT_PURPLE_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
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
			System.out.println(Cores.TEXT_RESET);
			
			
			try {
				opc = leia.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opc = 0;
			}
			
			if (opc==9) {
				System.out.println(Cores.TEXT_PURPLE_BRIGHT + Cores.ANSI_BLACK_BACKGROUND +"\nBRAZILLIAN BANK - Invest in your future.\n");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opc) {
				
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Criar conta\n\n");
				keyPress();
				break;
			
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Listar contas\n\n");
				keyPress();
				break;
			
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Consulta de dados da conta - por número\n\n");
				keyPress();
				break;
				
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Atualizar dados da conta\n\n");
				keyPress();
				break;
				
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Apagar conta\n\n");
				keyPress();
				break;
				
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Saque\n\n");
				keyPress();
				break;
				
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Depósito\n\n");
				keyPress();
				break;
				
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Transferência\n\n");
				keyPress();
				break;
				
			default:
				System.out.println(Cores.TEXT_RED_BOLD +"\nOpção inválida!!\n");
				keyPress();
				break;
			}
		}
	}
	
	
	
	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET+ "\n\nPressione ENTER para continuar...");
			System.in.read();
		}
		catch(IOException e) {
			System.out.println("Você pressionou uma tecla diferente de ENTER.");
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
