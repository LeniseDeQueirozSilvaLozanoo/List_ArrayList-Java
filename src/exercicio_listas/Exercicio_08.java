package exercicio_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		
//		Crie  um   programa  que  seja  capaz  de  cadastrar  5  contatos.  Para tal, é necessário criar um ArrayList tipado para a
//		classe Contato, que deverá seguir a estrutura abaixo: 
//			Para este programa, os atributos da classe Contato são:  
//			⦁	Nome 
//			⦁	Telefone 
//			⦁	Celular 
//			⦁	Email  
//		Para criar uma lista com base na classe Contato, faça:  ArrayList<Contato> listaContatos = new ArrayList<Contato>();    
//		Não  se  esqueça  de  encapsular  os  campos  e  de  criar  um  novo  contato   a  cada  nova  inserção  de dados na lista. 

		Scanner sc = new Scanner(System.in);
		String nome = "", telefone = "", celular = "", email = "";
		List<Contato> listaContatos = new ArrayList<Contato>();
		int i = 0;
	
		
		for (i = 0; i<5; i++) {
			
			System.out.println("Digite o nome do " + (i+1) + "º contado");
			nome = sc.next();
			System.out.println("Digite o telefone do " + (i+1) + "º contado");
			telefone = sc.next();
			System.out.println("Digite o celular do " + (i+1) + "º contado");
			celular = sc.next();
			System.out.println("Digite o email do " + (i+1) + "º contado");
			email = sc.next();
			listaContatos.add(new Contato(nome, telefone, celular, email));
			System.out.println();
		}
		
		for(Contato x : listaContatos) {
			System.out.println(x.getNome() + ", " + x.getTelefone() + ", " + x.getCelular() + ", " + x.getEmail());
		}

		
		
		sc.close();
		

	}

}
