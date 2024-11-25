/*Student: Paula Alejandra Navarro Jaimes
  Abstract: Ejercicios del 18 al 30, Leer desde el teclado. Sentencia de condición (if).*/

package Thirty;

import java.util.*;

public class Scan {
    
    public static void main(String[] args){
        eighteen();
        nineteen();
        twenty();
        twentyone();
        twentytwo();
        twentythree();
        twentyfour();
        twentyfive();
        twentysix();
        twentyseven();
    }
    
    //18. Escribir un programa en Java que lea un número entero desde teclado y realiza la suma de los 100 número siguientes, mostrando el resultado en pantalla.
    public static void eighteen(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n18. ");
        int s = 0;
        
        System.out.print("Escriba un numero entero: ");
        int n = sc.nextInt();
        
        for(int i=n; i<n+100; i++){
            s += i; 
        }
        
        System.out.println(s);
    }
    
    //19. Escribir un programa en Java que convierta de euros a dólares. Recibirá un número decimal correspondiente a la cantidad en euros y contestará con la cantidad correspondiente en dolares.
    public static void nineteen(){
        Scanner sc = new Scanner(System.in);
        double dollar = 1.06;
        
        System.out.println("\n19. Ingrese la cantidad en euros (separar decimales con ,): ");
        double euro = sc.nextDouble();
        
        double convert = euro*dollar;
        System.out.println(euro + " euros en dolares es: " + convert);
    }
    
    //20. Escribir un programa en Java que calcule el área de un rectángulo del cual se le proporcionará por el teclado su altura y anchura (números decimales).
    public static void twenty(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n20. Ingrese la altura del rectangulo (separar decimales con ,): ");
        double h = sc.nextDouble();
        
        System.out.println("Ingrese el ancho del rectangulo (separar decimales con ,): ");
        double b = sc.nextDouble();
        
        double area = b*h;
        System.out.println("El area del rectangulo es: " + area);
    }
    
    //21. Escribir un programa en Java que lea dos números del teclado y diga cual es el mayor y cual el menor.
    public static void twentyone(){
        Scanner sc = new Scanner(System.in);
        int x=0;
        System.out.println("\n21. Ingrese un numero: ");
        double a = sc.nextDouble();
        
        System.out.println("Ingrese otro numero: ");
        double b = sc.nextDouble();
        
        if (a>b){
            x = 1;
        }
        if (a<b){
            x = -1;
        }
        
        switch(x){
            case 1 -> {
                System.out.println(a + " es mayor que " + b);
            }
            case -1 -> {
                System.out.println(a + " es menor que " + b);
            }
            case 0 -> {
                System.out.println(a + " y " + b + " son iguales");
            }
        }
    }
    
    //22. Escribir un programa en Java que lea un número entero por el teclado e imprima todos los número impares menores que él.
    public static void twentytwo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n22. Ingrese un numero entero: ");
        int n = sc.nextInt();
        int o = 1;
        int x = 1;
        
        //option 1
        for(int i=0; o<n; i++){
            System.out.println(o);
            o=(i*2)+1;
        }
        
        //option 2
        while(x<n){
            System.out.println(x);
            x += 2;
        }
    }
    
    //23. Implemente el algoritmo de Euclides para encontrar el gcd de dos número leídos desde teclado.
    public static void twentythree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n23. Ingrese un numero entero (numerador): ");
        int a = sc.nextInt();
        System.out.println("Ingrese otro numero entero (denominador): ");
        int b = sc.nextInt();
        int mcd;
        if(a!=0){
            while(b!=0){
                int R = a%b;
                a = b;
                b = R;
            }
            mcd = a;
        }else
            mcd = b;
        System.out.println(mcd);
    }
    
    //24. Escriba un programa que lea los coeficientes a, b y c de una ecuación de segundo, y estudie si tiene o no solución. En caso positivo, las soluciones se calcularán e imprimirán en pantalla.
    public static void twentyfour(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n24. Ingrese coeficiente de a: ");
        double a = sc.nextDouble();
        System.out.println("Ingrese coeficiente de b: ");
        double b = sc.nextDouble();
        System.out.println("Ingrese coeficiente de c: ");
        double c = sc.nextDouble();
        System.out.println("La ecuacion quedó de la siguiente forma:  ("+a+"x^2) + ("+b+"x) + ("+c+") = 0");

        double discriminant = Math.pow(b, 2)-(4*a*c);
        double only = -b/(2*a);
        
        if(discriminant >= 0){
            double sqrt = Math.sqrt(discriminant);
            
            if(discriminant>0){
                double pos = (-b+sqrt)/(2*a);
                double neg = (-b-sqrt)/(2*a);
                
                System.out.println("Las soluciones son: x1 = " + pos + " y x2 = "+ neg);
            }else
                System.out.println("La unica solucion es: x = " + only);
                
        }else
            System.out.println("La ecuacion no tiene soluciones reales");
        }
    
    //25. Pruebe la recursividad en Java. Escriba programas que calculen recursivamente las funciones factorial(n) y Ackermann(x, y).
    public static void twentyfive(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n25. Ingrese el valor de n: ");
        double n = sc.nextDouble();
        System.out.println("Ingrese el valor de x: ");
        double x = sc.nextDouble();
        System.out.println("Ingrese el valor de y: ");
        double y = sc.nextDouble();
        
        System.out.println(n+"! = " + factorial(n));
        if(n<=0 || x<=0 || y<=0){
            System.out.println("n, x y y no pueden ser negativos");
        }else
            System.out.println("Ackerman (" + x + ", " + y + ") = " + ackerman(x,y));
    }
    public static double factorial(double n){
        if (n == 0 || n == 1){
            return 1;
        }else
            return n * factorial(n-1);
    }
    public static double ackerman(double x, double y){
        if(x==0){
            return y+1;
        }
        if(x>0 && y==0){
            return ackerman(x-1,1);
        }
        if(x>0 && y>0){
            return ackerman(x-1, ackerman(x, y-1));
        }else
            return 0;
    }
    
    //26. Escriba un programa que lea tres números enteros positivos, y que calcule e imprima en pantalla el menor y el mayor de todos ellos.
    public static void twentysix(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n 26. Ingrese un numero natural: ");
        int a = sc.nextInt();
        System.out.println("Ingrese un segundo numero natural: ");
        int b = sc.nextInt();
        System.out.println("Ingrese un tercer numero natural: ");
        int c = sc.nextInt();
        
        int max = Math.max(a,(Math.max(b,c)));
        int min = Math.min(a, (Math.min(b, c)));
        
        System.out.println("Entre los numeros "+a+", "+b+" y "+c+" el mayor es "+max+" y el menor es "+min);
    }
    
    //27. Escriba un programa que lea temperaturas expresadas en grados Fahrenheit y las convierta a grados Celsius mostrándola. El programa finalizará cuando lea un valor de temperatura igual a 999. La conversión de grados Farenheit (F) a Celsius (C) está dada por C = 5/9(F − 32).
    public static void twentyseven(){
        Scanner sc =new Scanner(System.in);
        
        while(true){
            System.out.println("\n27. Ingrese la temperatura en grados Fahrenheit: ");
            double f=sc.nextInt();
            if(f!=999){
                double c=5*(f-32)/(9);
                System.out.println(f+"° F es "+c+"° C");
            }else
                break;
        }
    }
}
