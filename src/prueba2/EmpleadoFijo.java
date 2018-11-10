package prueba2;

/**
 *
 * @author LWY
 */
public class EmpleadoFijo extends Empleado {

    private int salario;
    private int dedSalud;
    private int dedPension;

    public EmpleadoFijo(int salario, int dedSalud, int dedPension, int id, String nombre, String labor) {
        super(id, nombre, labor);
        this.salario = salario;
        this.dedSalud = dedSalud;
        this.dedPension = dedPension;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getDedSalud() {
        return dedSalud;
    }

    public void setDedSalud(int dedSalud) {
        this.dedSalud = dedSalud;
    }

    public int getDedPension() {
        return dedPension;
    }

    public void setDedPension(int dedPension) {
        this.dedPension = dedPension;
    }

    @Override
    public double calcularSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
