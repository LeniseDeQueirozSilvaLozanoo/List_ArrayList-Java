package exercicio_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		
//		10) [MENU DE OPÇÕES PARA FRASES] 
//				Escreva um programa que ofereça o seguinte menu ao usuário:  
//				MENU DE OPÇÕES – CADASTRO DE FRASES: 
//				(Frases cadastradas até o momento: 0 )   
//				1) Cadastrar nova frase 
//				2) Excluir Frase Cadastrada 
//				3) Modificar Frase Cadastrada 
//				4) Visualizar Frase 
//				5) SAIR  
//		O programa deverá utilizar uma lista  de Strings para armazenar as  frases digitadas pelo usuário. 
//		O programa  deverá  possibilitar  ao  usuário  realizar  todas  as  tarefas  propostas  no  menu  acima, 
//		com base em seu  conteúdo da lista. A exclusão, Modificação ou  Visualização de frases deverão ocorrer com base 
//		na posição da frase na lista
		
		
		Scanner sc = new Scanner(System.in);
		List<String>frases = new ArrayList<>();

		
		System.out.println("Digite o número correspondente a opção desejada:\n\n"
				+ "MENU DE OPÇÕES – CADASTRO DE FRASES: \r\n\n" +  
				"1) Cadastrar nova frase \r\n" + 
				"2) Excluir Frase Cadastrada \r\n" + 
				"3) Modificar Frase Cadastrada \r\n" + 
				"4) Visualizar Frase \r\n" + 
				"5) SAIR  "
				+ "");

		int opcao = 0, i = 0;
				
		do { 
		System.out.println("Digite o número correspondente a opção desejada:\n\n"
				+ "MENU DE OPÇÕES – CADASTRO DE FRASES: \r\n\n" +  
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
