import java.io.File;
import java.util.HashMap;

import javax.swing.JFileChooser;

import Model.Producto;

public class principal {
    public static void main(String[] args) {
        //Clase de que ingresas un String y te lo devulve al revés
        String x = finalClase.reverse("Hola soy Gokú");
        System.out.println(x);

        //Crear un Array unidimensional y recorrerlo
        finalClase.lista_string();

        //Array bidimensional
        finalClase.mostrarArrayBidimensional();

        //Vector
        finalClase.mostrar_vector();

        //Problemas de la clase vector
        //Que al momento de editar algun objeto dentro del vector este arrojara error si estamos realizando 2 dilos y ambos ejecutan la kisma operación, esto en las apliaciones del mundo real no es posible debido a que debe actualizarse constante y el objeto es accedido y su información es editada o ejecutada de manera simultanea

        //Usar arraylist and linkedlist
        finalClase.mostrar_Array();

        // Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

        finalClase.crearlistaInt();

        // Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
        try {
            finalClase.divide(5,1);
            
        } catch (Exception e) {
            System.out.println("ocurrio algo");
        }

        // Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

        finalClase.InputOutput();

        finalClase.programa();


        //************************* */
        File origen;
        JFileChooser ventana = new JFileChooser();
        ventana.showOpenDialog(null);
        origen = ventana.getSelectedFile();

        System.out.println("El archivo es: "+origen);
        System.out.println(ventana.getCurrentDirectory());

        HashMap<Integer, Producto>hash_productos = new HashMap<>();

        finalClase.llenarLista(origen, hash_productos);
    }

    
}