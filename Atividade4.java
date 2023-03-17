package atividade2;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int produto;
		int quantidade;
		float preco;
		
		System.out.println("Produto");
        System.out.println("1\tCachorro Quente R$ 10,00");
        System.out.println("2\tX Salada R$ 15,00");
        System.out.println("3\tX Bacon R$ 18,00");
        System.out.println("4\tBauru R$ 12,00");
        System.out.println("5\tRefrigerante R$ 8,00");
        System.out.println("6\tSuco de Laranja R$ 13,00");
        
        System.out.println("Digite o numero do Produto:");
        produto = leia.nextInt();
        
        System.out.println("Digite a quantidade:");
        quantidade = leia.nextInt();
              
        
        switch(produto) {
        case 1:
        	System.out.println("O valor Total é:" + (preco =10*quantidade));
        	break;
        case 2:
        	System.out.println("O valor Total é:" + (preco =15*quantidade));
        	break;
        case 3:
        	System.out.println("O valor Total é:" + (preco =18*quantidade));
        	break;
        case 4:
        	System.out.println("O valor Total é:" + (preco =12*quantidade));;
        	break;
        case 5:
        	System.out.println("O valor Total é:" + (preco =8*quantidade));;
        	break;
        case 6:
        	System.out.println("O valor Total é:" + (preco =13*quantidade));;
        	break;
        default:
        	System.out.println("Opção inválida");
		
	}
	}
}
