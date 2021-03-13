package universidad;

public class Profesor extends Persona {

    private String horario;
    private double salario;
    private String aula;
    private boolean isTutor;
    private String grado;

    public Profesor(String horario, double salario, String aula,
            boolean isTutor, String grado, String nombre, String apellido,
            String NIF, String correo, String telefono, String direccion,
            String id, boolean isAlumno, boolean isProfesor, boolean isPAS,
            boolean isIT) {
        super(nombre, apellido, NIF, correo, telefono, direccion, id, isAlumno,
                isProfesor, isPAS, isIT);
        this.horario = horario;
        this.salario = salario;
        this.aula = aula;
        this.isTutor = isTutor;
        this.grado = grado;
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

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public boolean isIsTutor() {
        return isTutor;
    }

    public void setIsTutor(boolean isTutor) {
        this.isTutor = isTutor;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

}
