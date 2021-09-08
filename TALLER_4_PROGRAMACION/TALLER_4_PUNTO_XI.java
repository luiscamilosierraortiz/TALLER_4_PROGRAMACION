
package taller_4_punto_xi;


public class TALLER_4_PUNTO_XI {

    
       private int numerador;
     private int denominador;
  public TALLER_4_PUNTO_XI () {
     numerador=0;
     denominador=1;
  }
  public TALLER_4_PUNTO_XI (int A, int B) {
     numerador=A;
     denominador=B;
  }
  
  
  public static TALLER_4_PUNTO_XI sumarFraccion( TALLER_4_PUNTO_XI L, TALLER_4_PUNTO_XI C){
     TALLER_4_PUNTO_XI S=new TALLER_4_PUNTO_XI ();
     S.numerador=L.numerador*C.denominador+C.numerador*L.denominador;
     S.denominador=L.denominador*C.denominador;
     return S;
  }
  public static TALLER_4_PUNTO_XI restarFraccion( TALLER_4_PUNTO_XI L, TALLER_4_PUNTO_XI C){
     TALLER_4_PUNTO_XI S=new TALLER_4_PUNTO_XI ();
     S.numerador=L.numerador*C.denominador-C.numerador*L.denominador;
     S.denominador=L.denominador*C.denominador;
     return S;
  }

  public static TALLER_4_PUNTO_XI multiplicarFraccion( TALLER_4_PUNTO_XI L, TALLER_4_PUNTO_XI C){
     return new TALLER_4_PUNTO_XI (L.numerador*C.numerador, L.denominador*C.denominador);
  }
  public static TALLER_4_PUNTO_XI inversa( TALLER_4_PUNTO_XI L){
     return new TALLER_4_PUNTO_XI (L.denominador, L.numerador);
  }
  public static TALLER_4_PUNTO_XI dividirFraccion( TALLER_4_PUNTO_XI L, TALLER_4_PUNTO_XI C){
     return multiplicarFraccion(L, inversa(C));
  }

  private int mcd(){
     int X=Math.abs(numerador);
     int Y=Math.abs(denominador);
     if(Y==0){
          return X;
     }
     int r;
     while(Y!=0){
          r=X%Y;
          X=Y;
          Y=r;
     }
     return X;
  }

  public TALLER_4_PUNTO_XI simplificarFraccion(){
     int dividir=mcd();
     numerador/=dividir;
     denominador/=dividir;
     return this;
  }

     @Override
  public String toString(){
     String texto=numerador+ " / " + denominador;
     return texto;
  }
}
  