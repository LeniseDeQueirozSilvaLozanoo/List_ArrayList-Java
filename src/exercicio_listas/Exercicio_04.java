package exercicio_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		
//		Escreva um programa que cadastre em uma lista numérica de valores inteiros 10  números  inteiros  aleatórios  entre  10  e  100. 
//		Ao  final,  o   programa  deverá  detectar  na  lista  qual o maior número inteiro sorteado e mostra-lo ao usuário.  


		Scanner sc = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<>();
		
		int maior = 0, i = 0, num = 0;
		
		for(i=0; i<10; i++) {
			System.out.println("#" + (i+1) + "º número:");
			num = sc.nextInt();
			if (num < 10) {
				System.out.println("***O NÚMERO DEVE SER MAIOR OU IGUAL A 10***\n");
				i--;
			} else if(num > 100) {
				System.out.println("***O NÚMERO DEVE SER MENOR OU IGUAL A 100***\n");
				i--;
			} else {
			numeros.add(num);
			}
		}
		
		for(i=0; i<numeros.size(); i++) {
			System.out.print(numeros.get(i) + " ");
			if(numeros.get(i) > maior) {
				maior = numeros.get(i);
				}	
		}
		
		System.out.println("\nO maior número é: " + maior);
		sc.close();
		
		
		
	}

}
