package clases;
public class ArbolBinario {
    private NodoArbol raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(PacienteVacunado paciente) {
        raiz = insertarRec(raiz, paciente);
    }

    private NodoArbol insertarRec(NodoArbol raiz, PacienteVacunado paciente) {
        if (raiz == null) {
            return new NodoArbol(paciente);
        }

        // Compara el codDoc para decidir en qué rama insertar el nuevo nodo
        if (paciente.getCodDoc().compareTo(raiz.paciente.getCodDoc()) < 0) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, paciente);
        } else if (paciente.getCodDoc().compareTo(raiz.paciente.getCodDoc()) > 0) {
            raiz.derecho = insertarRec(raiz.derecho, paciente);
        }

        return raiz;
    }
    public void mostrarArbol() {
        mostrarArbolRec(raiz);
    }

    private void mostrarArbolRec(NodoArbol nodo) {
        if (nodo != null) {
            mostrarArbolRec(nodo.izquierdo);
            System.out.println(nodo.paciente);  // Suponiendo que la clase PacienteVacunado tiene un buen método toString
            mostrarArbolRec(nodo.derecho);
        }
    }

    public String buscarCodigoEnArbol(String codDoc) {
        StringBuilder codigoEncontrado = new StringBuilder();
        buscarCodigoRec(raiz, codDoc, codigoEncontrado);
        return codigoEncontrado.toString();
    }

    private boolean buscarCodigoRec(NodoArbol nodo, String codDoc, StringBuilder codigoEncontrado) {
        if (nodo != null) {
            // Compara el codDoc para decidir en qué rama buscar
            if (codDoc.compareTo(nodo.paciente.getCodDoc()) == 0) {
                return true;  // Se encontró el código
            }

            // Buscar en el subárbol izquierdo
            if (buscarCodigoRec(nodo.izquierdo, codDoc, codigoEncontrado)) {
                codigoEncontrado.append("0");
                return true;
            }

            // Buscar en el subárbol derecho
            if (buscarCodigoRec(nodo.derecho, codDoc, codigoEncontrado)) {
                codigoEncontrado.append("1");
                return true;
            }
        }

        return false;
    }
}
