import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Digite um número: ");
    	int numero1 = scanner.nextInt();
    	
    	System.out.println("Digite outro número: ");
    	int numero2 = scanner.nextInt();
    	
    	int fatorial = 1;
    	
    	for(;numero1 <= numero2; numero1++){
    		fatorial *= numero1;
    	}
    	System.out.println("O fatorial é: " + fatorial);
    	scanner.close();
    }
}
