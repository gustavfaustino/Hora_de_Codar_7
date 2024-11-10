import javax.swing.*;

public class LetsDivide {
    public static void main(String[] args) {

        // TODO: Tratamento de erros

        double n1, n2;

        JOptionPane.showMessageDialog(null,
                "Olá! Como vai voce?\n\nPor favor, a seguir, digite 2 números e depois, dividiremos o primeiro pelo segundo! ",
                "Divisão", JOptionPane.INFORMATION_MESSAGE);

        // Loop until the second number is not zero
        while (true) {
            // Get the numbers from the user
            n1 = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Digite o primeiro número: ",
                    "Divisão", JOptionPane.QUESTION_MESSAGE));
            n2 = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Digite o segundo número: ",
                    "Divisão", JOptionPane.QUESTION_MESSAGE));

            // Verify if the second number is zero
            if (n2 == 0) {
                JOptionPane.showMessageDialog(null,
                        "O segundo número deve ser diferente de zero! Tente novamente.",
                        "Divisão", JOptionPane.ERROR_MESSAGE);
            } else {
                double result = n1 / n2;
                JOptionPane.showMessageDialog(null,
                        String.format("O resultado da divisão é: %.2f", result),
                        "Divisão", JOptionPane.INFORMATION_MESSAGE);
                // Exit the loop
                break;
            }
        }
    }
}
