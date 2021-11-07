
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("===================Video 35 ====================");
        var condicion = false;

        if (condicion) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }

        System.out.println("===================Video 36 ====================");

        var numero = 9;
        var numeroTexto = "Desconocido";

        if (numero == 1) {
            numeroTexto = "Numero UNO";
        } else if (numero == 2) {
            numeroTexto = "Numero DOS";
        } else if (numero == 3) {
            numeroTexto = "Numero Tres";

        } else {
            numeroTexto = "Numero no Encontrado";
        }

        System.out.println("numeroTexto = " + numeroTexto);

        System.out.println("===================Video 37 ====================");

        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO DE MES");
        var mes = Integer.parseInt(scanner.nextLine());
        var estacion = "DESCONOCIDA";

        if (mes == 1 || mes == 2 || mes == 3) {
            estacion = "Verano";
        } else if (mes == 4 || mes == 5 || mes == 6) {
            estacion = "Otoño";
        } else if (mes == 7 || mes == 8 || mes == 9) {
            estacion = "Invierno";
        } else if (mes == 10 || mes == 11 || mes == 12) {
            estacion = "Primavera";
        }

        System.out.println("estacion = " + estacion);

        System.out.println("===================Video 38 ====================");
        System.out.println("INGRESE UN NUMERO ");
        var num = Integer.parseInt(scanner.nextLine());
        numeroTexto = "VALOR DESCONOCIDO";

        switch (num) {
            case 1:
                numeroTexto = "UNO";
                break;
            case 2:
                numeroTexto = "DOS";
                break;
            case 3:
                numeroTexto = "TRES";
                break;
            case 4:
                numeroTexto = "CUATRO";
                break;
            default:
                numeroTexto = "CASO NO ENCONTRADO";
        }
        System.out.println("numero = " + numeroTexto);

        System.out.println("===================Video 39 ====================");
        System.out.println("INGRESE EL MES");
        mes = Integer.parseInt(scanner.nextLine());
        estacion = "DESCONOCIDA";

        switch (mes) {
            case 1:
            case 2:
            case 3:
                estacion = "VERANO";
                break;
            case 4:
            case 5:
            case 6:
                estacion = "OTOÑO";
                break;
            case 7:
            case 8:
            case 9:
                estacion = "INVIERNO";
                break;
            case 10:
            case 11:
            case 12:
                estacion = "PRIMAVERA";
                break;
        }
        
        System.out.println("estacion = " + estacion);
    }

}
