import javax.swing.JOptionPane;

public class atividade10{

    public static void main(String[] args){
        int contador = 0;

        for(int i = 0; i<10; i++){
            String numeroStr = JOptionPane.showInputDialog(null, "Coloque um número e eu irei mostrar se ele é primo ou não: ");
            int numero = Integer.parseInt(numeroStr);

            if(numero % 2 != 0){
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null, "Você digitou " + contador + " números primos!");
    }
}