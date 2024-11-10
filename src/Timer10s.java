public class Timer10s {
    public static void main(String[] args) throws InterruptedException {
        // TODO: Melhorar utilizando Swing para criar uma interface gráfica

        for (int i = 10; i > 0; i--) {
            System.out.print("\r" + i + "   ");
            Thread.sleep(1000);
        }

    }
}
