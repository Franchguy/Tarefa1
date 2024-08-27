import javax.swing.JOptionPane;

public class atividade2 {
    public static void main(String[] args){
        String salário_mínimoStr = JOptionPane.showInputDialog(null, "Digite o salário mínimo: ");
        // CONVERTER PARA DOUBLE
        double salário_mínimo = Double.parseDouble(salário_mínimoStr);
        String quilowatts_condumidaStr = JOptionPane.showInputDialog(null, "Digite a quantidade de quilowatt consumida: ");
        // CONVERTER PARA DOUBLE
        double quilowatts_consumida = Double.parseDouble(quilowatts_condumidaStr);

        double valor = salário_mínimo * 0.01;
        double valor_a_pagar = valor * quilowatts_consumida;

        JOptionPane.showMessageDialog(null, "O valor a pagar da conta de luz é: " + valor_a_pagar);

    }
}
