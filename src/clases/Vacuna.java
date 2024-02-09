package clases;

import java.io.*;
import java.util.*;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Vacuna implements Serializable {

    public String kit;
    public String lote;
    public String marca;
    public String efectoAdverso;

    public Vacuna() {
    }

    public Vacuna(String kit, String lote) {
        this.kit = kit;
        this.lote = lote;
    }

    public Vacuna(String kit) {
        this.kit = kit;
    }

    public Vacuna(String kit, String lote, String marca, String efectoAdverso) {
        this.kit = kit;
        this.lote = lote;
        this.marca = marca;
        this.efectoAdverso = efectoAdverso;
    }

    public String getKit() {
        return kit;
    }

    public void setKit(String kit) {
        this.kit = kit;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEfectoAdverso() {
        return efectoAdverso;
    }

    public void setEfectoAdverso(String efectoAdverso) {
        this.efectoAdverso = efectoAdverso;
    }

    public void imprimir() {
        System.out.println("Kit: " + kit);
        System.out.println("Lote: " + lote);
        System.out.println("Marca: " + marca);
        System.out.println("Efecto adverso: " + efectoAdverso);
    }

    public void escribirArchivoVacuna(String nombreArchivo) {
        Scanner leerCadenas = new Scanner(System.in);
        int eleccion = 0;
        boolean termino = false;
        boolean fin = false;
        int registrado = 0;
        Vacuna vacuna = new Vacuna();
        System.out.println("Digite los datos de la vacuna");

        try {
            File archivo = new File(nombreArchivo);
            System.out.println("Kit: ");
            String kitreg = leerCadenas.nextLine();
            if (archivo.exists()) {
                FileReader lectura = new FileReader(archivo);
                BufferedReader lector = new BufferedReader(lectura);
                String linea;
                while ((linea = lector.readLine()) != null) {
                    String conteo[] = linea.split("/");
                    Vacuna lectorVacuna = new Vacuna(conteo[0], conteo[1], conteo[2], conteo[3]);
                    if (kitreg == null ? lectorVacuna.kit == null : kitreg.equals(lectorVacuna.kit)) {
                        registrado++;
                        System.out.println("Este vacuna ya esta registrada");
                        System.out.println("------------------------------------------------");
                    }
                }
                if (registrado == 0) {
                    vacuna.setKit(kitreg);
                    System.out.println("Lote: ");
                    String lotereg = leerCadenas.nextLine();
                    vacuna.setLote(lotereg);
                    System.out.println("Marca: ");
                    while (!termino) {
                        System.out.println("Marca de la vacuna: ");
                        System.out.println("1.Pfizer");
                        System.out.println("2.Moderna");
                        System.out.println("3.Sinopharm");
                        System.out.println("4.AztraZeneca");
                        System.out.println("Escoja la vacuna suministrada: ");
                        eleccion = leerCadenas.nextInt();
                        switch (eleccion) {
                            case 1:
                                vacuna.setMarca("Pfizer");
                                termino = true;
                                break;
                            case 2:
                                vacuna.setMarca("Moderna");
                                termino = true;
                                break;
                            case 3:
                                vacuna.setMarca("Sinopharm");
                                termino = true;
                                break;
                            case 4:
                                vacuna.setMarca("AztraZeneca");
                                termino = true;
                                break;
                            default:
                                System.out.println("Digite una de las 4 opciones (1,2,3,4)");
                        }
                    }
                    while (!fin) {
                        System.out.println("Efecto adverso: ");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        eleccion = leerCadenas.nextInt();
                        switch (eleccion) {
                            case 1:
                                vacuna.setEfectoAdverso("si");
                                fin = true;
                                break;
                            case 2:
                                vacuna.setEfectoAdverso("no");
                                fin = true;
                                break;
                            default:
                                System.out.println("Digite una de las 2 opciones, o 1 o 2");
                        }
                    }

                    try {
                        FileWriter escritor;
                        BufferedWriter escriba;
                        if (archivo.exists()) {
                            escritor = new FileWriter(archivo, true);
                            escriba = new BufferedWriter(escritor);
                            escriba.newLine();
                            escriba.write(vacuna.kit + "/" + vacuna.lote + "/" + vacuna.marca + "/" + vacuna.efectoAdverso);
                        } else {
                            escritor = new FileWriter(archivo, true);
                            escriba = new BufferedWriter(escritor);
                            escriba.write(vacuna.kit + "/" + vacuna.lote + "/" + vacuna.marca + "/" + vacuna.efectoAdverso);
                        }
                        escriba.close();
                        escritor.close();

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            } else {
                FileReader lectura = new FileReader(archivo);
                BufferedReader lector = new BufferedReader(lectura);
                String linea;
                while ((linea = lector.readLine()) != null) {
                    String conteo[] = linea.split("/");
                    Vacuna lectorVacuna = new Vacuna(conteo[0], conteo[1], conteo[2], conteo[3]);
                    if (kitreg == null ? lectorVacuna.kit == null : kitreg.equals(lectorVacuna.kit)) {
                        registrado++;
                        System.out.println("Este vacuna ya esta registrada");
                        System.out.println("------------------------------------------------");
                    }
                }
                if (registrado == 0) {
                    vacuna.setKit(kitreg);
                    System.out.println("Lote: ");
                    String lotereg = leerCadenas.nextLine();
                    vacuna.setLote(lotereg);
                    System.out.println("Marca: ");
                    while (!termino) {
                        System.out.println("Marca de la vacuna: ");
                        System.out.println("1.Pfizer");
                        System.out.println("2.Moderna");
                        System.out.println("3.Sinopharm");
                        System.out.println("4.AztraZeneca");
                        System.out.println("Escoja la vacuna suministrada: ");
                        eleccion = leerCadenas.nextInt();
                        switch (eleccion) {
                            case 1:
                                vacuna.setMarca("Pfizer");
                                termino = true;
                                break;
                            case 2:
                                vacuna.setMarca("Moderna");
                                termino = true;
                                break;
                            case 3:
                                vacuna.setMarca("Sinopharm");
                                termino = true;
                                break;
                            case 4:
                                vacuna.setMarca("AztraZeneca");
                                termino = true;
                                break;
                            default:
                                System.out.println("Digite una de las 4 opciones (1,2,3,4)");
                        }
                    }
                    while (!fin) {
                        System.out.println("Efecto adverso: ");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        eleccion = leerCadenas.nextInt();
                        switch (eleccion) {
                            case 1:
                                vacuna.setEfectoAdverso("si");
                                fin = true;
                                break;
                            case 2:
                                vacuna.setEfectoAdverso("no");
                                fin = true;
                                break;
                            default:
                                System.out.println("Digite una de las 2 opciones, o 1 o 2");
                        }
                    }

                    try {
                        FileWriter escritor;
                        BufferedWriter escriba;
                        if (archivo.exists()) {
                            escritor = new FileWriter(archivo, true);
                            escriba = new BufferedWriter(escritor);
                            escriba.newLine();
                            escriba.write(vacuna.kit + "/" + vacuna.lote + "/" + vacuna.marca + "/" + vacuna.efectoAdverso);
                        } else {
                            escritor = new FileWriter(archivo, true);
                            escriba = new BufferedWriter(escritor);
                            escriba.write(vacuna.kit + "/" + vacuna.lote + "/" + vacuna.marca + "/" + vacuna.efectoAdverso);
                        }
                        escriba.close();
                        escritor.close();

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
            System.out.println("------------------------------------------------");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void mostrarVacunaEspecifica(String nombreArchivo) {
        Scanner leerCadenas = new Scanner(System.in);
        int cont = 0;
        try {
            File archivo = new File(nombreArchivo);
            System.out.println("Digite el kit de la vacuna a buscar: ");
            String kitBuscado = leerCadenas.nextLine();
            if (archivo.exists()) {
                FileReader lectura = new FileReader(archivo);
                BufferedReader lector = new BufferedReader(lectura);
                String linea;
                while ((linea = lector.readLine()) != null) {
                    String conteo[] = linea.split("/");
                    Vacuna vacuna = new Vacuna(conteo[0], conteo[1], conteo[2], conteo[3]);
                    if (kitBuscado == null ? vacuna.kit == null : kitBuscado.equals(vacuna.kit)) {
                        vacuna.imprimir();
                        cont++;
                    }
                }
            } else {
                System.out.println("No hay archivo para leer");
            }
            if (cont == 0) {
                System.out.println("Esta vacuna nunca fue registrada");
            }
            System.out.println("------------------------------------------------");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void leerArchivoVacuna(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            if (archivo.exists()) {
                FileReader lectura = new FileReader(archivo);
                BufferedReader lector = new BufferedReader(lectura);
                String linea;
                while ((linea = lector.readLine()) != null) {
                    String conteo[] = linea.split("/");
                    Vacuna vacuna = new Vacuna(conteo[0], conteo[1], conteo[2], conteo[3]);
                    vacuna.imprimir();
                    System.out.println("------------------------------------------------");
                }
            } else {
                System.out.println("No hay archivo para leer");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void informeCantidadEfectosAdversos(String nombreArchivo) {
        Scanner leerCadenas = new Scanner(System.in);
        int numerosSi = 0;
        int numerosNo = 0;
        try {
            File salida = new File(nombreArchivo);
            if (salida.exists()) {
                FileReader lectura = new FileReader(salida);
                BufferedReader lector = new BufferedReader(lectura);
                String linea;
                while ((linea = lector.readLine()) != null) {
                    String conteo[] = linea.split("/");
                    Vacuna vacuna = new Vacuna(conteo[0], conteo[1], conteo[2], conteo[3]);
                    if ("si".equals(vacuna.efectoAdverso)) {
                        numerosSi = numerosSi + 1;
                    } else {
                        numerosNo = numerosNo + 1;
                    }
                }
                System.out.println("------------------------------------------------");
            } else {
                System.out.println("No hay archivo para leer");
            }
            System.out.println("Cantidad de efectos adversos: " + numerosSi + " de " + (numerosSi + numerosNo));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

//    public void mostrarMenuVacuna() {
//        Vacuna vacuna = new Vacuna();
//        boolean salir = false;
//        Scanner sn = new Scanner(System.in);
//        int opcion;
//        while (!salir) {
//            System.out.println("Registrando la vacuna");
//            escribirArchivoVacuna("archivo\\archivoVacuna.txt");
//            System.out.println("¿Desea ver la cantidad de efecots adversos?");
//            while (!salir) {
//                System.out.println("1.Si");
//                System.out.println("2.No");
//                System.out.println("3.Salir");
//                System.out.println("Seleccione una opcion: ");
//                opcion = sn.nextInt();
//                switch (opcion) {
//                    case 1:
//                        vacuna.informeCantidadEfectosAdversos("archivo\\archivoVacuna.txt");
//                        System.out.println("¿Desea salir?");
//                        while (!salir) {
//                            System.out.println("1.Si");
//                            System.out.println("2.No");
//                            System.out.println("Seleccione una opcion: ");
//                            opcion = sn.nextInt();
//                            switch (opcion) {
//                                case 1:
//                                    salir = true;
//                                    break;
//                                case 2:
//                                    mostrarMenuVacuna();
//                                    salir = true;
//                                    break;
//                                default:
//                                    System.out.println("Las opciones son del 1 al 2, solo numeros enteros");
//                            }
//                        }
//                        salir = true;
//                        break;
//                    case 2:
//                        System.out.println("¿Desea salir?");
//                        while (!salir) {
//                            System.out.println("1.Si");
//                            System.out.println("2.No");
//                            System.out.println("Seleccione una opcion: ");
//                            opcion = sn.nextInt();
//                            switch (opcion) {
//                                case 1:
//                                    salir = true;
//                                    break;
//                                case 2:
//                                    mostrarMenuVacuna();
//                                    salir = true;
//                                    break;
//                                default:
//                                    System.out.println("Las opciones son del 1 al 2, solo numeros enteros");
//                            }
//                        }
//                        salir = true;
//                        break;
//                    case 3:
//                        salir = true;
//                        break;
//                    default:
//                        System.out.println("Las opciones son del 1 al 3, solo numeros enteros");
//                }
//            }
//        }
//    }
//
//    public void mostrarMenuVacunaTest() {
//        Vacuna vacuna = new Vacuna();
//        boolean salir = false;
//        Scanner sn = new Scanner(System.in);
//        int opcion;
//        while (!salir) {
//            System.out.println("Registrando la vacuna");
//            System.out.println("1.Registrar nueva vacuna");
//            System.out.println("2.Mostrar todas las vacunas registradas");
//            System.out.println("3.Mostrar los datos de una vacuna especifica");
//            System.out.println("4.Mostrar cantidad de efectos adversos");
//            System.out.println("5.Salir");
//            System.out.println("Seleccione una opcion: ");
//            try {
//                opcion = sn.nextInt();
//                switch (opcion) {
//                    case 1:
//                        vacuna.escribirArchivoVacuna("archivo\\archivoVacuna.txt");
//                        break;
//                    case 2:
//                        vacuna.leerArchivoVacuna("archivo\\archivoVacuna.txt");
//                        break;
//                    case 3:
//                        vacuna.mostrarVacunaEspecifica("archivo\\archivoVacuna.txt");
//                        break;
//                    case 4:
//                        vacuna.informeCantidadEfectosAdversos("archivo\\archivoVacuna.txt");
//                        break;
//                    case 5:
//                        salir = true;
//                        break;
//                    default:
//                        System.out.println("Las opciones son del 1 al 5, solo numeros enteros");
//                }
//            } catch (InputMismatchException e) {
//                System.out.println("Las opciones son del 1 al 5, solo numeros enteros");
//                sn.next();
//            }
//        }
//    }
//
//    private List<Vacuna> leerVacunasDesdeArchivo(File archivo) throws IOException {
//        List<Vacuna> vacunas = new ArrayList<>();
//
//        FileReader lectura = new FileReader(archivo);
//        BufferedReader lector = new BufferedReader(lectura);
//        String linea;
//
//        while ((linea = lector.readLine()) != null) {
//            String[] conteo = linea.split("/");
//            Vacuna vacuna = new Vacuna(desencriptar(conteo[0]), desencriptar(conteo[1]), desencriptar(conteo[2]), desencriptar(conteo[3]));
//            vacunas.add(vacuna);
//        }
//
//        lector.close();
//        lectura.close();
//
//        return vacunas;
//    }

//    private boolean existeVacuna(List<Vacuna> vacunas, String kit) {
//        for (Vacuna vacuna : vacunas) {
//            if (desencriptar(vacuna.getKit()).equals(kit)) {
//                return true;
//            }
//        }
//        return false;
//    }

//    private void guardarVacunasEnArchivo(List<Vacuna> vacunas, File archivo) throws IOException {
//        FileWriter escritor = new FileWriter(archivo);
//        BufferedWriter escriba = new BufferedWriter(escritor);
//
//        for (Vacuna vacuna : vacunas) {
//            escriba.write(encriptar(vacuna.getKit()) + "/" + encriptar(vacuna.getLote()) + "/" + encriptar(vacuna.getMarca()) + "/" + encriptar(vacuna.getEfectoAdverso()));
//            escriba.newLine();
//        }
//
//        escriba.close();
//        escritor.close();
//    }

//    private String seleccionarMarca(Scanner leerCadenas) {
//        while (true) {
//            System.out.println("Marca de la vacuna: ");
//            System.out.println("1. Pfizer");
//            System.out.println("2. Moderna");
//            System.out.println("3. Sinopharm");
//            System.out.println("4. AztraZeneca");
//            System.out.println("Escoja la vacuna suministrada: ");
//            int eleccion = leerCadenas.nextInt();
//            leerCadenas.nextLine(); // Consumir la nueva línea después de leer el entero
//
//            switch (eleccion) {
//                case 1:
//                    return encriptar("Pfizer");
//                case 2:
//                    return encriptar("Moderna");
//                case 3:
//                    return encriptar("Sinopharm");
//                case 4:
//                    return encriptar("AztraZeneca");
//                default:
//                    System.out.println("Digite una de las 4 opciones (1, 2, 3, 4)");
//            }
//        }
//    }
//
//    private String seleccionarEfectoAdverso(Scanner leerCadenas) {
//        while (true) {
//            System.out.println("Efecto adverso: ");
//            System.out.println("1. Si");
//            System.out.println("2. No");
//            int eleccion = leerCadenas.nextInt();
//            leerCadenas.nextLine(); // Consumir la nueva línea después de leer el entero
//
//            switch (eleccion) {
//                case 1:
//                    return encriptar("si");
//                case 2:
//                    return encriptar("no");
//                default:
//                    System.out.println("Digite una de las 2 opciones, 1 o 2");
//            }
//        }
//    }
//
//    public String encriptar(String texto) {
//        Encoder encoder = Base64.getEncoder();
//        return encoder.encodeToString(texto.getBytes());
//    }
//
//    public String desencriptar(String textoEncriptado) {
//        Decoder decoder = Base64.getDecoder();
//        byte[] bytesDesencriptados = decoder.decode(textoEncriptado);
//        return new String(bytesDesencriptados);
//    }
    
}
