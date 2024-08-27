import javax.swing.JOptionPane;

public class atividade5 {
    public static void main(String[] args) {
        int jogadores_menores_18 = 0;
        double soma_alturas = 0;
        double jogadores_acima_80kg = 0;
        int total_jogadores = 55; 

        int[] soma_idades_por_time = new int[5];
        int[] quantidade_jogadores_por_time = new int[5];

        for (int time = 0; time < 5; time++) {
            JOptionPane.showMessageDialog(null, "TIME " + (time + 1));

            for (int jogador = 0; jogador < 11; jogador++) {
                // IDADE
                String idade_jogador_str = JOptionPane.showInputDialog(null, "Idade do jogador: " + (jogador + 1) + ", "+ " do Time: " + (time + 1));
                int idade_jogador = Integer.parseInt(idade_jogador_str);
                soma_idades_por_time[time] += idade_jogador;
                quantidade_jogadores_por_time[time]++;

                if (idade_jogador < 18) {
                    jogadores_menores_18++;
                }

                // ALTURA
                String altura_jogador_str = JOptionPane.showInputDialog(null, "Altura do jogador " + (jogador + 1) + ", " + " do Time " + (time + 1));
                double altura_jogador = Double.parseDouble(altura_jogador_str);
                soma_alturas += altura_jogador;

                // PESO
                String peso_jogador_str = JOptionPane.showInputDialog("Peso do jogador " + (jogador + 1) + ", " + " do Time " + (time + 1));
                double peso_jogador = Double.parseDouble(peso_jogador_str);
                if (peso_jogador > 80) {
                    jogadores_acima_80kg++;
                }
            }
        }
        for (int time = 0; time < 5; time++) {
            double media_idade = (double) soma_idades_por_time[time] / quantidade_jogadores_por_time[time];
            JOptionPane.showMessageDialog(null, "Média de idade do Time " + (time + 1) + ": " + media_idade);
        }
        double media_alturas = soma_alturas / total_jogadores;
        JOptionPane.showMessageDialog(null, "Média das alturas: " + media_alturas);
        JOptionPane.showMessageDialog(null, "jogadores inferior a 18 anos: " + jogadores_menores_18);
        double porcentagem_acima_80kg = (jogadores_acima_80kg / total_jogadores) * 100;
        JOptionPane.showMessageDialog(null, "Jogadores com mais de 80 kg: " + porcentagem_acima_80kg + "%");
    }
}
