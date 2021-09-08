
package taller_4_punto_3;


public class PUNTO_3_EJECUCION {
public static void main(String[] args) {
        
        TALLER_4_PUNTO_3 A = new TALLER_4_PUNTO_3();
        imprimirHabitacion(A);
        
        TALLER_4_PUNTO_3 B = new TALLER_4_PUNTO_3 (4,3,2);
        imprimirHabitacion(B);
    }
    
    public static void  imprimirHabitacion( TALLER_4_PUNTO_3 h){
        System.out.println("Largo: " + h.getLargo());
        System.out.println("Ancho: " +h.getAncho());
        System.out.println("Alto: " + h.getAlto());
        System.out.println("Tapizado: " + h.cantidadTapizado());
        System.out.println("Enchape: " + h.cantidadEnchape());
        System.out.println("-----------------------------");
    }
}
    

