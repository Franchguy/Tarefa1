import java.util.Scanner;

public class atividade6 {
        public static void main(String[] args) {
    	    Scanner scanner = new Scanner(System.in);
    	
    	    System.out.println("Digite um número: ");
    	    int numero = scanner.nextInt();
    	
    	    long fatorial = 1;
    	
    	    for(int i = 1; i <= numero; i++) {
    		    fatorial *= i;
    		    System.out.println(i);
    	    }
    	    System.out.println("O fatorial de " + numero + " é: " + fatorial);
    	    scanner.close();
    }
}
