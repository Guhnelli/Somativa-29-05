package Somativa_29_05;

import java.util.Scanner;

public class Atividade_02 {  // nome da clsse 

	public static void main(String[] args) {  // executar uma classe
		Scanner ler = new Scanner (System.in); // armazena o valor na variavel

        double  Area, base, altura;  // declaração das variaveis
        
        System.out.print("informe o valor da base do triangulo:"); //serve para escrever o valor na tela do usuario
		base = ler.nextDouble();  // variavel declarada e  para ler um número
		
		System.out.print("informe o valor da altura do triangulo :"); //serve para escrever o valor na tela do usuario
	    altura = ler.nextDouble(); // variavel declarada e  para ler um número
	    
	    Area= (base*altura)/2;  //declarando a variavel multiplicando base * altura / 2
	    
	    System.out.println(" A Area desse triangulo é " + Area); //escrever o valor na tela do usuario mais a Area
		
	}

}
