/*Student: Paula Alejandra Navarro Jaimes
  Abstract: Ejercicios del 4 al 17, Operaciones basicas y bucles.*/

package Thirty;

import java.util.*;

public class OpAndLoops {

    public static void main(String[] args){
        four();
        five();
        six();
        seven();
        eight();
        nine();
        ten();
        eleven();
        twelve();
        thirteen();
        fourteen();
        fifteen();
        sixteen();
        seventeen();
    }
    
    //4. Escribir un programa en Java que imprima por pantalla la suma de 1234 y 532.
    public static void four(){
        int a = 1234;
        int b = 532;
        int sum = a+b;
        
        System.out.println("\n4. La suma de 1234 y 532 es: "+ sum);
    }
    
    //5. Escribir un programa en Java que imprima por pantalla la resta de 1234 y 532.
    public static void five(){
        int a = 1234;
        int b = 532;
        int sub = a-b; //subtraction (there's no s lol)
        
        System.out.println("\n5. La resta de 1234 y 532 es: "+ sub);
    }
    
    //6. Escribir un programa en Java que imprima por pantalla la multiplicación de 1234 y 532.
    public static void six(){
        int a = 1234;
        int b = 532;
        int x = a*b;
        
        System.out.println("\n6. La multiplicacion de 1234 y 532 es: "+ x);
    }
    
    //7. Escribir un programa en Java que imprima por pantalla la división de 1234 entre 532.
    public static void seven(){
        int a = 1234;
        int b = 532;
        int div = a/b;
        
        System.out.println("\n7. La division de 1234 entre 532 es: "+ div);
    }
    
    //8. Escribir un programa en Java que imprima por pantalla los números del 1 al 3.
    public static void eight(){
        int n = 0;
        
        //option 1
        System.out.print("\n8. ");
        while(n<3){
            n++;
            System.out.print(n);
            if (n<3) {
                System.out.print(", ");
            }else
                 System.out.println(".");
        }
            
        //option 2
        int o = 1;
        int t = 2;
        int h = 3;
        
        System.out.println("8. " + o + ", " + t + ", " + h + ".");//because im using println in the period (option 1) i dont need to put \n in here
    }
    
    //9. Escribir un programa en Java que imprima por pantalla los números del 1 al 9.
    public static void nine(){
        int n = 0;
        
        //option 1
        System.out.print("\n9. ");
        while(n<9){
            n++;
            System.out.print(n);
            if (n<9) {
                System.out.print(", ");
            }else
                 System.out.println(".");
        }
            
        //option 2 (i got lazy to remove the [])
        int[] nine = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("9. " + Arrays.toString(nine));//from java.util.Arrays
        
        //a third option would be have a variable for each number but no lol.
    }   
    
    //10. Escribir un programa en Java que imprima por pantalla los números del 1 al 10.000. Conveniente usar bucles.
    public static void ten(){ //i put it in wrapped mode cause its too damn long. why...
        System.out.println("\n10. ");
        
        for (int n = 1; n<=10000;n++){
            System.out.print(n);
            if (n<10000) {
                System.out.print(", ");
            }else
                 System.out.println(".");
        }
    }//everything was in order *cries*
    
    //11. Escribir un programa en Java que imprima por pantalla los números del 5 al 10.
    public static void eleven(){
        System.out.print("\n11. ");

        for(int n=5;n<=10;n++){
            System.out.print(n);
            if (n<10) {
                System.out.print(", ");
            }else
                 System.out.println(".");
        }
    }
    
    //12. Escribir un programa en Java que imprima por pantalla los números del 5 al 15.
    public static void twelve(){
        System.out.print("\n12. ");

        for(int n=5; n<=15; n++){
            System.out.print(n);
            if (n<15) {
                System.out.print(", ");
            }else
                 System.out.println(".");
        }
    }
    
    //13. Escribir un programa en Java que imprima por pantalla los números del 5 al 15.000. Conveniente usar bucles.
    public static void thirteen(){ //again...
        System.out.println("\n13. ");
        
        for (int n = 5; n<=15000;n++){
            System.out.print(n);
            if (n<15000) {
                System.out.print(", ");
            }else
                 System.out.println(".");
        }
    }
    
    //14. Escribir un programa en Java que imprima 200 veces la palabra “hola”. Nota: en el código fuente que usted escriba debe figurar solamente una vez la palabra “hola”.
    public static void fourteen(){ //ya por favor...
        System.out.print("\n14. ");
        
        for (int n = 0; n<200; n++){
            System.out.print("hola");
            if (n<199) {
                System.out.print(", ");
            }else
                 System.out.println(".");
        }
    }
    
    //15. Escribir un programa en Java que imprima por pantalla los cuadrados de los 30 primeros números naturales.
    public static void fifteen(){
        System.out.print("\n15. ");

        for(int n=1; n<=30; n++){
            int pow =(int) Math.pow(n, 2); 
            System.out.print(pow);
            if (n<30) {
                System.out.print(", ");
            }else
                 System.out.println(".");
        }
    }
    
    //16. Escribir un programa en Java que multiplique los 20 primeros número naturales (1*2*3*4*5…).
    public static void sixteen(){
        System.out.print("\n16. ");
        
        long x=1; //int's range is from -2,147,483,648 to 2,147,483,647 while long's is from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        
        for(long n=1; n<=20; n++){
            x = x*n; 
        }
        System.out.println(x);
    }
    
    //17. Escribir un programa en Java que sume los cuadrados de los cien primeros números naturales, mostrando el resultado en pantalla.
    public static void seventeen(){
        System.out.print("\n17. ");
        long x=0;
        
        for(long n=1; n<=100; n++){
            long pow =(long) (Math.pow(n, 2))+x;
            x = pow;
            
        }
        System.out.println(x);
    }
    
}