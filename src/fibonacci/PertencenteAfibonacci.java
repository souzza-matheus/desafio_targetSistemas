package fibonacci;

import java.util.ArrayList;
import java.util.List;
import 	java.util.Scanner;


public class PertencenteAfibonacci {
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		CalculadoraDeFibonacci calculadora = new CalculadoraDeFibonacci();
	
		
		List<Integer>sequenciaDeFibonacci = new ArrayList<>();
		for(int i = 0; i<30;i++) {
			sequenciaDeFibonacci.add(calculadora.calcular(i));
		}
		
		System.out.println("Digite um número para verificar se existe na sequencia de fibonacci:");
		int numeroASerVerificado = scanner.nextInt();	
		scanner.close();
		
		if(sequenciaDeFibonacci.contains(numeroASerVerificado)) {
			System.out.println("O número pertence a sequencia");
		}else {
			System.out.println("O número não pertence a sequencia");
		}
	}

}
