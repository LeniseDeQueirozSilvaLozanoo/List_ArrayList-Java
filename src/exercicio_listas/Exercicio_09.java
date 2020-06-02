package exercicio_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		
//		Crie um programa que dê ao usuário a opção de cadastrar itens que o mesmo almeja comprar em sua ida ao supermercado.
//		Para tal, o programa deverá possibilitar que o usuário vá digitando, infinitamente,  nomes  de  produtos  na  lista.  
//		A  cada  ENTER,  os  produtos deverão ser armazenados na primeira posição da lista. 
//		⦁	Para "SAIR", o usuário deverá digitar "FIM DA LISTA".
//		⦁	Para  EXCLUIR  ÚLTIMO  ITEM  CADASTRADO  (Primeiro  da  lista),  o  usuário  deverá  digitar "EXCLUIR"
//		⦁	Para LIMPAR A LISTA, o usuário deverá digitar "JOGAR LISTA NA LIXEIRA"
//		⦁	 Todas as outras palavras deverão ser consideradas produtos e inseridas na lista.  
//		OBS:  remover  um  único  item  da  lista  implica  na  necessidade  de  se  saber  se  existem  itens  para serem  removidos. 
//		Caso  a  lista  esteja  vazia, o   usuário  deverá  receber  uma  mensagem que  indique ser impossível apagar um item, 
//		se a lista não contém itens!   
		
		Scanner sc = new Scanner(System.in);
		
		List<String> supermercado = new ArrayList<>();
		String item = "";
		
		while(!item.equals("fim da lista") & !item.equals("excluir") & !item.equals("jogar lista na lixeira") ) {
			System.out.println("Digite um item na lista: ");
			item = sc.nextLine();
			supermercado.add(item);
		}
		
		
		for(int i = 0; i<supermercado.size(); i++ ) {
			
			if(supermercado.get(i).equals("fim da lista")) {
				verificaLista(supermercado);
				supermercado.remove("fim da lista");
				imprimeLista(supermercado);
			} 
			else if (supermercado.get(i).equals("excluir")) {
				verificaLista(supermercado);
				supermercado.remove(0);
				supermercado.remove("excluir");
				imprimeLista(supermercado);
			} 
			else if (supermercado.get(i).equals("jogar lista na lixeira")) {
					verificaLista(supermercado);	
					supermercado.clear();
					imprimeLista(supermercado);
			}
		}
		
		sc.close();
}

	public static void verificaLista(List lista) {
	
		if(lista.size() == 0) {
			System.out.println("Não há itens na lista");
		}
	}
	
	public static void imprimeLista(List lista ) {
		
		verificaLista(lista);
		for(int i = 0; i<lista.size(); i++ ) {
			System.out.println(lista.get(i));

		}
	}
}
