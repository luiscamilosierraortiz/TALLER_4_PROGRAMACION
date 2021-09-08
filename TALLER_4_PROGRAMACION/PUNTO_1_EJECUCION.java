
package taller_4_punto_1;


public class PUNTO_1_EJECUCION {
    public static void main(String[] args) {
        TALLER_4_PUNTO_1 a = new TALLER_4_PUNTO_1();
        a.setAltura(20);
        a.setBase(10);
        imprimirInfoEjercicio1(a);
        
        TALLER_4_PUNTO_1 b = new TALLER_4_PUNTO_1 ();
        imprimirInfoEjercicio1(b);
        
    }
    
public static void imprimirInfoEjercicio1(TALLER_4_PUNTO_1 r){
        System.out.println("Base: " + r.getBase());
        System.out.println("Altura: "+ r.getAltura());
        System.out.println("Color: " + TALLER_4_PUNTO_1.COLOR);
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Perimetro"+r.calcularPerimetro());
        System.out.println("-----------------------------------");
    }
}
  
