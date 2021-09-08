
package taller_4_punto_5;


public class PUNTO_5_EJECUCION {
public static void main(String[] args) {
        
        TALLER_4_PUNTO_5 T = new TALLER_4_PUNTO_5 ();
        T.setBase(40);
        T.setAltura(20);
        T.setladoA(18);
        T.setladoB(18);
        T.setladoC(9);
        T.setanguloA(20);
        T.setanguloB(30);
        
        imprimirInfoTriangulo(T); 
    }
    
   public static void imprimirInfoTriangulo( TALLER_4_PUNTO_5 r){
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Longitud lados iguales: "+ r.calcularlongitud());
        System.out.println("Perimetro: " + r.calcularPerimetro());
        System.out.println("El angulo vertice es de: " + r.calcularAngulovertice());
        System.out.println("-----------------------------------");
    }
}
    

