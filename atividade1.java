import javax.swing.JOptionPane;

public class atividade1{
    public static void main(String[] args) {
        // PEGAR A INFORMAÇÃO EM STRING
        String horas_trabalhadasStr = JOptionPane.showInputDialog(null, "Digite as horas trabalhadas: ");
        String valor_horaStr = JOptionPane.showInputDialog(null, "Digite o valor do salario por hora: ");
        // Converte as Strings para doubles
        double horas_trabalhadas = Double.parseDouble(horas_trabalhadasStr);
        double valor_hora = Double.parseDouble(valor_horaStr);
        // Calcular o salário bruto
        double salario_bruto = horas_trabalhadas * valor_hora;
        // Calcular o imposto
        double imposto = salario_bruto * 0.30;
        // Calcular o salário líquido
        double salario_liquido = salario_bruto - imposto;
        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "O salário total é: " + salario_liquido);

    }
}
