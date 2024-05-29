package Somativa_29_05;

import java.util.Scanner;

public class Atividade_04 { // nome da clsse 

	public static void main(String[] args) { // executar uma classe
		
		Scanner ler = new Scanner (System.in); // armazena o valor na variavel
		
		int soma=0; // declaração das variaveis
		int a[] = new int [15]; // declaração das variaveis e dos vetores
		
		for (int i=0; i<15; i++) { // estrutura de repetição onde i e = a 0 que i e maior ou igua a 15, e index
			System.out.println("informe um numero " + i + " - "); // escrever o valor na tela do usuario mais o I
			a[i] = ler.nextInt(); // vetor [i]
			
			soma = soma+a[i]; // variavel soma somando os vetores
		}
			System.out.println(" A soma total é " + soma); // escrever o valor na tela do usuario mais a soma
			
			
			
		}
	}


