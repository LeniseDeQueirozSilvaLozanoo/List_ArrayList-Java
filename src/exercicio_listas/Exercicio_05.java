package exercicio_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
			
//		Escreva  um  programa que  receba  cinco  frases  do  usu�rio  e  as  armazene em uma  lista.  
//		Ao  final,  o  programa  dever�  mostrar   em  mai�sculas  uma  nova  frase  formada  do  in�cio das cinco frases digitadas, 
//		exemplo:  
//			- Prefiro morrer do que perder a vida 
//			- Quem diz o que quer ouve o que n�o quer 
//			- Tente outra vez 
//			- Atirar a primeira pedra demanda a n�o exist�ncia de um teto de vidro 
//			- Fora corruptos! N�o podemos mais suportar tanta farra com o dinheiro p�blico. 
//		Frase gerada: PREFIRO QUEM TENTE ATIRAR FORA.   

		Scanner sc = new Scanner(System.in);
		List<String> frases = new ArrayList<>();
		int i = 0;
		
		for(i = 0; i<5; i++) {
			System.out.println("#" + (i+1) + " frase:");
			frases.add(sc.nextLine());
		}
		
		for(i = 0; i<frases.size(); i++) {
			String[] palavras = frases.get(i).split(" ");
			System.out.print(palavras[0].toUpperCase() + " ");
		}
		
		
		
		
		sc.close();
		
	}

}
