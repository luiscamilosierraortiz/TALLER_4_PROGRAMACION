
package taller_4_punto_7;


public class PUNTO_7_EJECUCION {
public static void main(String[] args) {
        
        TALLER_4_PUNTO_7 miProducto=new TALLER_4_PUNTO_7 ();
        miProducto.setCodigo(5978);
        miProducto.setPCompra(50.00);
        miProducto.setPUtilidad(0.5);
        imprimirInfoProducto(miProducto);
    }
    
    
        public static void imprimirInfoProducto( TALLER_4_PUNTO_7 r){
        System.out.println("Codigo de producto: "+ r.getCodigo());
        System.out.println("Precio de compra: "+ r.getPCompra());
        System.out.println("Precio de utilidad: "+ r.getPUtilidad());
        System.out.println("Precio de venta: "+ r.calcularPVenta());
        System.out.println("                                     ");
    }
    
}
    

