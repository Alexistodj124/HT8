import java.io.*;
import java.util.*;


public class main {
    public static void main(String[] args) throws IOException {
        archivo arch = new archivo("procesos.txt");
        ArrayList<proceso> lista=arch.leerArchivo();
        ArrayList<String> listaT=new ArrayList<String>();

        for(int i=0;i<lista.size();i++){
            listaT.add(lista.get(i).toString());
        }

        listaT = ordenar(listaT);

        for(int i=0;i<listaT.size();i++){
            System.out.println(listaT.get(i));
            System.out.println("\n");
        }
         


    }
    public static ArrayList<String> ordenar(ArrayList<String> datos) {

        Collections.sort(datos, new Comparator<String>() {
            public int compare(String linea1, String linea2) {
                String[] campos1 = linea1.split(",");
                String[] campos2 = linea2.split(",");
                int ultimoValor1 = Integer.parseInt(campos1[campos1.length - 1].substring(3));
                int ultimoValor2 = Integer.parseInt(campos2[campos2.length - 1].substring(3));
                return Integer.compare(ultimoValor1, ultimoValor2);
            }
        });
        return datos;
    }
    
}