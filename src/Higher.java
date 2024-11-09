import javax.swing.JOptionPane;

public class Higher {
    public static void main(String[] args) {
        int n1, n2, n3;

        // TODO: Tratamento de erros, caso o usuário digite letras ou numeros negativos ou numeros iguais, por exemplo

        JOptionPane.showMessageDialog(null,
                "Olá! Como vai voce?\n\nPor favor, a seguir, digite 3 números inteiros para saber qual é o maior!",
                "Maior número", JOptionPane.INFORMATION_MESSAGE);

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número: ",
                "Maior número", JOptionPane.QUESTION_MESSAGE));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número: ",
                "Maior número", JOptionPane.QUESTION_MESSAGE));
        n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro número: ",
                "Maior número", JOptionPane.QUESTION_MESSAGE));

        if (n1 > n2 && n1 > n3) {
            JOptionPane.showMessageDialog(null, String.format("O maior número entre os 3 é o %d", n1),
                    "Maior número", JOptionPane.INFORMATION_MESSAGE);
        } else if (n2 > n1 && n2 > n3) {
            JOptionPane.showMessageDialog(null, String.format("O maior número entre os 3 é o %d", n2),
                    "Maior número", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, String.format("O maior número entre os 3 é o %d", n3),
                    "Maior número", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
