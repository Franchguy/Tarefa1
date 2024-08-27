import javax.swing.JOptionPane;

public class atividade4 {
    public static void main(String[] args){
        // CÓDIGO DO PRODUTO COMPRADO
        String codigoStr = JOptionPane.showInputDialog(null, "Digite o código do produto");
        int codigo = Integer.parseInt(codigoStr);
        // QUANTIDADE COMPRADA DO PRODUTO
        String quantidadeStr = JOptionPane.showInputDialog(null, "Digite a quantidade recebida do produto");
        int quantidade = Integer.parseInt(quantidadeStr);

        // O VALOR DO DESCONTO, SEGUINDO A TABELA II E APLICANDO SOBRE O PREÇO TOTAL DA NOTA
        // O PREÇO FINAL DA NOTA DEPOIS DO DESCONTO
        float preco = 0;

        if(codigo <= 10){
            preco = 10;
        }

        else if(codigo >= 11 && codigo <= 20){
            preco = 15;
        }

        else if(codigo >= 21 && codigo <= 30){
            preco = 20;
        }

        else{
            preco = 40;
        }

        if((preco * quantidade) <= 250){
            JOptionPane.showMessageDialog(null, "O desconto aplicado será de 5%");
            double total = preco * quantidade;
            double total_desconto = total * 0.05;
            JOptionPane.showMessageDialog(null, "O valor de " + total + " foi para " + (total - total_desconto) + ".");
        }

        else if((preco * quantidade) >= 250 && (preco * quantidade) <= 500){
            JOptionPane.showMessageDialog(null, "O desconto aplicado será de 10%");
            double total = preco * quantidade;
            double total_desconto = total * 0.10;
            JOptionPane.showMessageDialog(null, "O valor de " + total + " foi para " + (total - total_desconto) + ".");
        }

        else{
            JOptionPane.showMessageDialog(null, "O desconto aplicado será de 15%");
            double total = preco * quantidade;
            double total_desconto = total * 0.15;
            JOptionPane.showMessageDialog(null, "O valor de " + total + " foi para " + (total - total_desconto) + ".");
        }
    }
}
