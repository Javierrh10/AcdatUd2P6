import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private String telefono;

    /*
     * TODO: Crea el constructor de la clase Persona que reciba como parámetro una cadena
     * de caracteres con los valores separados por comas (,)
     * Ejemplo de cadena: "Ana,Perez,25,ana.perez@example.com,+34911111111"
     *
     * El constructor debe:
     * 1. Separar los valores usando split(",").
     * 2. Asignar los valores a los atributos correspondientes.
     * 3. Convertir el tercer valor (edad) a entero.
     * 4. No lanzar excepciones. Si algo falla, asigna valores por defecto.
     */

    public Persona(String csvData) {
        String[] values = csvData.split(",");
        try {
            this.nombre = values[0];
        } catch (Exception e) {
            this.nombre = "";
        }
        try {
            this.apellido = values[1];
        } catch (Exception e) {
            this.apellido = "";
        }
        try {
            this.edad = Integer.parseInt(values[2]);
        } catch (Exception e) {
            this.edad = 0;
        }
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
