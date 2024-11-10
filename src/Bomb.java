public class Bomb {
    public static void main(String[] args) throws InterruptedException {
        // TODO: Melhorar utilizando Swing para criar uma interface gráfica para a bomba, exibindo o timer.

        System.out.println("""
                        ,--.!,
                     __/   -*-
                   ,d08b.  '|`
                   0088MM    \s
                   `9MMP'
                """);

        for (int i = 30; i > 0; i--) {
            System.out.print("\r" + i + "   ");
            Thread.sleep(1000);
        }

        System.out.println("\n" + """
                                             ____
                                     __,-~~/~    `---.
                                   _/_,---(      ,    )
                               __ /        <    /   )  \\___
                - ------===;;;'====------------------===;;;===----- -  -
                                  \\/  ~"~"~"~"~"~\\~"~)~"/
                                  (_ (   \\  (     >    \\)
                                   \\_( _ <         >_>'
                                      ~ `-i' ::>|--"
                                          I;|.|.|
                                         <|i::|i|`.
                                        (` ^'"`-' ")
                """);
        System.out.println("EXPLOSÃO!");
    }

}
