import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estudiantes {//definimos una clase publica estudiantes
    private String nombre;//definimos atributo nombre
    private String apellido;//definimos atributo apellido
    private int calificacion;//definimos atriburo calificacion

    public Estudiantes(String nombre, String apellido, int calificacion) {//constructor con parametros
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacion = calificacion;

    }

    public Estudiantes() {

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

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public static List<Estudiantes> listaEstudiantes=new ArrayList<>();//para crear un array que tenga nombre listaEstudiantes para usarlo en los metodos siguientes

    public static void crearListEstudiantes() {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = sc.nextLine();//pedimos cada uno de los atributos que nos pide el objeto

            System.out.println("Ingrese el apellido del estudiante " + (i + 1) + ": ");
            String apellido = sc.nextLine();

            System.out.println("Ingrese la calificacion del estudiante " + (i + 1) + ": ");
            int calificacion = Integer.parseInt(sc.nextLine());//consumir caracter de nueva linea

            Estudiantes estudiante = new Estudiantes(nombre, apellido, calificacion);//Creamos un objeto con los atributos dados con anterioridad
            listaEstudiantes.add(estudiante);//Los metemos en el array listaEstudiantes
        }
    }

    public static void listarEstudiantes() {
    System.out.println("Lista de estudiantes: ");
    for (Estudiantes estudiante:listaEstudiantes) {//para acabar el ciclo no tiene que haber mas objetos en el array
        System.out.println("Nombre: "+estudiante.nombre+" "+estudiante.apellido+"\n"+//Presentamos por pantalla todos los objetos del array
        "Calificacion: "+estudiante.calificacion);
    }
    }
}
