
package taller_4_punto_8;


public class PUNTO_8_EJECUCION {
    public static void main(String[] args) {
        TALLER_4_PUNTO_8 miLibro = new TALLER_4_PUNTO_8 ();
        miLibro.setTitulo("Cien años de soledad");
        miLibro.setAutor("Gabriel Garcia");
        miLibro.setISBN("0-13-031997-X Prentice-Hall");
        miLibro.setPaginas(200);
        miLibro.setEdicion("3.");
        miLibro.setEditorial("Mundo Planeta");
        miLibro.setLugar(" Colombia", "Bogota");
        miLibro.setFecha_edicion("10 de Agosto 1994");
        imprimirInfoLibro(miLibro);
     
    }
    
    
    public static void imprimirInfoLibro( TALLER_4_PUNTO_8 r){
        System.out.println("Titulo: " + r.getTitulo());
        System.out.println(r.getEdicion() + "Edicion");
        System.out.println("Autor: "+ r.getAutor());
        System.out.println("ISBN: " + r.getISBN());
        System.out.println(r.getEditorial() + ","+ r.getLugar() + ","+ r.getFecha_edicion());
        System.out.println(r.getPaginas() + " Paginas");
        System.out.println("                           ");
    }
}

    

