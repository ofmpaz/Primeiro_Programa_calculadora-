package priemeiroProjeto;

import java.util.Scanner;

public class MyJava {

	public static void main(String[] args) {
		//receive two numbers and make the sum 

		Scanner input = new Scanner (System.in);
		double n1, n2, res; 

		//ask the user two numbers 
		System.out.println("Infome dois valores que serão somados:");

		// receive two numbers 
		n1 = input.nextDouble(); 
		n2 = input.nextDouble(); 

		//calculating the numbers
		res = n1 + n2;

		//showing the result to the  user 
		System.out.println("O resultado da sua operaçãp é: " + res);


	}

}
