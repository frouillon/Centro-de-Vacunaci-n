package clases;
import java.util.Date;
public class PacienteVacunado {
    public String nombre;
    public String apellido;
    public String telefono;
    public String tipoDoc;
    public String codDoc;
    public String domicilio;
    public Vacuna vacunaSuministrada;
    public String kitVacunaSuministrada;
    public String loteVacunaSuministrada;
    public String marcaVacunaSuministrada;
    public String efectoAdversoVacunaSuministrada;
    private String codigoHuffman;
    public PacienteVacunado() {
    }

    public PacienteVacunado(String nombre, String apellido, String telefono, String tipoDoc, String codDoc, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.tipoDoc = tipoDoc;
        this.codDoc = codDoc;
        this.domicilio = domicilio;
    }

    public PacienteVacunado(String nombre, String apellido, String telefono, String tipoDoc, String codDoc, String domicilio, String kitVacunaSuministrada, String loteVacunaSuministrada, String marcaVacunaSuministrada, String efectoAdversoVacunaSuministrada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.tipoDoc = tipoDoc;
        this.codDoc = codDoc;
        this.domicilio = domicilio;
        this.kitVacunaSuministrada = kitVacunaSuministrada;
        this.loteVacunaSuministrada = loteVacunaSuministrada;
        this.marcaVacunaSuministrada = marcaVacunaSuministrada;
        this.efectoAdversoVacunaSuministrada = efectoAdversoVacunaSuministrada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getCodDoc() {
        return codDoc;
    }

    public void setCodDoc(String codDoc) {
        this.codDoc = codDoc;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }   

    public void setKitVacunaSuministrada(String kitVacunaSuministrada) {
        this.kitVacunaSuministrada = kitVacunaSuministrada;
    }
    
    public void setLoteVacunaSuministrada(String loteVacunaSuministrada) {
        this.loteVacunaSuministrada = loteVacunaSuministrada;
    }
    
    public void setMarcaVacunaSuministrada(String marcaVacunaSuministrada) {
        this.marcaVacunaSuministrada = marcaVacunaSuministrada;
    }
    
    public void setEfectoAdversoLoteVacunaSuministrada(String efectoAdversoVacunaSuministrada) {
        this.efectoAdversoVacunaSuministrada = efectoAdversoVacunaSuministrada;
    }

    public String getKitVacunaSuministrada() {
        return kitVacunaSuministrada;
    }

    public String getLoteVacunaSuministrada() {
        return loteVacunaSuministrada;
    }

    public String getMarcaVacunaSuministrada() {
        return marcaVacunaSuministrada;
    }

    public String getEfectoAdversoVacunaSuministrada() {
        return efectoAdversoVacunaSuministrada;
    }

    public Vacuna getVacunaSuministrada() {
        return vacunaSuministrada;
    }

    public void setVacunaSuministrada(Vacuna vacunaSuministrada) {
        this.vacunaSuministrada = vacunaSuministrada;
    }
    public String getCodigoHuffman() {
        return codigoHuffman;
    }

    public void setCodigoHuffman(String codigoHuffman) {
        this.codigoHuffman = codigoHuffman;
    }

    @Override
    public String toString() {
        return "PacienteVacunado{" + "nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", tipoDoc=" + tipoDoc + ", codDoc=" + codDoc + ", domicilio=" + domicilio + ", vacunaSuministrada=" + vacunaSuministrada + ", kitVacunaSuministrada=" + kitVacunaSuministrada + ", loteVacunaSuministrada=" + loteVacunaSuministrada + ", marcaVacunaSuministrada=" + marcaVacunaSuministrada + ", efectoAdversoVacunaSuministrada=" + efectoAdversoVacunaSuministrada + ", codigoHuffman=" + codigoHuffman + '}';
    }
    
}
