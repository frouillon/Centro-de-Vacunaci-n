package vacuanrespaldo;

import clases.*;

public class test {

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.insertar(new PacienteVacunado("Nombre1", "Apellido1", "123", "DNI", "123", "Dirección1"));
        arbol.insertar(new PacienteVacunado("Nombre2", "Apellido2", "456", "DNI", "456", "Dirección2"));
        arbol.insertar(new PacienteVacunado("Nombre3", "Apellido3", "12", "DNI", "1023", "Dirección1"));
        arbol.insertar(new PacienteVacunado("Nombre4", "Apellido4", "523", "DNI", "1223", "Dirección1"));
        arbol.insertar(new PacienteVacunado("Nombre5", "Apellido5", "723", "DNI", "1243", "Dirección1"));
        arbol.insertar(new PacienteVacunado("Nombre6", "Apellido6", "193", "DNI", "12", "Dirección1"));
        // Inserta más pacientes según sea necesario
        String codDocBuscado = "1223";  // Reemplaza esto con el codDoc que deseas buscar
        String codigoEncontrado = arbol.buscarCodigoEnArbol(codDocBuscado);

        if (!codigoEncontrado.isEmpty()) {
            System.out.println("Código encontrado para " + codDocBuscado + ": " + codigoEncontrado);
        } else {
            System.out.println("No se encontró un código para " + codDocBuscado);
        }
    }
}
