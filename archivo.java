import java.util.*;
import java.io.*;
public class archivo {
    //Creacion de la clase archivo
    private ArrayList<proceso> lista;

    public archivo(String nombre) {
        this.lista = new ArrayList<proceso>();
    }

    public static int convert(String numeroStr) {
        int numeroInt;
        if (numeroStr == null){
            numeroInt = 0;
        }else {
            numeroInt = Integer.parseInt(numeroStr);
        }
        return numeroInt;
    }

    public ArrayList<proceso> leerArchivo() throws IOException {
        File archivo = new File("procesos.txt");// Lectura del archivo para poder ejecutar el programa
        FileReader lector = new FileReader(archivo);
        try (BufferedReader lectorBuffer = new BufferedReader(lector)) {
            String linea;
            while ((linea = lectorBuffer.readLine()) != null) {
                String[] lista = linea.split(",");
                if (lista.length != 3) {
                    throw new IllegalArgumentException("Esta mal escrita la linea: " + linea);
                }
                String nombreProceso = lista[0];
                String nombreUsuario = lista[1];
                int nice = convert(lista[2]);
                int prioridad = 0;

                proceso process = new proceso(nombreProceso, nombreUsuario, nice, prioridad);
                this.lista.add(process);

            }

        }catch(Exception e){System.out.println(e);}
        return this.lista;

    }
}
