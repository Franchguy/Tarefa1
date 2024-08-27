import javax.swing.JOptionPane;

public class atividade5 {
    public static void main(String[] args) {
        int idadeJogadoresTime1 = 0;
        int idadeJogadoresTime2 = 0;
        int idadeJogadoresTime3 = 0;

        int jogadores_menores_18 = 0;

        double alturas_jogadores = 0;

        double peso_jogadores = 0;

        int quantidade_jogadores = 0;
        while(quantidade_jogadores <= 55){
            if(quantidade_jogadores <= 11){
                JOptionPane.showMessageDialog(null, "TIME 1");
                // IDADES TIME 1
                String idadeJogadorTime1 = JOptionPane.showInputDialog(null, "Idade do jogador");
                int JogadorTime1 = Integer.parseInt(idadeJogadorTime1);
                idadeJogadoresTime1 += JogadorTime1;
                if (JogadorTime1 < 18){
                    jogadores_menores_18 += 1;
                }
                
                // ALTURAS TIME 1
                String altura_jogadorStr = JOptionPane.showInputDialog(null, "Altura do jogador");
                double altura_jogador = Double.parseDouble(altura_jogadorStr);
                alturas_jogadores += altura_jogador;

                // PESOS TIME 1
                String peso_jogadorStr = JOptionPane.showInputDialog("Peso do jogador");
                double peso_jogador = Double.parseDouble(peso_jogadorStr);
                if (peso_jogador > 80){
                    peso_jogadores += 1;
                } 

                quantidade_jogadores += 1;
            }
            else if(quantidade_jogadores <= 11){
                JOptionPane.showMessageDialog(null, "TIME 1");
                // IDADES TIME 1
                String idadeJogadorTime1 = JOptionPane.showInputDialog(null, "Idade do jogador");
                int JogadorTime1 = Integer.parseInt(idadeJogadorTime1);
                idadeJogadoresTime1 += JogadorTime1;
                if (JogadorTime1 < 18){
                    jogadores_menores_18 += 1;
                }
                
                // ALTURAS TIME 1
                String altura_jogadorStr = JOptionPane.showInputDialog(null, "Altura do jogador");
                double altura_jogador = Double.parseDouble(altura_jogadorStr);
                alturas_jogadores += altura_jogador;

                // PESOS TIME 1
                String peso_jogadorStr = JOptionPane.showInputDialog("Peso do jogador");
                double peso_jogador = Double.parseDouble(peso_jogadorStr);
                if (peso_jogador > 80){
                    peso_jogadores += 1;
                } 

                quantidade_jogadores += 1;
            }
            else{
                JOptionPane.showMessageDialog(null, "TIME 1");
                // IDADES TIME 1
                String idadeJogadorTime1 = JOptionPane.showInputDialog(null, "Idade do jogador");
                int JogadorTime1 = Integer.parseInt(idadeJogadorTime1);
                idadeJogadoresTime1 += JogadorTime1;
                if (JogadorTime1 < 18){
                    jogadores_menores_18 += 1;
                }
                
                // ALTURAS TIME 1
                String altura_jogadorStr = JOptionPane.showInputDialog(null, "Altura do jogador");
                double altura_jogador = Double.parseDouble(altura_jogadorStr);
                alturas_jogadores += altura_jogador;

                // PESOS TIME 1
                String peso_jogadorStr = JOptionPane.showInputDialog("Peso do jogador");
                double peso_jogador = Double.parseDouble(peso_jogadorStr);
                if (peso_jogador > 80){
                    peso_jogadores += 1;
                } 

                quantidade_jogadores += 1;
            }
        }
    }
}
