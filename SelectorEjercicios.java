import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;//Importamos la libreria Scanner
public class SelectorEjercicios { //Clase publica SelectorEjercicios
    public static void main(String[] args) {//declaramos el main donde se ejecuta todo.
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);//para que el usuario ingrese informacion por terminal
        // Menu
        System.out.println("""
                Selecciona un ejercicio:\s
                1. Mayor de Edad
                2. Comparar Números
                3. Par o Impar
                4. Factorial
                5. Números Impares (for)
                6. Números Impares (while)
                7. Día de la Semana
                8. Ejemplo de un objeto de clase Estudiante
                9.Lista de estudiantes
                10.Calculadora(seleccionando con numero)
                11.Calculadora(Seleccionando con signo)
                12.Gestion de notas estudiantes
                Ingresa el número de ejercicio que deseas ejecutar:""");//mostramos el menu por pantalla

        // Leer la opción seleccionada por el usuario
        int opcion = scanner.nextInt();//declaramos variable entera opcion y le asignamos el valor que meta el usuario
        scanner.nextLine();//Limpiar buffer
        // Ejecutar el ejercicio seleccionado
        switch (opcion) {//le damos la instruccion al switch de usar el valor de la variable opcion
            case 1:
                SelectorEjercicios.mayorDeEdad();
                break;
            case 2:
                compararNumeros();
                break;
            case 3:
                parOImpar();
                break;
            case 4:
                factorial();
                break;
            case 5:
                numerosImpares();
                break;
            case 6:
                numerosImparesWhile();
                break;
            case 7:
                diaSemana();
                break;
            case 8 :
                Estudiantes estudiante1 = new Estudiantes();
                estudiante1.setNombre("Pedro");
                estudiante1.setApellido("Gonzales");
                estudiante1.setCalificacion(9);
                System.out.println("Nombre del estudiante: "+estudiante1.getNombre()+" "+estudiante1.getApellido()+"\n"+
                        "Calificacion: "+estudiante1.getCalificacion());
                break;
            case 9:
                Estudiantes.crearListEstudiantes();//llamamos los metodos de otra clase publica de esta manera
                Estudiantes.listarEstudiantes();
                break;
            case 10:
                calculadora();
                break;
            case 11:
                calculadoraSigno();
                break;
            case 12:
                Estudiantes.crearListEstudiantes();
                Estudiantes.listarEstudiantesNotas();
                break;
            default:
                System.out.println("Opción no válida. Por favor ingresa un número del 1 al 12.");
                break;
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para el ejercicio "Mayor de Edad"
    private static void mayorDeEdad() {//se define el metodo mayorDeEdad
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }
        scanner.close();
    }

    // Método para el ejercicio "Comparar Números"
    private static void compararNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Por favor, ingresa el segundo número: ");
        int numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            System.out.println("El primer número (" + numero1 + ") es mayor que el segundo número (" + numero2 + ").");
        } else if (numero2 > numero1) {
            System.out.println("El segundo número (" + numero2 + ") es mayor que el primer número (" + numero1 + ").");
        } else {
            System.out.println("Ambos números son iguales.");
        }
        scanner.close();
    }

    // Método para el ejercicio "Par o Impar"
    private static void parOImpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número entero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        scanner.close();
    }

    // Método para el ejercicio "Factorial"
    private static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número: ");
        int numero = scanner.nextInt();
        long factorial = 1;
        int i = 1;
        while (i <= numero) {
            factorial *= i;
            i++;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
        scanner.close();
    }

    // Método para el ejercicio "Números Impares (for)"
    private static void numerosImpares() {
        Scanner scanner = new Scanner(System.in);
        int numero;
            System.out.print("Por favor, ingresa un número mayor a 10 y menor que 30: ");
            numero = scanner.nextInt();
        if(numero >= 10 && numero <= 30) {
            System.out.println("Números impares desde 1 hasta " + numero + ":");
            for (int i = 1; i <= numero; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }else {
            numerosImpares();
        }
        scanner.close();
    }

    // Método para el ejercicio "Números Impares (while)"
    private static void numerosImparesWhile() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Por favor, ingresa un número mayor a 10 y menor que 30: ");
            numero = scanner.nextInt();
        } while (numero <= 10 || numero >= 30);
        System.out.println("Números impares desde 1 hasta " + numero + ":");
        int i = 1;
        while (i <= numero) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
        scanner.close();
    }

    // Método para el ejercicio "Día de la Semana"
    private static void diaSemana() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número del 1 al 7: ");
        int numero = scanner.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido. Por favor ingresa un número del 1 al 7.");
                break;
        }
        scanner.close();
    }
    private static void calculadora(){
        Scanner scanner = new Scanner(System.in);
        int num1,num2,opcion,resultado;
        System.out.print("Por favor, ingresa el numero 1: ");
        num1 = scanner.nextInt();
        System.out.print("Por favor, ingresa el numero 2: ");
        num2 = scanner.nextInt();
        System.out.print("""
                            Que operacion desea realizar:\s
                            1.Suma
                            2.Resta
                            3.Multiplicar
                            4.Dividir
                        """);
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("El resultado de " + num1+" + "+num2+" es "+resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("El resultado de " + num1+" - "+num2+" es "+resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("El resultado de " + num1+" * "+num2+" es "+resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("El resultado de " + num1+" / "+num2+" es "+resultado);
                break;
            default:
                System.out.println("OPERACION INVALIDA");
        }
    }
    private static void calculadoraSigno(){
        Scanner scanner = new Scanner(System.in);
        int num1,num2,resultado;
        char opcion;
        System.out.print("Por favor, ingresa el numero 1: ");
        num1 = scanner.nextInt();
        System.out.print("Por favor, ingresa el numero 2: ");
        num2 = scanner.nextInt();
        System.out.print("""
                            Que operacion desea realizar:\s
                            +
                            -
                            *
                            /
                        """);
        opcion = scanner.next().charAt(0);
        switch (opcion) {
            case '+':
                resultado = num1 + num2;
                System.out.println("El resultado de " + num1+" + "+num2+" es "+resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("El resultado de " + num1+" - "+num2+" es "+resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("El resultado de " + num1+" * "+num2+" es "+resultado);
                break;
            case '/':
                resultado = num1 / num2;
                System.out.println("El resultado de " + num1+" / "+num2+" es "+resultado);
                break;
            default:
                System.out.println("OPERACION INVALIDA");
        }
    }
}
