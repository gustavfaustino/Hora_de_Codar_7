import javax.swing.JOptionPane;
import java.util.Arrays;

public class SumHighestV2 {
    public static void main(String[] args) {
        // TODO: Tratamento de erros

        int n1, n2, n3, n4, n5;

        JOptionPane.showMessageDialog(null,
                "Olá! Como vai você?\n\nPor favor, a seguir, digite 5 números inteiros e depois, somaremos os dois maiores!",
                "Soma dos Maiores V2", JOptionPane.INFORMATION_MESSAGE);

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número: ",
                "Soma dos Maiores V2", JOptionPane.QUESTION_MESSAGE));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número: ",
                "Soma dos Maiores V2", JOptionPane.QUESTION_MESSAGE));
        n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro número: ",
                "Soma dos Maiores V2", JOptionPane.QUESTION_MESSAGE));
        n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o quarto número: ",
                "Soma dos Maiores V2", JOptionPane.QUESTION_MESSAGE));
        n5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o quinto número: ",
                "Soma dos Maiores V2", JOptionPane.QUESTION_MESSAGE));

        // Store the numbers in an array, so we can sort them. Different from SumHighestV1.
        int[] numeros = {n1, n2, n3, n4, n5};

        // Sort the array in ascending order
        Arrays.sort(numeros);

        // Then, sum the two highest numbers
        int somaDosMaiores = numeros[3] + numeros[4];
        // In that way, we don't need to check if n1 > n2 and n1 > n3 etc.

        JOptionPane.showMessageDialog(null, String.format("A soma dos dois maiores é %d", somaDosMaiores),
                "Soma dos Maiores V2", JOptionPane.INFORMATION_MESSAGE);
    }
}
