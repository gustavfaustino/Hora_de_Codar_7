import javax.swing.JOptionPane;

public class IsThatPositive {
    public static void main(String[] args) {

        int number = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Olá! Como vai voce?\n\nPor favor, digite um número: ",
                "Positivo ou Negativo?", JOptionPane.QUESTION_MESSAGE));

//        TODO: Tratamento de erros

        // Simple If/Else statement, using JOptionPane
        if (number > 0) {
            JOptionPane.showMessageDialog(null,
                    String.format("O número %d é positivo!", number),
                    "Positivo ou Negativo?", JOptionPane.INFORMATION_MESSAGE);
        } else if (number < 0) {
            JOptionPane.showMessageDialog(null,
                    String.format("O número %d é negativo!", number),
                    "Positivo ou Negativo?", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    String.format("O número %d é zero, ou seja, neutro!", number),
                    "Positivo ou Negativo?", JOptionPane.INFORMATION_MESSAGE);
        }


    }
}
