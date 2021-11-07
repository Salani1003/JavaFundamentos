
package test;


public class TestArreglos {
    public static void main(String[] args) {
        
        int edades[]=new int[3];
        String frutas[]={"Naranja","Limon","Manzana"};
        
//        for (int i = 0; i < edades.length; i++) {
//            
//            if (edades[0]==0) {
//                edades[i]=8;
//                
//            }else{
//                edades[i]=3+edades[0];
//            }
//                
//                System.out.println("edades = " + edades[i]);
//        

        edades[0]=10;
        edades[1]=3;
        edades[2]=8;
        System.out.println("edades0=" +edades[0]);
        
        for (int i = 0; i < edades.length; i++) {
            
            System.out.println("edades elementos = " +i+":"+edades[i]);
            
        }
        
        for (int i = 0; i <frutas.length; i++) {
            System.out.println("Frutas = " + frutas[i]);
        }
    }
    
}
