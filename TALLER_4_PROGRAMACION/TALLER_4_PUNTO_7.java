
package taller_4_punto_7;


public class TALLER_4_PUNTO_7 {

    
    private int codigo ;
    private double pCompra, pVenta;
    private double pUtilidad;
    
    public TALLER_4_PUNTO_7 (){
    
    
    }

    public TALLER_4_PUNTO_7 (int codigo, double pCompra, int pUtilidad) {
        this.codigo = codigo;
        this.pCompra = pCompra;
        this.pUtilidad = pUtilidad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPCompra(double pCompra) {
        this.pCompra = pCompra;
    }

    public void setPVenta(double pVenta) {
        this.pVenta = pVenta;
    }

    public void setPUtilidad(double pUtilidad) {
        this.pUtilidad = pUtilidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPCompra() {
        return pCompra;
    }

    public double getPVenta() {
        return pVenta;
    }

    public double getPUtilidad() {
        return pUtilidad;
    }
    
    
    public double calcularPVenta(){
        return  this.pCompra * pUtilidad;
    }
    
    
    
    
}
   