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

            System.out.println("Ingrese la calificacion entre el 1 al 10 del estudiante " + (i + 1) + ": ");
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
    public static void listarEstudiantesNotas() {
        System.out.println("Lista de estudiantes segun sus notas: ");
        int contS=0,contA=0,contB=0,contC=0,contF=0,tramposo=0;
        for (Estudiantes estudiante:listaEstudiantes) {//para acabar el ciclo no tiene que haber mas objetos en el array
            String nombre=estudiante.nombre;
            String apellido=estudiante.apellido;
            int calificacion=estudiante.calificacion;
            if (calificacion==10) {
                System.out.println("Sobresaliente "+nombre+" "+apellido+"\n" +
                        "Calificacion: "+calificacion);
                contS++;
            }else if (calificacion<=9&&calificacion>=8){
                System.out.println("Satisfactorio "+nombre+" "+apellido+"\n" +
                        "Calificacion: "+calificacion);
                contA++;
            }else if (calificacion<=7&&calificacion>=6){
                System.out.println("Bueno "+nombre+" "+apellido+"\n" +
                        "Calificacion: "+calificacion);
                contB++;
            }else if (calificacion<=5&&calificacion>=4){
                System.out.println("Deficiente "+nombre+" "+apellido+"\n" +
                        "Calificacion: "+calificacion);
                contC++;
            }else if (calificacion<=3&&calificacion>=1){
                System.out.println("Reprobado "+nombre+" "+apellido+"\n" +
                        "Calificacion: "+calificacion);
                contF++;
            }else {
                System.out.println("Nota no valida"+nombre+" "+apellido);
                tramposo++;
            }

        }

        System.out.println("Total de notas\n" +
                "Sobresalientes "+contS+"\n" +
                "Satisfactorios "+contA+"\n" +
                "Buenos "+contB+"\n" +
                "Deficientes "+contC+"\n" +
                "Reprobados "+contF+"\n" +
                "Trampas detectadas "+tramposo);
    }
}
