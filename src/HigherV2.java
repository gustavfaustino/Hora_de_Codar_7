import javax.swing.*;

public class HigherV2 {
    public static void main(String[] args) {
        // TODO: Tratamento de erros, caso o usuário digite letras ou numeros negativos ou numeros iguais, por exemplo

        int n1, n2, n3, n4;
        JOptionPane.showMessageDialog(null,
                "Olá! Como vai voce?\n\nPor favor, a seguir, digite 4 números inteiros para saber qual é o maior!",
                "Maior número V2", JOptionPane.INFORMATION_MESSAGE);

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número: ",
                "Maior número V2", JOptionPane.QUESTION_MESSAGE));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número: ",
                "Maior número V2", JOptionPane.QUESTION_MESSAGE));
        n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro número: ",
                "Maior número V2", JOptionPane.QUESTION_MESSAGE));
        n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o quarto número: ",
                "Maior número V2", JOptionPane.QUESTION_MESSAGE));

        if (n1 > n2 && n1 > n3 && n1 > n4) {
            JOptionPane.showMessageDialog(null, String.format("O maior número entre os 4 é o %d", n1),
                    "Maior número V2", JOptionPane.INFORMATION_MESSAGE);
        } else if (n2 > n1 && n2 > n3 && n2 > n4) {
            JOptionPane.showMessageDialog(null, String.format("O maior número entre os 4 é o %d", n2),
                    "Maior número V2", JOptionPane.INFORMATION_MESSAGE);
        } else if (n3 > n1 && n3 > n2 && n3 > n4) {
            JOptionPane.showMessageDialog(null, String.format("O maior número entre os 4 é o %d", n3),
                    "Maior número V2", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, String.format("O maior número entre os 4 é o %d", n4),
                    "Maior número V2", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
