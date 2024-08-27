import java.util.Scanner;

public class atividade9 {
        public static void main(String[] args) {
    	    Scanner scanner = new Scanner(System.in);
    	
    	    System.out.println("Digite um número: ");
    	    int numero = scanner.nextInt();
    	
    	    if(numero % 2 == 0) {
    		    System.out.println("Esse número não é primo!");
    		    }
    	    else if(numero < 0) {
    		    System.out.println("Esse número não pode ser considerado primo, pois ele é menor que 0!");
    		    }
    	    else {
    		    System.out.println("Esse número é primo!");
    	}
    }
}

