package primeiros_passos_em_java;

import java.util.Scanner;

public class QuantidadeDeNumerosPositivos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
			int total = 0;
			int contador = 0;
			
			while(contador < 6){
			    double numero = entrada.nextDouble();
			    contador++;
			    if(numero > 0){
			        total++;
			    }
			}
		System.out.print( total + " valores positivos");
			
		entrada.close();
	}
}
