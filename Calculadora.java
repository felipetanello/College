package br.com.unicuritiba;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a operação que deseja");
		
		System.out.println("1- Soma");
		System.out.println("2- Subtração");
		System.out.println("3- Multiplicação");
		System.out.println("4- Divisão");
		int opcao = scan.nextInt();
		while(true) {
		if(opcao > 4 || opcao < 1) {
			System.out.println("Operação inválida, insira novamente: ");
			scan.nextInt();
		}else {
			break;
			}
		}
		
		System.out.println("Digite o primeiro operador: ");
		int op1 = scan.nextInt();
		System.out.println("Digite o segundo operador: ");
		int op2 = scan.nextInt();
		
		
		
		
		int resultado = 0;
		switch(opcao) {
			case 1:
				resultado = soma(op1, op2);
				verificarResultado(resultado);
				break;
			case 2: 
				resultado = subtracao(op1, op2);
				verificarResultado(resultado);
				break;
			case 3:
				resultado = multiplicacao(op1, op2);
				verificarResultado(resultado);
				break;
			case 4:	
				resultado = divisao(op1, op2);
				verificarResultado(resultado);
				break;
				
				
		}
		}
		
			
			
		
	private static int soma(int op1, int op2) {
		int resultado = op1 + op2;
		return resultado;
	}	
	private static int subtracao(int op1, int op2){
		int resultado = Math.abs(op1 - op2);
		return resultado;
	}
	private static int multiplicacao(int op1, int op2){
		int resultado = op1 * op2;
		return resultado;
	}
	private static int divisao(int op1, int op2){
		int resultado = op1/op2;
		return resultado;
	}
	private static void verificarResultado(int resultado) {
		if (resultado < 300) {
			System.out.println("O resultado é " + resultado);
			
		}else {
			System.out.println("O resultado ");
		}
			
	}
}