
package taller_4_punto_2;

import java.util.Scanner;


public class PUNTO_2_EJECUCION {
public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor de X: ");
        int x = entrada.nextInt();
        
        TALLER_4_PUNTO_2 e = new TALLER_4_PUNTO_2();
        e.setA(3);
        e.setB(2);
        e.setC(5);
        
        System.out.printf("Y(%d)= %.2f%n",x, e.evaluarEcuacion(x) );
        
        
        TALLER_4_PUNTO_2 eSobrecargada = new TALLER_4_PUNTO_2(3,2,5);
        System.out.printf("* Y(%d)= %.2f%n",x, eSobrecargada.evaluarEcuacion(x) );
        
        TALLER_4_PUNTO_2 eSobrecargada2 = new TALLER_4_PUNTO_2(3,2);
        System.out.printf("* Y(%d)= %.2f%n",x, eSobrecargada2.evaluarEcuacion(x) );
        
    }
}

