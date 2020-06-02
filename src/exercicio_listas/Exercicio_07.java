package exercicio_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		
//		 Escreva  um  programa  que  peça  um  número  ilimitado  de  tipos  de  mico (prendas) ao  usuário.  
//		 Ao  terminar de  digitar  os  micos  de sua  preferência,  o  usuário  deverá digitar "SORTEAR"  e  o  programa deverá sortear 
//		 dentre  todos  os  micos  digitados  aquele  que  o  usuário deverá "pagar" (ficticiamente).
		
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
