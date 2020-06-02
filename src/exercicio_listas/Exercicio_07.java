package exercicio_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		
//		 Escreva  um  programa  que  pe�a  um  n�mero  ilimitado  de  tipos  de  mico (prendas) ao  usu�rio.  
//		 Ao  terminar de  digitar  os  micos  de sua  prefer�ncia,  o  usu�rio  dever� digitar "SORTEAR"  e  o  programa dever� sortear 
//		 dentre  todos  os  micos  digitados  aquele  que  o  usu�rio dever� "pagar" (ficticiamente).
		
		Scanner sc = new Scanner(System.in);
		List<String> mico = new ArrayList<>();
		Random random = new Random();
		String frase = "";

		while(!frase.equals("sortear")) {
			System.out.println("Digite o proximo mico");
			frase = sc.nextLine();
			mico.add(frase);
			mico.remove("sortear");
		}
		
		System.out.println(mico.get(random.nextInt(mico.size())).toUpperCase());
		
		sc.close();

	}

}
