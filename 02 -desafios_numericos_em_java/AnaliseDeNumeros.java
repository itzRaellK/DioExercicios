package desafios_numericos_em_java;

import java.io.IOException;
import java.util.Scanner;

public class AnaliseDeNumeros {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        
        //declare suas variaveis corretamente
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        int num;
        
        //continue a solução
        for (int contador = 0; contador < 5; contador++) {
          num = leitor.nextInt();
          
          if(num % 2 == 0){
        	  pares++;
        	} else {
        	  impares++;
        	}
        	if(num > 0){
        	  positivos++;
        	} 
        	if(num < 0){
        	  negativos++;
        	}
        }
        
        //insira suas variaveis corretamente
        System.out.println( pares + " valor(es) par(es)");
        System.out.println( impares + " valor(es) impar(es)");
        System.out.println( positivos + " valor(es) positivo(s)");
        System.out.println( negativos + " valor(es) negativo(s)");
        
        leitor.close();
    }
}
