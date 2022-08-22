import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class App {
    public static void main(String[] args) throws Exception {
        
        try {
            InputStream fichero = new FileInputStream("C:/Users/slend/Desktop/Trabajos/IO_java/src/fichero_ejemplo");
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
}
