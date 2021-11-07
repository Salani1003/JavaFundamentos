
public class Main {
    
    public static void main(String args[]) {
        
        int a = 3, b = 2;
        var result = a + b;
        System.out.println("resultado suma = " + result);
        
        result = a - b;
        System.out.println("resultado resta = " + result);
        
        result = a * b;
        System.out.println("resultado multriplicacion = " + result);
        
        var result2 = 3D / b;
        System.out.println("resultado division = " + result2);
        
        result = a % b;
        System.out.println("resultado modulo = " + result);
        
        if (b % 2 == 0) {
            System.out.println("Es un numero par");
        } else {
            System.out.println("Es un numero impar");
        }
        
        System.out.println("===============VIDEO 26==============");
        
        int c = a + 5 - b;
        System.out.println("c = " + c);
        
        a += 1;
        System.out.println("a = " + a);
        
        a++;
        System.out.println("a = " + a);
        
        a += 5;
        System.out.println("a = " + a);
        
        a -= 9;
        System.out.println("a = " + a);
        
        a *= 3;
        System.out.println("a = " + a);
        a /= 3;
        System.out.println("a = " + a);
        
        System.out.println("===============VIDEO 27==============");
        
        a = 3;
        b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var d = true;
        System.out.println("d = " + d);
        var e = !d; // negacion booleana

        System.out.println("e = " + e);
        
        a = 4;
        b = ++a; // primero incrementa y despues usa el valor de la variable.  
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var g = 5;
        var h = g++; // primero se utiliza el valor de la variable y despues de incrementa
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        // decremento 
        // predecremento.
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // post decremento. 
        i = 2;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        System.out.println("===============VIDEO 28==============");
        a = 3;
        b = 2;
        var prueba = (a == b);
        System.out.println("prueba = " + prueba);
        
        var prueba2 = (a != b);
        System.out.println("prueba2 = " + prueba2);
        
        var cadena1 = "HOLA";
        var cadena2 = "ADIOS";
        var cadena3 = "HOLA";
        
        var str = (cadena1 == cadena2); // Compara la referencia en memoria al objeto
        System.out.println("str = " + str);
        
        var str2 = cadena1.equals(cadena2); //Compara el CONTENIDO de las cadenas
        System.out.println("str2 = " + str2);
        System.out.println("===============VIDEO 29==============");
        
        var comparacion = a >= b; // es mayor o igual
        System.out.println("comparacion = " + comparacion);
        
        if (a % 2 == 0) {
            System.out.println("a es PAR");
        } else {
            System.out.println("es IMPAR");
        }
        
        var edad = 17;
        var adulto = 18;
        
        if (edad >= adulto) {
            System.out.println("ES ADULTO");
        } else {
            System.out.println("ES MENOR");
        }
        
        System.out.println("===============VIDEO 30==============");
        
        var valor = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        var resultado = (valor >= valorMinimo && valor <= valorMaximo); // AND
        System.out.println("resultado = " + resultado);
        
        if (resultado) {
            System.out.println("Dentro de Rango");
        } else {
            System.out.println("Fuera de rango");
        }
        
        var vacaciones = false;
        var diaDescanso = false;
        
        if (vacaciones || diaDescanso) { // OR
            System.out.println("Puede ir al juego");
        } else {
            System.out.println("No puede ir al juego");
        }
        
        System.out.println("===============VIDEO 31==============");
        
        a = 3;
        b = 2;
        var ternario = (b> a) ? "verdadero" : "falso";
        System.out.println("ternario = " + ternario);
        
        var num1 = 9;
        var consulta = (num1%2==0) ? "PAR": "IMPAR";
        System.out.println("consulta = " + consulta);
        
        System.out.println("===============VIDEO 32==============");
        var x =5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var resul = 4+5*6/3;
        System.out.println("resul = " + resul);
       
    }
}
