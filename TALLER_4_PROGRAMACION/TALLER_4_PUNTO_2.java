
package taller_4_punto_2;


public class TALLER_4_PUNTO_2 {

    
  
    
    private int a;
    private int b;
    private int c;
    
    public TALLER_4_PUNTO_2(){
      
    }
    
    public TALLER_4_PUNTO_2(int a, int b, int c){
        this.a=a; 
        this.b=b;
        this.c=c;
    }
    
    public TALLER_4_PUNTO_2(int a, int b){
        this.a=a;
        this.b=b;
        
    }
    
    
    
    public int getA(){
        return this.a;
    }
    
    public int getB(){
        return this.b;
    }
    
    public int getC(){
        return this.c;
    }
    
    
    public void setA(int a){
        this.a=a;
    }
    
    public void setB(int b){
        this.b=b;
    }
    
    public void setC(int c){
        this.c=c;
    }
    
    public double evaluarEcuacion(int x){
        
        double y = this.a * Math.pow(x, 2) + this.b*x + this.c;
        return y;
    }
    }

 