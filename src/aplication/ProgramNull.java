package aplication;

import java.util.Scanner;

import entities.CalcNull;

public class ProgramNull {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		float n = sc.nextFloat();
		
		if(CalcNull.isZero(n)) {
			System.out.println("Nulo");
		}else {
			System.out.println("Nao nulo");
		}
		sc.close();
	}

}
