
package taller_4_punto_9;

import java.util.Scanner;


public class PUNTO_9_EJECUCION {
     public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String nombre, numero;
        double tipo, importe,Consignar, Retirar;

        
        TALLER_4_PUNTO_9 Cuenta = new  TALLER_4_PUNTO_9 ();

        System.out.print("Nombre del cliente : ");
        nombre = sc.nextLine();
        System.out.print("Número de la cuenta : ");
        numero = sc.nextLine();
        System.out.print("Saldo: ");
        importe = sc.nextDouble();
        System.out.print("Ingrese saldo a Consignar: ");
        Consignar = sc.nextDouble();
        
        System.out.print("Ingrese saldo a Retirar: ");
        Retirar = sc.nextDouble();
        
        Cuenta.setNombre(nombre);
        Cuenta.setNumeroCuenta(numero);
        Cuenta.setSaldo(importe);

      
        System.out.println("\nDatos de la cuenta :");
        System.out.println("Nombre del titular: " + Cuenta.getNombre());
        System.out.println("Número de cuenta: " + Cuenta.getNumeroCuenta());
        System.out.println("Saldo: " + Cuenta.getSaldo());
        System.out.println();

        Cuenta.Consignar(Consignar);
        System.out.println("El nuevo Saldo despues de consignar es: " + Cuenta.getSaldo());
        
        Cuenta.retirar(Retirar);
        System.out.println("El nuevo Saldo despues de retirar es: " + Cuenta.getSaldo());



       }

       }
    

