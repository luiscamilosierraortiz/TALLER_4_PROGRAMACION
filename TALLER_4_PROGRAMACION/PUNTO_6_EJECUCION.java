
package taller_4_punto_6;

import java.util.Scanner;


public class PUNTO_6_EJECUCION {
public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        TALLER_4_PUNTO_6 b = new  TALLER_4_PUNTO_6();
        b.setVelocidad1(16);
        b.setPlato1(15);
        b.setPiñon1(5);
        imprimirInfoBicicleta(b);
        System.out.print("velocidad: ");
        int x = entrada.nextInt();
        System.out.print("plato: ");
        int z = entrada.nextInt();
        System.out.print("piñon: ");
        int s = entrada.nextInt();
        
         TALLER_4_PUNTO_6 a = new  TALLER_4_PUNTO_6 ();
        a.setVelocidad1(16);
        a.setPlato1(15);
        a.setPiñon1(5);
        a.setVelocidad2(x);
        a.setPlato2(z);
        a.setPiñon2(s);
        imprimirInfoBicicleta(a);
             
    }
        public static void imprimirInfoBicicleta(  TALLER_4_PUNTO_6 r){
        System.out.println("\nVelocidad: "+ r.getVelocidad1());
        System.out.println("Plato: "+ r.getPlato1());
        System.out.println("Piñon: "+ r.getPiñon1());
        System.out.println("                       ");
    
        }
}

    

