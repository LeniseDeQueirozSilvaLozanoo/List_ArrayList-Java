package exercicio_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		
//		10) [MENU DE OP��ES PARA FRASES] 
//				Escreva um programa que ofere�a o seguinte menu ao usu�rio:  
//				MENU DE OP��ES � CADASTRO DE FRASES: 
//				(Frases cadastradas at� o momento: 0 )   
//				1) Cadastrar nova frase 
//				2) Excluir Frase Cadastrada 
//				3) Modificar Frase Cadastrada 
//				4) Visualizar Frase 
//				5) SAIR  
//		O programa dever� utilizar uma lista  de Strings para armazenar as  frases digitadas pelo usu�rio. 
//		O programa  dever�  possibilitar  ao  usu�rio  realizar  todas  as  tarefas  propostas  no  menu  acima, 
//		com base em seu  conte�do da lista. A exclus�o, Modifica��o ou  Visualiza��o de frases dever�o ocorrer com base 
//		na posi��o da frase na lista
		
		
		Scanner sc = new Scanner(System.in);
		List<String>frases = new ArrayList<>();

		
		System.out.println("Digite o n�mero correspondente a op��o desejada:\n\n"
				+ "MENU DE OP��ES � CADASTRO DE FRASES: \r\n\n" +  
				"1) Cadastrar nova frase \r\n" + 
				"2) Excluir Frase Cadastrada \r\n" + 
				"3) Modificar Frase Cadastrada \r\n" + 
				"4) Visualizar Frase \r\n" + 
				"5) SAIR  "
				+ "");

		int opcao = 0, i = 0;
				
		do { 
		System.out.println("Digite o n�mero correspondente a op��o desejada:\n\n"
				+ "MENU DE OP��ES � CADASTRO DE FRASES: \r\n\n" +  
				"1) Cadastrar nova frase \r\n" + 
				"2) Excluir Frase Cadastrada \r\n" + 
				"3) Modificar Frase Cadastrada \r\n" + 
				"4) Visualizar Frase \r\n" + 
				"5) SAIR  "
				+ "");
		opcao = sc.nextInt();
		
		
		}while (opcao != 5);
		
		
		if (opcao == 1) {
			System.out.println("Digite a frase");
			frases.add(sc.next());	
		}else if (opcao == 2) {
			frases.remove(frases.size()-1);
		}else if (opcao == 3) {
			frases.get(frases.size()-1);
		}else if (opcao == 4 ) {
			for(String x : frases) {
				System.out.println(x);
			}
		}
	
		
		
		
	sc.close();
	
		
	}

}
