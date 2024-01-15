/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

/**
 *
 * @author rocio
 */
public class Tarea5D {
    private int numero;
    private int paginas;
    //pagina

    //constructor 
    public Tarea5D(int numero, int paginas) {
        this.numero = numero;
        this.paginas = paginas;
    }
    //constructor por defecto 

    public Tarea5D() {
    }
    
    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tarea5D{");
        sb.append("numero=").append(numero);
        sb.append(", paginas=").append(paginas);
        sb.append('}');
        return sb.toString();
    }
    
}
