
public class Main {

    public static void main(String args[]) {
        var contador = 0;
        System.out.println(" =============WHILE=================");
        while (contador <= 3) {
            System.out.println("contador = " + contador);
            contador++;
        }
        System.out.println(" ============= DO-WHILE=================");
        var contador2 = 0;
        do {
            System.out.println("contador2 = " + contador2);
            contador2++;
        } while (contador2 <= 3);
        System.out.println(" =============FOR=================");

        for (int i = 0; i <= 3; i++) {
            System.out.println(i);
        }
        System.out.println(" ============= NUMEROS PARES=================");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }

        }
        System.out.println(" =============BREAK=================");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                break;
            }

        }
        System.out.println(" =============CONTINUE=================");
        for (int i = 0; i < 10; i++) {
            if (i%2!=0) {
                continue;
            }
            System.out.println("i= "+ i);
        }
    }
}
