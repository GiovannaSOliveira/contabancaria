package conta;

import conta.controller.ContaController;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaController contas = new ContaController();
	
		int opc, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;
		
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
				System.out.println("\nDigite o número da agência: ");
				agencia = leia.nextInt();
				System.out.println("\nDigite o nome do titular:");
				leia.skip("\\R?");
				titular = leia.nextLine();
				
					do {
						System.out.println("\nDigite o número da conta");
						System.out.println("\n1 - Conta Corrente");
						System.out.println("\n2 - Conta Poupança");
						tipo=leia.nextInt();
					}
					while (tipo > 1 && tipo > 2);
				
				System.out.println("\nDigite o saldo da conta em reais:");
				saldo = leia.nextFloat();
				
				
					switch(tipo) {
					case 1 -> {
						System.out.println("Digite o limite de crédito em reais:");
						limite=leia.nextFloat(); 
						contas.cadastrar(new ContaCorrente(contas.gerarNumero(),agencia, tipo, titular, saldo, limite));
						}
					case 2 -> {
						System.out.println("\nDigite o aniversário da conta:");
						aniversario = leia.nextInt();
						contas.cadastrar(new ContaPoupanca(contas.gerarNumero(),agencia, tipo, titular, saldo, aniversario));
					}
					
				}
				
				keyPress();
				break;
			
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Listar contas\n\n");
				contas.listarTodas();
				keyPress();
				break;
			
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Consulta de dados da conta - por número\n\n");
				System.out.println("\nDigite o número da conta:");
				numero = leia.nextInt();
				contas.procurarPorNumero(numero);
				
				keyPress();
				break;
				
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Atualizar dados da conta\n\n");
				System.out.println("\nDigite o número da conta:");
				numero = leia.nextInt();
				var buscaConta = contas.buscarNaCollection(numero);
				
				if (buscaConta != null) {
					tipo = buscaConta.getTipo();
					
					System.out.println("\nDigite o número da agência: ");
					agencia = leia.nextInt();
					System.out.println("\nDigite o nome do titular: ");
					leia.skip("\\R?");
					titular = leia.nextLine();
					
					System.out.println("\nDigite o saldo da conta em reais:");
					saldo = leia.nextFloat();
					
						switch(tipo) {
						case 1 -> {
							System.out.println("\nDigite o limite de crédito em reais:");
							limite = leia.nextFloat(); 
							contas.atualizar(new ContaCorrente(numero,agencia, tipo, titular, saldo, limite));
							}
						case 2 -> {
							System.out.println("\nDigite o aniversário da conta:");
							aniversario = leia.nextInt();
							contas.atualizar(new ContaPoupanca(numero,agencia, tipo, titular, saldo, aniversario));
							}
						default -> {
							System.out.println("\nTipo de conta inválido!");
							}
						
						}
				}
				else {
					System.out.println("\nA conta não foi encontrada!");
				}
				
				keyPress();
				break;
				
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Apagar conta\n\n");
				
				System.out.println("\nDigite o número da conta a ser deletada: ");
				numero = leia.nextInt();				
				
				contas.deletar(numero);
				
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
