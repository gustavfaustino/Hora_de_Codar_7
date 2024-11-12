import javax.swing.JOptionPane;

public class GradeV2 {
    public static void main(String[] args) {
        // TODO: Tratamento de erros

        JOptionPane.showMessageDialog(null,
                "Olá! Como vai voce?\n\nPor favor, a seguir, digite o números das notas e depois, veremos se voce foi aprovado! ",
                "Notas", JOptionPane.INFORMATION_MESSAGE);

        // Initialize variables
        double[] notas;


        do {
            // Get 6 numbers using a loop and store them in an array

            double media = 0; // Initialize the average, so it can be used in the If/Else statement
            notas = new double[6]; // Reset the array

            for (int i = 0; i < notas.length; i++) {
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
            for (double nota : notas) media += nota;
            System.out.print(media + "," + notas.length);

            media /= 6;

            // Simple If/Else statement, using JOptionPane
            if (media >= 6.5) {
                JOptionPane.showMessageDialog(null,
                        String.format("Parabéns, voce foi aprovado! Sua média foi de %.2f", media),
                        "Notas", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        String.format("Que pena, voce foi reprovado! Sua média foi de %.2f", media),
                        "Notas", JOptionPane.INFORMATION_MESSAGE);
            }

        } while (JOptionPane.NO_OPTION != JOptionPane.showOptionDialog(null,
                "Deseja calcular novamente?",
                "Notas", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, null, null));
    }
}