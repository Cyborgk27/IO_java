import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import Model.Producto;

public class finalClase {
    public static String reverse(String Str) {
        StringBuilder x = new StringBuilder(Str);
        return x.reverse().toString();
    }

    public static void lista_string() {
        List<String> lista_String = new ArrayList<>();

        lista_String.add("Obrero n: ");
        lista_String.add("Obrero n: ");
        lista_String.add("Obrero n: ");
        lista_String.add("Obrero n: ");
        lista_String.add("Obrero n: ");
        int i = 0;
        for (String str : lista_String) {
            i++;
            System.out.println(str + " " + i);
        }
    }

    public static void mostrarArrayBidimensional() {
        int Array_bidimensional[][] = new int[3][3];

        Array_bidimensional[0][0] = 1;
        Array_bidimensional[0][1] = 2;
        Array_bidimensional[0][2] = 3;
        Array_bidimensional[1][0] = 4;
        Array_bidimensional[1][1] = 5;
        Array_bidimensional[1][2] = 6;
        Array_bidimensional[2][0] = 7;
        Array_bidimensional[2][1] = 8;
        Array_bidimensional[2][2] = 9;
        for (int i = 0; i < Array_bidimensional.length; i++) {
            for (int j = 0; j < Array_bidimensional[i].length; j++) {
                System.out.println("posición i: " + i + " j: " + j + " es: " + Array_bidimensional[i][j]);
            }
        }

    }

    public static void mostrar_vector() {
        Vector<String> vector_string = new Vector<>();

        vector_string.add("Soy el elemento 1");
        vector_string.add("Soy el elemento 2");
        vector_string.add("Soy el elemento 3");
        vector_string.add("Soy el elemento 4");
        vector_string.add("Soy el elemento 5");

        System.out.println("Vector normal");
        mostrar(vector_string);

        vector_string.remove(1);
        vector_string.remove(1);

        System.out.println("Vector editado");
        mostrar(vector_string);
    }

    private static void mostrar(Vector<String> vector_string) {
        for (String str : vector_string) {
            System.out.println(str);
        }
    }

    public static void mostrar_Array() {
        ArrayList<String> arrayList_string = new ArrayList<>();

        // añadimos información
        arrayList_string.add("String 1");
        arrayList_string.add("String 2");
        arrayList_string.add("String 3");
        arrayList_string.add("String 4");
        arrayList_string.add("String 5");

        // imprimimos el ArrayList
        System.out.println("Array original");
        imprimirArray(arrayList_string);

        // Copiamos a linkedlist
        LinkedList<String> linked_string = new LinkedList<>(arrayList_string);

        // mostramos la linked list
        imprimir_linked(linked_string);
    }

    private static void imprimir_linked(LinkedList<String> linked_string) {
        System.out.println("Lista Linked");
        for (String str : linked_string) {
            System.out.println(str);
        }
    }

    private static void imprimirArray(ArrayList<String> arrayList_string) {
        for (String str : arrayList_string) {
            System.out.println(str);
        }
    }

    public static void crearlistaInt() {
        ArrayList<Integer> lista_integer = new ArrayList<>();

        agregar_numeros(lista_integer);
        mostrar_lista_numeros(lista_integer);
        eliminiar_numeros_pares(lista_integer);
        mostrar_lista_numeros(lista_integer);

    }

    private static void mostrar_lista_numeros(ArrayList<Integer> lista_integer) {
        System.out.println("La lista es: ");
        for (Integer i : lista_integer) {
            System.out.println(i);
        }
        System.out.println("Tamaño: " + lista_integer.size());
    }

    private static void eliminiar_numeros_pares(ArrayList<Integer> lista_integer) {
        for (int i = 0; i < lista_integer.size(); i++) {
            determinar_par(lista_integer, i);

        }
    }

    private static void determinar_par(ArrayList<Integer> lista_integer, int i) {
        if (lista_integer.get(i) % 2 == 0) {
            lista_integer.remove(i);
        }
    }

    private static void agregar_numeros(ArrayList<Integer> lista_integer) {
        for (int i = 0; i < 10; i++) {
            lista_integer.add(i + 1);
        }
        System.out.println("Tamaño de lista :" + lista_integer.size());
    }

    public static int divide(int a, int b) throws ArithmeticException {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        return result;

    }

    public static void InputOutput() {
        try {
            String ruta = "src/fichero_ejemplo.txt";
            Path fuente = Paths.get(ruta);
            Path destino= Paths.get("src/copia.txt");

            Files.copy(fuente, destino, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void programa (){
        try {
            InputStream fichero = new FileInputStream("src/ficheros/productos.txt");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);

            try {
                int dato = fichero.read();
                while(dato != -1){
                    System.out.print
                    ((char)dato);
                    dato = ficheroBuffer.read();
                }
                ficheroBuffer.close();
            } catch (IOException e) {
                System.out.println("No se lee nada perro pendejo"+e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo hijode tu puta madre"+e.getMessage());
        }
    }

    public static void llenarLista(File origen, HashMap<Integer, Producto> hash_productos) {
        try{
            if(origen.exists()){
                FileReader fr = new FileReader(origen);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                double precio;
                int codigo;
                String color;
                String marca;
                while((linea = br.readLine()) !=null){
                    Producto p = new Producto();

                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
