
package taller_4_punto_5;


public class TALLER_4_PUNTO_5 {

    
    private double base;
    private double altura;
    private double ladoA, ladoB, ladoC, anguloA, anguloB;
   
    
    
    public TALLER_4_PUNTO_5(){
        this.base = 5;
        this.altura=10;
        this.ladoA= 14;
        this.ladoB=14;
        this.ladoC=7;
        this.anguloA= 15;
        this.anguloB=18;
                
    }
    
    public double getBase(){
        return this.base;
    }   
    
    public double getAltura(){
        return this.altura;
    }
    
     public double getladoA(){
        return this.altura;
    }
     
    public double getladoB(){
        return this.altura;
    }
    
    public double getladoC(){
        return this.altura;
    }
    
    public double getanguloA(){
        return this.altura;
    }
    
    public double getanguloB(){
        return this.altura;
    }
    
 
    
    public void setBase(double base){
        this.base = base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setladoA(double ladoa){
        this.ladoA = ladoa;
    }
    public void setladoB(double ladob){
        this.ladoB = ladob;
    }
    public void setladoC(double ladoc){
        this.ladoC = ladoc;
    }
    
    public void setanguloA(double anguloa){
        this.anguloB = anguloa;
    }
    public void setanguloB(double angulob){
        this.anguloB = angulob;
    }
    
    
    public double calcularArea(){
        return (this.base * this.altura)/2;
    }
    
    public double calcularPerimetro(){
        return 2*(this.altura + this.base);
        
    }
     public double calcularlongitud(){
        return (this.ladoA + this.ladoB + this.ladoC);
    }
     
    public double calcularAngulovertice(){
        return (this.anguloA+ this.anguloB);
    }
    
     
}
  