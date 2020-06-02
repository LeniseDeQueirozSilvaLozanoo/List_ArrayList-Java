package exercicio_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		
//		Escreva um programa que cadastre em uma lista num�rica de valores inteiros 10  n�meros  inteiros  aleat�rios  entre  10  e  100. 
//		Ao  final,  o   programa  dever�  detectar  na  lista  qual o maior n�mero inteiro sorteado e mostra-lo ao usu�rio.  


		Scanner sc = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<>();
		
		int maior = 0, i = 0, num = 0;
		
		for(i=0; i<10; i++) {
			System.out.println("#" + (i+1) + "� n�mero:");
			num = sc.nextInt();
			if (num < 10) {
				System.out.println("***O N�MERO DEVE SER MAIOR OU IGUAL A 10***\n");
				i--;
			} else if(num > 100) {
				System.out.println("***O N�MERO DEVE SER MENOR OU IGUAL A 100***\n");
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
		
		System.out.println("\nO maior n�mero �: " + maior);
		sc.close();
		
		
		
	}

}
