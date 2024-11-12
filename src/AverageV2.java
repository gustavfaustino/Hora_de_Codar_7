import javax.swing.*;

public class AverageV2 {
    public static void main(String[] args) {
        // TODO: Tratamento de erros;

        int n1, n2;
        int[] numbers = null;
        int sum = 0;

        JOptionPane.showMessageDialog(null,
                "Olá, como vai você?\n\nPor favor, a seguir, digite 2 números inteiros e depois,\ncalcularemos a média dos numeros entre eles!!!",
                "Média V2", JOptionPane.INFORMATION_MESSAGE);


        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número: ",
                "Média V2", JOptionPane.QUESTION_MESSAGE));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número, que deverá ser maior que o primeiro: ",
                "Média V2", JOptionPane.QUESTION_MESSAGE));

        if (n2 > n1) {
            for (int i = n1; i <= n2; i++) {
                numbers = new int[n2 - n1 + 1]; // cria um array com o tamanho da diferença entre os dois numeros
                numbers[i - n1] = i; // adiciona o numero no array
                sum += i; // soma o numero
            }
            double media = (double) sum / numbers.length;
            System.out.println(media + "," + sum + "," + numbers.length);
            JOptionPane.showMessageDialog(null, String.format("A média dos números entre %d e %d é %.2f", n1, n2, media),
                    "Média V2", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "O segundo número deverá ser maior que o primeiro!",
                    "Média V2", JOptionPane.ERROR_MESSAGE);
        }


    }
}
