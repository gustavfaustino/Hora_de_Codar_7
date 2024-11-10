import javax.swing.*;

public class HelloClarice {
    public static void main(String[] args) {
        // Juntei o exercício Hello Clarice e A Bit of Information em um só arquivo Java.

        // TODO: Tratamento de erros
        String userName = JOptionPane.showInputDialog(null,
                "Olá! Como vai voce?\n\nQual o seu nome?",
                "Hello Clarice!", JOptionPane.QUESTION_MESSAGE);

        int userAge = Integer.parseInt(JOptionPane.showInputDialog(null,
                String.format("É um prazer conhecer você, %s!!\n\nQual a sua idade?", userName),
                "Hello Clarice!", JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null,
                String.format("Seu nome é %s e sua idade é %d anos.\n\nObrigado por participar!", userName, userAge),
                "Hello Clarice!", JOptionPane.INFORMATION_MESSAGE);
    }
}
