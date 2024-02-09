package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class HuffmanTree {

    private HashMap<String, String> codigos = new HashMap<>();

    public void construirHuffman(NodoArbol raiz) {
        construirHuffmanRec(raiz, "");
    }

    private void construirHuffmanRec(NodoArbol nodo, String codigo) {
        if (nodo != null) {
            if (nodo.izquierdo == null && nodo.derecho == null) {
                codigos.put(nodo.paciente.getCodDoc(), codigo);
            }

            construirHuffmanRec(nodo.izquierdo, codigo + "0");
            construirHuffmanRec(nodo.derecho, codigo + "1");
        }
    }

    public void imprimirCodigo() {
        for (String codDoc : codigos.keySet()) {
            System.out.println("CodDoc: " + codDoc + " Código Huffman: " + codigos.get(codDoc));
        }
    }

    private NodoArbol raiz;

    public HuffmanTree() {
        raiz = null;
    }

    public void construirHuffman(PacienteVacunado[] pacientes) {
        PriorityQueue<NodoArbol> colaPrioridad = new PriorityQueue<>((a, b) -> a.paciente.getCodDoc().compareTo(b.paciente.getCodDoc()));

        // Crear nodos iniciales para cada paciente
        for (PacienteVacunado paciente : pacientes) {
            colaPrioridad.add(new NodoArbol(paciente));
        }

        // Construir el árbol de Huffman
        while (colaPrioridad.size() > 1) {
            NodoArbol izquierdo = colaPrioridad.poll();
            NodoArbol derecho = colaPrioridad.poll();

            NodoArbol padre = new NodoArbol(null);
            padre.izquierdo = izquierdo;
            padre.derecho = derecho;

            colaPrioridad.add(padre);
        }

        raiz = colaPrioridad.poll();
    }

    public void construirHuffman(ArrayList<PacienteVacunado> pacientes) {
        PriorityQueue<NodoArbol> colaPrioridad = new PriorityQueue<>((a, b) -> a.paciente.getCodDoc().compareTo(b.paciente.getCodDoc()));

        // Crear nodos iniciales para cada paciente
        for (PacienteVacunado paciente : pacientes) {
            colaPrioridad.add(new NodoArbol(paciente));
        }

        // Construir el árbol de Huffman
        while (colaPrioridad.size() > 1) {
            NodoArbol izquierdo = colaPrioridad.poll();
            NodoArbol derecho = colaPrioridad.poll();

            NodoArbol padre = new NodoArbol(null);
            padre.izquierdo = izquierdo;
            padre.derecho = derecho;

            colaPrioridad.add(padre);
        }

        raiz = colaPrioridad.poll();
    }

    public void construirCodigos() {
        construirCodigosRec(raiz, "");
    }

    private void construirCodigosRec(NodoArbol nodo, String codigo) {
        if (nodo != null) {
            if (nodo.paciente != null) {
                nodo.paciente.setCodigoHuffman(codigo);
            }

            construirCodigosRec(nodo.izquierdo, codigo + "0");
            construirCodigosRec(nodo.derecho, codigo + "1");
        }
    }

    public void imprimirCodigos() {
        imprimirCodigosRec(raiz);
    }

    private void imprimirCodigosRec(NodoArbol nodo) {
        if (nodo != null) {
            if (nodo.paciente != null) {
                System.out.println("CodDoc: " + nodo.paciente.getCodDoc() + " Código Huffman: " + nodo.paciente.getCodigoHuffman());
            }

            imprimirCodigosRec(nodo.izquierdo);
            imprimirCodigosRec(nodo.derecho);
        }
    }

    public String obtenerCodigoEncriptado(String codDoc) {
        StringBuilder codigoEncriptado = new StringBuilder();
        obtenerCodigoEncriptadoRec(raiz, codDoc, codigoEncriptado);
        return codigoEncriptado.toString();
    }

    
    private boolean obtenerCodigoEncriptadoRec(NodoArbol nodo, String codDoc, StringBuilder codigoEncriptado) {
    if (nodo != null && nodo.paciente != null) {
        if (nodo.paciente.getCodDoc().equals(codDoc)) {
            codigoEncriptado.append(nodo.paciente.getCodigoHuffman());
            return true;
        }

        if (obtenerCodigoEncriptadoRec(nodo.izquierdo, codDoc, codigoEncriptado) ||
            obtenerCodigoEncriptadoRec(nodo.derecho, codDoc, codigoEncriptado)) {
            return true;
        }
    }
    return false;
}
}
