
package taller_4_punto_3;


public class TALLER_4_PUNTO_3 {

    private double L;
      private double  ANCHO;
        private double  ALT;
    
    public TALLER_4_PUNTO_3 (){
    }
    
    public TALLER_4_PUNTO_3 (double largo, double ancho, double alto){
        this.ALT=alto;
        this.ANCHO=ancho;
        this.L = largo;
    }

    
    public double getLargo() {
        return L;
    }

   
    public void setLargo(double largo) {
        this.L = largo;
    }

    public double getAncho() {
        return ANCHO;
    }

  
    public void setAncho(double ancho) {
        this.ANCHO = ancho;
    }

   
    public double getAlto() {
        return ALT;
    }

   
    public void setAlto(double alto) {
        this.ALT = alto;
    }
    
    public double cantidadEnchape(){
        return this.ANCHO*this.L;
    }
    
    public double cantidadTapizado(){
        
        return 2*(this.ALT*this.ANCHO) + 2 * (this.ALT*this.L);
    }
    
}

    
 