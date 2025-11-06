import java.io.*;
import java.nio.file.*;  // Paths y Files
import java.util.ArrayList;


public class Main {

    // Fichero binario donde guardar/leer la lista serializada
    private static final Path FICHERO = Paths.get("personas.dat");

    public static void main(String[] args) {
        // Realiza las siguientes tareas, agrupa en funciones cuando veas oportuno
        //TODO: 1) Crear una lista de personas
        //TODO: 2) Añadir personas (por consola)
        //TODO: 3) Serializar la lista al fichero
        //TODO: 4) Deserializar la lista desde el fichero
        //TODO: 5) Imprimir por consola las personas deserializadas

        Persona persona = new Persona("Manolo", "ROCOSO", 29);
        ArrayList arrayList = new ArrayList<Persona>();

        serializacion(persona);
        desSerializacion();

    }

    private static void serializacion(Persona persona) {
        try {
            FileOutputStream fos = new FileOutputStream("personas.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(persona);
            oos.close();
            System.out.println("Objeto Serializado Correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void desSerializacion() {
        try {
            FileInputStream fis = new FileInputStream("personas.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Persona personaLeida = (Persona) ois.readObject();

            System.out.println("Objeto deserializado correctamente: " + personaLeida);
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}