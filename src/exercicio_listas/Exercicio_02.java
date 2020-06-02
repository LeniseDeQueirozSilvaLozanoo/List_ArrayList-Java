package exercicio_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
//		Escreva  um  programa  que  receba  cinco  nomes  diferentes  do  usuário. 
//		Todos  os  nomes  deverão  ser  armazenados  em  um  ArrayList   tipado  para  Strings.  
//		O  programa deverá  mostrar  os  nomes  cadastrados  em  ordem  inversa  a  qual  foram  cadastrados,  ou  seja,  
//		do último para o primeiro.  
		
		Scanner sc = new Scanner(System.in);
		List<String> nomes = new ArrayList<>();
		
		
		for(int i = 0; i<5; i++) {
		System.out.println("Digite o " + (i+1) + "º nome:");
		String nome = sc.next();
		nomes.add(nome);
		}
		
		System.out.println("\nNomes em ordem inversa:\n");
		
		for(int i = nomes.size()-1; i>=0; i--) {
			System.out.print(nomes.get(i) + " ");
		}

		sc.close();
	}

}
