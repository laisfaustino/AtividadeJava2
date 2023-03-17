package atividade2;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int a,b,c;
		
		
		System.out.println("Digite o valorA:");
		a = leia.nextInt();
		System.out.println("Digite o valorB:");
		b = leia.nextInt();
		System.out.println("Digite o valorC:");
		c = leia.nextInt();
		
		
		if ((a+b) >= c ) 
			System.out.println( "A + B é maior que C!");
			
		else if ((a+b) < c)
			System.out.println("A + B é menor que C");
		else
			System.out.println("valor inválido");
		
		leia.close();
		
		
		
			
	}

}
