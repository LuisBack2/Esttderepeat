package Exer7repeat;

import java.util.Scanner;

public class Ativ {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = 0;
		int soma = 0, media = 0;
		
		for(int i = 0; i <= 19; i++) {
			System.out.print("Idade " + (i + 1) + ": ");
            int idade1 = sc.nextInt();
            soma += idade1;
            media = soma / 20;
        }
		System.out.println("A media das idades é: " + media);

        sc.close();
}
}