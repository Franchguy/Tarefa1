import javax.swing.JOptionPane;

public class atividade3 {
    public static void main(String[] args){
        // LADOS do triângulo
        String lado1Str = JOptionPane.showInputDialog(null, "Digite um lado do triângulo: ");
        String lado2Str = JOptionPane.showInputDialog(null, "Digite outro lado do triângulo: ");
        String lado3Str = JOptionPane.showInputDialog(null, "Digite outro lado do triângulo: ");
        // CONVERTENDO para double
        double lado1 = Double.parseDouble(lado1Str);
        double lado2 = Double.parseDouble(lado2Str);
        double lado3 = Double.parseDouble(lado3Str);

        // ÂNGULOS do triângulo
        String ângulo1Str = JOptionPane.showInputDialog(null, "Digite um ângulo do triângulo: ");
        String ângulo2Str = JOptionPane.showInputDialog(null, "Digite outro ângulo do triângulo: ");
        String ângulo3Str = JOptionPane.showInputDialog(null, "Digite outro ângulo do triângulo: ");
        // CONVERTENDO para double
        double ângulo1 = Double.parseDouble(ângulo1Str);
        double ângulo2 = Double.parseDouble(ângulo2Str);
        double ângulo3 = Double.parseDouble(ângulo3Str);

        // TRIÂNGULO retângulo
        if((ângulo1 < 90 & ângulo2<90 & ângulo3==90) || (ângulo1 < 90 & ângulo2==90 & ângulo3<90) || (ângulo1==90 & ângulo2<90 & ângulo3<90)){
            // TRIÂNGULO equilátero
            if(lado1 == lado2 & lado2 == lado3){
                JOptionPane.showMessageDialog(null, "Esse triângulo é: RETÂNGULO e EQUILÁTERO");
            
        }
            // TRIÂNGULO isóceles
            else if((lado1 == lado2 & lado2 != lado3) || (lado3 == lado2 & lado2 != lado3)){
                JOptionPane.showMessageDialog(null, "Esse triângulo é: RETÂNGULO e ISÓCELES");
        }
            // TRIÂNGULO escaleno
            else if(lado1 != lado2 & lado2 != lado3){
                JOptionPane.showMessageDialog(null, "Esse triângulo é: RETÂNGULO e ESCALENO");
        }

        }

        // TRIÂNGULO acutângulo
        else if(ângulo1<90 & ângulo2<90 & ângulo3<90){
            // TRIÂNGULO equilátero
            if(lado1 == lado2 & lado2 == lado3){
                JOptionPane.showMessageDialog(null, "Esse triângulo é: ACUTÂNGULO e EQUILÁTERO");
            }
                // TRIÂNGULO isóceles
            else if((lado1 == lado2 & lado2 != lado3) || (lado3 == lado2 & lado2 != lado3)){
                JOptionPane.showMessageDialog(null, "Esse triângulo é: ACUTÂNGULO e ISÓCELES");
            }
                // TRIÂNGULO escaleno
            else if(lado1 != lado2 & lado2 != lado3){
                JOptionPane.showMessageDialog(null, "Esse triângulo é: ACUTÂNGULO e ESCALENO");
            }
        }

        // TRIÂNGULO obtusângulo
        else{
            // TRIÂNGULO equilátero
            if(lado1 == lado2 & lado2 == lado3){
                JOptionPane.showMessageDialog(null, "Esse triângulo é: OBTUSÂNGULO e EQUILÁTERO");
            }
                // TRIÂNGULO isóceles
            else if((lado1 == lado2 & lado2 != lado3) || (lado3 == lado2 & lado2 != lado3)){
                JOptionPane.showMessageDialog(null, "Esse triângulo é: OBTUSÂNGULO e ISÓCELES");
            }
                // TRIÂNGULO escaleno
            else if(lado1 != lado2 & lado2 != lado3){
                JOptionPane.showMessageDialog(null, "Esse triângulo é: OBTUSÂNGULO e ESCALENO");
            }
        }



}
}
