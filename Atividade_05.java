package Somativa_29_05;

import java.util.Scanner;

public class Atividade_05 {// nome da clsse 

	public static void main(String[] args) { // executar uma classe

		Scanner ler = new Scanner (System.in); // armazena o valor na variavel
		

		String a[] = new String [6];
		
		for (int i=0; i<6; i++) { 
			System.out.println("informe seu carro " + i  );
			a[i] = ler.next();
		}
		for (int i=0; i<6; i++) { 
			System.out.println(" Os carros na garagem são  | " + a[i] + " | ");
		}
	}
}

