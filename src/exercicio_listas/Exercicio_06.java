package exercicio_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		
//		Escreva  um  programa  que  permita  ao  usuário  cadastrar,  no máximo,  6  números  inteiros  DIFERENTES  em  uma  lista  
//		(cada  número  em  uma  posição).  O programa não poderá permitir que números já cadastrados sejam inseridos na lista.  

		Scanner sc = new Scanner(System.in);
		
		List<Integer>numeros = new ArrayList<>();
		int i = 0, numDig = 0;
		
		for (i = 0; i<6; i++) {
			System.out.println("Digite o " + (i + 1) + "º número: ");
			numDig = sc.nextInt();
			
			if(!numeros.contains(numDig)) {
				numeros.add(numDig);
			} else {
				System.out.println("O numero " + (numDig) + " já exite na lista");
				i--;
				}
		}
		
		for(Integer x : numeros) {
			System.out.print(x + " ");
		}
		
		sc.close();
		
	}

}
