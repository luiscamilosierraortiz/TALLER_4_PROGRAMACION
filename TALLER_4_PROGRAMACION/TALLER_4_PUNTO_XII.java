
package taller_4_punto_xii;


public class TALLER_4_PUNTO_XII {

   
    private double VelocidadInicial;
    private double Gravedad;
    private double tiempo;
    
    public TALLER_4_PUNTO_XII (){
      
    }
    

    public double getVelocidadInicial() {
        return VelocidadInicial;
    }

    public Double getGravedad() {
        return Gravedad;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setVelocidadInicial(int VelocidadInicial) {
        this.VelocidadInicial = VelocidadInicial;
    }

    public void setGravedad(Double Gravedad) {
        this.Gravedad = Gravedad;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public double Calculardistancia(){
        double distancia = 0.5 * Gravedad * Math.pow(tiempo,2);
        return distancia;
    }
  
    public double velocidadFinal(){
        
        double VelocidadFinal = this.VelocidadInicial + Gravedad * tiempo;
        return VelocidadFinal;
    }
}
  