
package taller_4_punto_xi;


public class PUNTO_XI_EJECUCION {
    static public void main(String[] args) {
     TALLER_4_PUNTO_XI x=new TALLER_4_PUNTO_XI (8,2);
     TALLER_4_PUNTO_XI y=new TALLER_4_PUNTO_XI (4,7);
     TALLER_4_PUNTO_XI z=new TALLER_4_PUNTO_XI (2,8);
     System.out.println("x-->  "+x);
     System.out.println("y-->  "+y);
     System.out.println("z-->  "+z);
     System.out.println("Suma = "+ TALLER_4_PUNTO_XI.sumarFraccion(x, y));
     System.out.println("resta = "+TALLER_4_PUNTO_XI.restarFraccion(x, y));
     System.out.println("Multiplicacion = "+TALLER_4_PUNTO_XI.multiplicarFraccion(x,y));

     TALLER_4_PUNTO_XI resultado=TALLER_4_PUNTO_XI.multiplicarFraccion(TALLER_4_PUNTO_XI.sumarFraccion(x,y),z);
     System.out.println("\nSimplificacion=  " + resultado);
     System.out.println(resultado.simplificarFraccion());
     try  {
            System.in.read();
        }catch (Exception e) {  }
    }
}
    

