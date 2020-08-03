package Clases;

/**
 *
 * @author Alexandeer
 */
public class Libro {

    private String nombre;
    private String editorial;
    private String clase;
    private int año;
    private int paginas;
    private double costo;

    private static int tAnalisisB;
    private String nombreLibro;
    private String nombreEditorial;
    private String nombreLibroMayorCosto;

    public Libro(String nombre, String editorial, String clase, int año, int paginas, double costo) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.clase = clase;
        this.año = año;
        this.paginas = paginas;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getTAnalisis() {
        return tAnalisisB;
    }

    void conteos() {
        if (getClase().equals("Analisis")&& getEditorial().equals("B")) {
            tAnalisisB++;
        }
    }

}
