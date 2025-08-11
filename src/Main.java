import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instaciando scanner
        Scanner scanner = new Scanner(System.in);

        //ACTIVIDAD 1
        System.out.println("ACTIVIDAD 1");
        System.out.println("PROMEDIO DE CALIFICACIONES");
        // Pedir al usuario que ingrese un dato
        System.out.println("Ingrese la primera nota: ");
        // Leer el dato
        int nota1 = scanner.nextInt();
        // Dato 2
        System.out.println("Ingrese la segunda nota: ");
        // Leer el dato
        int nota2 = scanner.nextInt();
        // Dato 3
        System.out.println("Ingrese la tercera nota: ");
        // Leer el dato
        int nota3 = scanner.nextInt();
        //Calculo promedio
        double promedio = (nota1 + nota2 + nota3) / 3.0;
        // Mostrar resultado
        System.out.println("El promedio del estudiante es: " + promedio);

        //ACTIVIDAD 2
        System.out.println("ACTIVIDAD 2");
        System.out.println("PERFIL DE UN USUARIO");
        // Pedir al usuario que ingrese sus datos
        scanner.nextLine();
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese su nacionalidad: ");
        String nacionalidad = scanner.nextLine();
        System.out.println("Ingrese su ocupación: ");
        String ocupacion = scanner.nextLine();
        System.out.println("Ingrese su salario mensual: ");
        int salarioMensual = scanner.nextInt();

        int anioNacimiento = 2025 - edad;

        // Mostrar resultado
        System.out.println("Nombre: " + nombre);
        System.out.println("Año de nacimiento: " + anioNacimiento);
        System.out.println("Edad: " + edad);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Ocupación: " + ocupacion);
        System.out.println("Salario mensual: " + salarioMensual);

        // Cerrar el scanner
        scanner.close();
    }
}

