import javax.swing.JOptionPane;

public class atividade8 {
    public static void main(String[] args) {
        String valor_compra_str = JOptionPane.showInputDialog(null, "Qual foi o valor da compra?");
        int valor_compra = Integer.parseInt(valor_compra_str);
        String dinheiro_str = JOptionPane.showInputDialog(null, "Quantos você tem?");
        int dinheiro = Integer.parseInt(dinheiro_str);

        int troco = dinheiro - valor_compra;

        if (troco < 0) {
            JOptionPane.showMessageDialog(null, "Não tem dinheiro suficiente");
        } else if (troco == 0) {
            JOptionPane.showMessageDialog(null, "Não tem troco");
        } else {
            JOptionPane.showMessageDialog(null,"Troco: R$ " + troco);
            int[] cedulas = {200, 100, 50, 20, 10, 5, 2};
            int[] quantidade_cedulas = new int[cedulas.length];
            int troco_inteiro = (int) troco;
            for (int i = 0; i < cedulas.length; i++) {
                quantidade_cedulas[i] = troco_inteiro / cedulas[i];
                troco_inteiro %= cedulas[i];
            }
    
            for (int i = 0; i < cedulas.length; i++) {
                if (quantidade_cedulas[i] > 0) {
                    JOptionPane.showMessageDialog(null, quantidade_cedulas[i] + " de R$ " + cedulas[i] + ": ");
                }
            }
        }
        
    }
}