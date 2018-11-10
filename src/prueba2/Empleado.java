package prueba2;

/**
 *
 * @author LWY
 */
public abstract class Empleado implements Salario {

    private int id;
    private String nombre;
    private String labor;

    public Empleado(int id, String nombre, String labor) {
        this.id = id;
        this.nombre = nombre;
        this.labor = labor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", labor=" + labor + '}';
    }

  
    
    

}
