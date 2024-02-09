package clases;
public class NodoArbol {
    public PacienteVacunado paciente;
    public NodoArbol izquierdo;
    public NodoArbol derecho;
    public NodoArbol(PacienteVacunado paciente) {
        this.paciente = paciente;
        this.izquierdo = null;
        this.derecho = null;
    }
}
