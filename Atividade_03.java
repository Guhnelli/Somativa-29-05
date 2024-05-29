package Somativa_29_05;

import java.util.Scanner;

public class Atividade_03 {  // nome da clsse 

	public static void main(String[] args) { // executar uma classe
		
		Scanner ler = new Scanner (System.in); // armazena o valor na variavel
		String dias;  // declaração das variaveis
		
		System.out.print("informe o dia :"); //serve para escrever o valor na tela do usuario
		dias = ler.next(); // variavel declarada e  para ler um texto
		
		if (dias.equals("1")) { // comando de condição onde compara o dia igual a 1
			System.out.println("1 é domingo");
		}
		else if (dias.equals("2")) { // comando de condição onde compara o dia igual a 2
			System.out.println("2 é segunda"); // escrever o valor na tela do usuario
		}
		else if (dias.equals("3")) { // comando de condição onde compara o dia igual a 3
			System.out.println("3 é terça");  // escrever o valor na tela do usuario
		}
		else if (dias.equals("4")) { // comando de condição onde compara o dia igual a 4
			System.out.println("4 é quarta ");	// escrever o valor na tela do usuario
		}
		else if (dias.equals("5")) { // comando de condição onde compara o dia igual a 5
			System.out.println("5 é quita");  // escrever o valor na tela do usuario
		}
		else if (dias.equals("6")) { // comando de condição onde compara o dia igual a 6
			System.out.println("6 é sexta");	// escrever o valor na tela do usuario
		}
		else if (dias.equals("7")) { // comando de condição onde compara o dia igual a 7
			System.out.println("7 é sabado");	// escrever o valor na tela do usuario
		}
		else {  // comando de condição alternativo 
			System.out.println("dia invalido"); // escrever o valor na tela do usuario
		}
		ler.close(); //está encerrando a instância do Scanner
		
		

	}

	}


