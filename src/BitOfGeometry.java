import javax.swing.*;

public class BitOfGeometry {
    public static void main(String[] args) {
        // Options menu for the user, using JComboBox
        String[] options = {
                "Retângulo",
                "Quadrado",
                "Trapezio",
                "Círculo",
                "Triangulo",
                "Losango",
                "Paralelogramo",
        };

        JOptionPane.showMessageDialog(null,
                "Olá usuário(a)!\n\nBem-vindo ao Bit of Geometry!", "Bit of Geometry", JOptionPane.INFORMATION_MESSAGE);

        // Create a JComboBox to display the options to the user, and add it to the frame
        // JComboBox<String> comboBox = new JComboBox<>(options);
        // where <options> is an array of strings and <string> is the type of the strings


        JComboBox<String> comboBoxOptions = new JComboBox<>(options);

//        TODO: Tratamento de erros, usando o JOptionPane

        int result = JOptionPane.showConfirmDialog(null,
                comboBoxOptions,
                "Escolha uma forma geométrica:",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            // Get the selected option
            String selectedShapeOpt = (String) comboBoxOptions.getSelectedItem(); // cast to String, to get the selected item

            // Do something with the selected option

            // If the selected option is "Retângulo", get the base and height
            // If the selected option is "Quadrado", get the side
            // and that's go on for all the other options

            if (selectedShapeOpt.equals("Retângulo")) {
                double base = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a base do retângulo?",
                        "Retângulo", JOptionPane.QUESTION_MESSAGE));

                double altura = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a altura do retângulo?",
                        "Retângulo", JOptionPane.QUESTION_MESSAGE));

                // Calculate the area
                double area = areaRetangulo(altura, base);

                JOptionPane.showMessageDialog(null,
                        "O retângulo tem uma area de " + area + " unidades quadradas!",
                        "Retângulo", JOptionPane.INFORMATION_MESSAGE);
            }

            if (selectedShapeOpt.equals("Quadrado")) {
                double lado = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual o lado do quadrado?",
                        "Quadrado", JOptionPane.QUESTION_MESSAGE));

                // Calculate the area
                double area = areaQuadrado(lado);

                JOptionPane.showMessageDialog(null,
                        "O quadrado tem uma area de " + area + " unidades quadradas!",
                        "Quadrado", JOptionPane.INFORMATION_MESSAGE);
            }

            if (selectedShapeOpt.equals("Trapezio")) {
                double baseMaior = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a base maior do trapezio?",
                        "Trapezio", JOptionPane.QUESTION_MESSAGE));

                double baseMenor = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a base menor do trapezio?",
                        "Trapezio", JOptionPane.QUESTION_MESSAGE));

                double altura = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a altura do trapezio?",
                        "Trapezio", JOptionPane.QUESTION_MESSAGE));

                // Calculate the area
                double area = areaTrapezio(baseMaior, baseMenor, altura);

                JOptionPane.showMessageDialog(null,
                        "O trapezio tem uma area de " + area + " unidades quadradas!",
                        "Trapezio", JOptionPane.INFORMATION_MESSAGE);
            }

            if (selectedShapeOpt.equals("Círculo")) {
                double raio = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual o raio do círculo?",
                        "Círculo", JOptionPane.QUESTION_MESSAGE));

                // Calculate the area
                double area = areaCirculo(raio);

                JOptionPane.showMessageDialog(null,
                        "O círculo tem uma area de " + area + " unidades quadradas!",
                        "Círculo", JOptionPane.INFORMATION_MESSAGE);
            }

            if (selectedShapeOpt.equals("Triangulo")) {
                double base = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a base do triangulo?",
                        "Triangulo", JOptionPane.QUESTION_MESSAGE));

                double altura = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a altura do triangulo?",
                        "Triangulo", JOptionPane.QUESTION_MESSAGE));

                // Calculate the area
                double area = areaTriangulo(base, altura);

                JOptionPane.showMessageDialog(null,
                        "O triangulo tem uma area de " + area + " unidades quadradas!",
                        "Triangulo", JOptionPane.INFORMATION_MESSAGE);
            }

            if (selectedShapeOpt.equals("Losango")) {
                double diagonalMaior = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a diagonal maior do losango?",
                        "Losango", JOptionPane.QUESTION_MESSAGE));

                double diagonalMenor = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a diagonal menor do losango?",
                        "Losango", JOptionPane.QUESTION_MESSAGE));

                // Calculate the area
                double area = areaLosango(diagonalMaior, diagonalMenor);

                JOptionPane.showMessageDialog(null,
                        "O losango tem uma area de " + area + " unidades quadradas!",
                        "Losango", JOptionPane.INFORMATION_MESSAGE);
            }

            if (selectedShapeOpt.equals("Paralelogramo")) {
                double base = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a base do paralelogramo?",
                        "Paralelogramo", JOptionPane.QUESTION_MESSAGE));

                double altura = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a altura do paralelogramo?",
                        "Paralelogramo", JOptionPane.QUESTION_MESSAGE));

                // Calculate the area
                double area = areaRetangulo(altura, base);

                JOptionPane.showMessageDialog(null,
                        "O paralelogramo tem uma area de " + area + " unidades quadradas!",
                        "Paralelogramo", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Cancelou");

            System.out.println("Cancelou");
        }

    }

    // Methods
    public static double areaRetangulo(double h, double b) {
        return h * b;
    }

    public static double areaQuadrado(double l) {
        return Math.pow(l, 2);
    }

    public static double areaLosango(double d1, double d2) {
        return (d1 * d2) / 2;
    }

    public static double areaTrapezio(double b1, double b2, double h) {
        return ((b1 + b2) * h) / 2;
    }

    // Paralelogramo is a rectangle with the same base and height, so we can use the areaRetangulo method

    public static double areaTriangulo(double b, double h) {
        return (b * h) / 2;
    }

    public static double areaCirculo(double r) {
        return Math.PI * Math.pow(r, 2);
    }
}