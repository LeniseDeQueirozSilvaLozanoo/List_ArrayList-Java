package exercicio_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		
//		Escreva  um  programa  que  contenha  uma  lista  com  5  nomes  pr�-cadastrados.  O  programa  dever�  dar  ao  usu�rio  a  op��o  de  excluir  um  �nico  nome  da  lista ,  com valores entre 1 e 5, exemplo.   
//		Qual dos nomes abaixo voc� deseja excluir da lista?  
//		1. Lucas Alvarenga 
//		2. Carla Fragoso 
//		3. Jo�o Sttifert 
//		4. Yun Haito 
//		5. Felicia Brum   
//		Feita  a  escolha  do  usu�rio  pelo  n�mero correspondente  ao  nome, 
//		o  programa  dever�  mostrar  na tela os quatro nomes que restaram cadastrados na lista.


		Scanner sc = new Scanner(System.in);
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Lucas Alvarenga");
		nomes.add("Carla Fragoso");
		nomes.add("Jo�o Sttifert");
		nomes.add("Yun Haito");
		nomes.add("Felicia Brum");
	
		
		System.out.println("Digite o numero correspondente ao nome que deseja excluir:\n\n"
				+ "1. Lucas Alvarenga\n" + 
				"2. Carla Fragoso\n" + 
				"3. Jo�o Sttifert\n" + 
				"4. Yun Haito\n" + 
				"5. Felicia Brum");
		
		int num = sc.nextInt();
		
		nomes.remove(num-1);
		
		for(String x : nomes) {
			System.out.println(x);
		}
		
		
		sc.close();
		
	}

	
	
	
}
