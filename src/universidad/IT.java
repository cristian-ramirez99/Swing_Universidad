package universidad;

public class IT extends Persona {

    private String horario;
    private double salario;
    private String estacionDeTrabajo;
    private String extension;
    private boolean hacePracticas;

    public IT(String horario, double salario, String estacionDeTrabajo,
            String extension, boolean hacePracticas, String nombre,
            String apellido, String NIF, String correo, String telefono,
            String direccion, String id, boolean isAlumno, boolean isProfesor,
            boolean isPAS, boolean isIT) {
        super(nombre, apellido, NIF, correo, telefono, direccion, id, isAlumno, isProfesor, isPAS, isIT);
        this.horario = horario;
        this.salario = salario;
        this.estacionDeTrabajo = estacionDeTrabajo;
        this.extension = extension;
        this.hacePracticas = hacePracticas;
    }

    @Override
    public void modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEstacionDeTrabajo() {
        return estacionDeTrabajo;
    }

    public void setEstacionDeTrabajo(String estacionDeTrabajo) {
        this.estacionDeTrabajo = estacionDeTrabajo;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public boolean isHacePracticas() {
        return hacePracticas;
    }

    public void setHacePracticas(boolean hacePracticas) {
        this.hacePracticas = hacePracticas;
    }

}
