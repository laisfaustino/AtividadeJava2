package atividade2;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int a,b,operacao;
		
		
		
		System.out.println("Calculadora");
        System.out.println("1\tOperação de Soma + ");
        System.out.println("2\tOperação de Subtração - ");
        System.out.println("3\tOperação de Multiplicação * ");
        System.out.println("4\tOperação de Divisão / ");
                
        System.out.println("Digite o primeiro numero :");
        a = leia.nextInt();
        
        System.out.println("Digite o segundo numero:");
        b = leia.nextInt();
        
        System.out.println("Digite o numero da operação desejada:");
       operacao = leia.nextInt();
              
        
        switch(operacao) {
        case 1:
        	System.out.println("A soma é:" + (a+b));
        	break;
        case 2:
        	System.out.println("O valor Total é:" + (a-b));
        	break;
        case 3:
        	System.out.println("O valor Total é:" + (a*b));
        	break;
        case 4:
        	System.out.println("O valor Total é:" + (a/b));;
        	break;
        default:
        	System.out.println("Opção inválida");
		
	}
		
		
	}

}
