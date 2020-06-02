package exercicio_listas;

import java.util.ArrayList;
import java.util.List;

public class Exercicio_01 {

	public static void main(String[] args) {
		

//		Escreva  um  programa  que  adote  um  ArrayList  como  estrutura padrão  de  armazenamento  de  dados. 
//		O  programa  deverá  cadastrar  (sem  interação  do  usuário), 10  valores  de  qualquer  tipo  dentro  da  lista 
//		(String,  int,  char,  double,  etc).  Ao  final,  o  programa deverá mostrar os valores cadastrados.
		
		List<Object> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("João");
		list.add(true);
		list.add(false);
		list.add('f');
		list.add('s');
		list.add(100000L);
		list.add(10);
		list.add(2.65);
		list.add(2.8f);
		
		
		for(Object x : list) {
		System.out.println(x);
		}

	}

}
