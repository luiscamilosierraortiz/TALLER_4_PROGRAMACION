
package taller_4_punto_4;

import java.util.Scanner;


public class PUNTO_4_EJECUCION {
public static void main(String[] args) {
       
        Scanner entrada;
    entrada = new Scanner(System.in);
        TALLER_4_PUNTO_4 Coche = new TALLER_4_PUNTO_4();
        
        System.out.println("Digite el color del coche: ");
        String color = entrada.nextLine();
        
        System.out.println("Digite la marca del coche: ");
        String marca = entrada.nextLine();
        
        System.out.println("Digite el modelo del coche: ");
        String modelo = entrada.nextLine();
        
        System.out.println("Digite la matricula del coche: ");
        String matricula = entrada.nextLine();
        
        System.out.println("Digite los caballos de fuerza del coche: ");
        int caballos = entrada.nextInt();
        
        System.out.println("Digite el numero de puertas del coche: ");
        int puertas = entrada.nextInt();
       
        Coche.setColor(color);
        Coche.setMarca(marca);
        Coche.setModelo(modelo);
        Coche.setCaballos(caballos);
        Coche.setPuertas(puertas);
        Coche.setMatricula(matricula);
        
        System.out.println("\nDatos del Coche :");
        System.out.println("Color: " + Coche.getColor());
        System.out.println("Marca: " + Coche.getMarca());
        System.out.println("Modelo: " + Coche.getModelo());
        System.out.println("Caballos de fuerza: " + Coche.getCaballos());
        System.out.println("Numero de puertas: " + Coche.getPuertas());
        System.out.println("Matricula: " + Coche.getMatricula());
                 
    }
    
    
}    

