import javax.swing.*;

public class Average {
    public static void main(String[] args) {
        // TODO: Tratamento de erros

        // Initialize variables
        double media = 0;
        int[] numbers = new int[10];


        JOptionPane.showMessageDialog(null,
                "Ola!, Como vai voce?\n\nPor favor, a seguir, digite 10 números inteiros e depois, calcularemos a média! ",
                "Média", JOptionPane.INFORMATION_MESSAGE);

        // Get 10 numbers using a loop and store them in an array
        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite o " + (i + 1) + "º número: ",
                    "Média", JOptionPane.QUESTION_MESSAGE));

            // Verify if the number is positive, if not, show an error message
            if (numbers[i] < 0) {
                JOptionPane.showMessageDialog(null,
                        "O número deve ser positivo! Tente novamente.",
                        "Média", JOptionPane.ERROR_MESSAGE);
                // Remove the number from the array
                i--;
            }
        }

        // Calculate the average
        for (int i = 0; i < 10; i++) media += numbers[i];

        media /= 10;

        // Show the result
        JOptionPane.showMessageDialog(null,
                String.format("A média dos numeros digitados é: %.2f", media),
                "Média", JOptionPane.INFORMATION_MESSAGE);
    }
}
