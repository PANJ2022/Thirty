/*Student: Paula Alejandra Navarro Jaimes
  Abstract: Ejercicios del 1 al 3, Imprimir por pantalla.*/

package Thirty;

public class Print {
    
    public static void main(String[] args){
        
        one();
        two();
        three();
    }
    
    //1. Escribir un programa en Java que imprima por pantalla la frase “Hola, ya se imprimir frases”.
    public static void one(){
        
        System.out.println("\n1. Hola, ya se imprimir frases");
    }
    
    //2. Escribir un programa en Java que imprima por pantalla un número entero, por ejemplo el 273, o el 597.
    public static void two(){
        //option 1
        System.out.println("\n2. 273");
        
        //option 2
        int a=597;
        System.out.println("2. " + a);
    }
    
    //3. Escribir un programa en Java que imprima por pantalla un número decimal, por ejemplo el 5’3, ó el 7’5.
    public static void three(){
        //option 1
        System.out.println("\n3. 5.3");
        
        //option 2
        double a = 7.6;
        System.out.println("3. " + a);
        
        //option 3
        float b = 3.5f; //"Usa 4bytes en vez de 8(double) lo cual puede ser util en casos de ahorrar memoria"
        System.out.println("3. " + b);
    
    }
}
