public class HeightPlay {
    public static void main(String[] args) {
        /*Anacleto tem 1, 50 metro e cresce 2 centímetros por ano, enquanto Felisberto tem 1, 1 O metro e cresce 3
        centímetros por ano.Construa um algoritmo que calcule e imprima quantos anos serão necessários para
        que Felisberto seja maior que Anacleto.*/

        int anos = 0;
        double alturaAnacleto = 1.50, alturaFelisberto = 1.10;
        while (alturaAnacleto > alturaFelisberto) {
            anos += 1;
            alturaAnacleto += 0.02;
            alturaFelisberto += 0.03;
        }
        System.out.println("Anacleto ficara maior que Felisberto em " + anos + " anos.");
    }
}
