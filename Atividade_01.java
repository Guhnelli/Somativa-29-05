package Somativa_29_05;  

import java.util.Scanner; 

public class Atividade_01 { // nome da clsse 

	public static void main(String[] args) { // executar uma classe
		Scanner ler = new Scanner (System.in); // armazena o valor na variavel

		double  B, A, soma, sub, multi, div; // declaração das variaveis
		
		System.out.print("informe o valor :"); //serve para escrever o valor na tela do usuario
		A = ler.nextDouble();  // variavel declarada e  para ler um número
		
		System.out.print("informe o valor :"); //serve para escrever o valor na tela do usuario
		B = ler.nextDouble();  // variavel declarada e  para ler um número
		
		soma= A+B; //declarando a variavel soma das variaveis A + B
		
		sub= A-B;  //declarando a variavel subtraindo as variaveis A - B
		
		multi= A*B; //declarando a variavel multiplicando as variaveis A * B
		
		div= A/B;  //declarando a variavel divsão das variaveis A / B
		
		System.out.println(" A soma é " + soma); //escrever o valor na tela do usuario mais a soma
		System.out.println(" A subtração é " + sub); //escrever o valor na tela do usuario mais a subtração
		System.out.println(" A multiplicação é " + multi); //escrever o valor na tela do usuario mais a multiplicação
		System.out.println(" A divisão é " + div); //escrever o valor na tela do usuario mais a divisão
		
		

	}

}
