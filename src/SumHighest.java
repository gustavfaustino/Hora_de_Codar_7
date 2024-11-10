import javax.swing.JOptionPane;

public class SumHighest {
    public static void main(String[] args) {
        // TODO: Tratamento de erros

        int n1, n2, n3;

        JOptionPane.showMessageDialog(null,
        "Olá! Como vai voce?\n\nPor favor, a seguir, digite 3 números inteiros e então, somaremos os dois maiores!",
                "Soma dos Maiores", JOptionPane.INFORMATION_MESSAGE);

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número: ",
                "Soma dos Maiores", JOptionPane.QUESTION_MESSAGE));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número: ",
                "Soma dos Maiores", JOptionPane.QUESTION_MESSAGE));
        n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro número: ",
                "Soma dos Maiores", JOptionPane.QUESTION_MESSAGE));

        int somaDosMaiores;

        if (n1 <= n2 && n1 <= n3) { // n1 é o menor
            somaDosMaiores = n2 + n3;
        } else if (n2 <= n1 && n2 <= n3) { // n2 é o menor
            somaDosMaiores = n1 + n3;
        } else { // n3 é o menor
            somaDosMaiores = n1 + n2;
        }

        JOptionPane.showMessageDialog(null, String.format("A soma dos dois maiores é %d", somaDosMaiores),
                "Soma dos Maiores", JOptionPane.INFORMATION_MESSAGE);

    }
}
