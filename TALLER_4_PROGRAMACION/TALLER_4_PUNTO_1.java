
package taller_4_punto_1;


public class TALLER_4_PUNTO_1 {

    
    
    // atributos de instancia
    private double B;
    private double A;
    
    // atributo de clase
    public static final String COLOR="Blanco";
    
    // constructor por defecto
    public TALLER_4_PUNTO_1(){
        this.B = 5;
        this.A=10;
    }
    
    // metodos getter
    public double getBase(){
        return this.B;
    }   
    
    public double getAltura(){
        return this.A;
    }
    
    
    //metodos setters
    
    public void setBase(double base){
        this.B = base;
    }
    
    public void setAltura(double altura){
        this.A = altura;
    }
    
    
    // metodos miembros
    
    public double calcularArea(){
        return this.B * this.A;
    }
    
    public double calcularPerimetro(){
        return 2*(this.A + this.B);
    }
    
}   


 