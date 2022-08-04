package br.senai.sp.jandira;

import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
		
		double juros, capital, taxa, tempo;
		// Pode declarar tudo na mesma linha, se for tudo a mesma variavel
		Scanner leitor;
		
		leitor = new Scanner(System.in); // Scannei todo dispositivo de entrada.
	
		System.out.print("Qual é o capital? "); //mostrar mensagem na tela pro usuario  
		capital = leitor.nextDouble(); // vai usar o leitor e esperar o usuario da enter, si nao da erro
	
		System.out.print("Qual é a taxa de juros? ");
		taxa = leitor.nextDouble();
	
		System.out.print("Qual o tempo? ");
		tempo = leitor.nextDouble();
		
		juros = capital * taxa / 100 * tempo;  // Juros = Capital.taxa.tempo
		
		System.out.print("O valor do juros: " + juros); // ou prinf("O valor do juros é %s", juros);
		System.out.println();
		System.out.print("Ao final do período você terá: "+( juros + capital));  // " ou printf(Ao final do período você terá R$%s", juros + capital)
		
	}

}
