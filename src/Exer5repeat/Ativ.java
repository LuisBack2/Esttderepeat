package Exer5repeat;

import java.util.Scanner;

public class Ativ {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		for(int i = 0; i <= 9; i++) {
			System.out.print("Número " + (i + 1) + ": ");
            int numero = sc.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos 10 números é: " + soma);

        sc.close();
    }
}


