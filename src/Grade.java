import javax.swing.JOptionPane;

public class Grade {
    public static void main(String[] args) {
        // TODO: Tratamento de erros

        JOptionPane.showMessageDialog(null,
                "Olá! Como vai voce?\n\nPor favor, a seguir, digite o números das notas e depois, veremos se voce foi aprovado! ",
                "Notas", JOptionPane.INFORMATION_MESSAGE);

        // Initialize variables
        double[] notas = new double[4];
        double media = 0;

        // Get 4 numbers using a loop and store them in an array
        for (int i = 0; i < 4; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Digite a " + (i + 1) + "º nota: ",
                    "Notas", JOptionPane.QUESTION_MESSAGE));

            if (notas[i] < 0 || notas[i] > 10) {
                JOptionPane.showMessageDialog(null,
                        "A nota deve estar entre 0 e 10! Tente novamente.",
                        "Notas", JOptionPane.ERROR_MESSAGE);
                // Remove the number from the array
                i--;
            }
        }

        // Calculate the average
        for (int i = 0; i < 4; i++) media += notas[i];

        media /= 4;

        // Simple If/Else statement, using JOptionPane
        if (media >= 6.0) {
            JOptionPane.showMessageDialog(null,
                    String.format("Parabéns, voce foi aprovado! Sua média foi de %.2f", media),
                    "Notas", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    String.format("Que pena, voce foi reprovado! Sua média foi de %.2f", media),
                    "Notas", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
