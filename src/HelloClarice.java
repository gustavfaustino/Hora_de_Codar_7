import javax.swing.*;

public class HelloClarice {
    public static void main(String[] args) {
        // Juntei o exercício Hello Clarice e A Bit of Information em um só arquivo Java.

        // TODO: Tratamento de erros
        String userName = JOptionPane.showInputDialog(null,
                "Olá! Como vai voce?\n\nQual o seu nome?",
                "Hello Clarice!", 3);

        int userAge = Integer.parseInt(JOptionPane.showInputDialog(null,
                String.format("É um prazer conhecer você, %s!!\n\nQual a sua idade?", userName),
                "Hello Clarice!", 3));

        JOptionPane.showMessageDialog(null,
                String.format("Seu nome é %s e sua idade é %d anos.\n\nObrigado por participar!", userName, userAge),
                "Hello Clarice!", 1);
    }
}
