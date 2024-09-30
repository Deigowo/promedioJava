import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PromedioGrupo {

    /*
     * Programa que calcula el primedio de un grupo
     * El tamaño del grupo es N
     * Las calificaciones se leen y se almacenan en un arreglo de tamaño N
     */

     public static Estudiante[] estudiantes;
     public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
     public static String entrada;

     public static void leer_estudiantes() throws IOException{
        String matricula, nombre;

        for (int i = 0; i < estudiantes.length; i++) {
           System.out.println("-------------------------------------------");
           System.out.println("Informacion del estudiante [" + (i+0) + "]");
           System.out.println("Matricula");
           entrada = bufer.readLine();
           matricula = entrada;
           System.out.println("Nombre");
           entrada = bufer.readLine();
           nombre = entrada;
           Estudiante e = new Estudiante(matricula, nombre);
           System.out.println("Escriba calificacion de Estructuras: ");
           entrada = bufer.readLine();
           e.setEstructuras(Double.parseDouble(entrada));
           System.out.println("Escriba calificacion de Evaluación: ");
           entrada = bufer.readLine();
           e.setEvaluación(Double.parseDouble(entrada));
           System.out.println("Escriba calificacion de Inglés: ");
           entrada = bufer.readLine();
           e.setIngles(Double.parseDouble(entrada));
           e.setPromedio();
           estudiantes[i] = e; // Agregamos un objeto Estudiante al arreglo
        }
     }

    public static void main(String[] args) throws IOException {
        int N; // El tamaño del arreglo
        // Para lectura de datos
        // Arreglo de un tipo de dato abstracto
        double[] calificaciones; // arreglo de calificaciones
        double suma = 0; // para sumar calificaciones
        double promedio; // El promedio del grupo

        System.out.println("Programa que calcula el primedio de un grupo");
        System.out.println("Escribe el tamaño del grupo: ");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);

        // construyendo el arreglo de estudiantes
        estudiantes = new Estudiante[N];

        // construimos el arreglo de calificaiones
        calificaciones = new double[N];

        // Leer las calificaciones de cada alumno
        // for (int i = 0; i < calificaciones.length; i++) {
        //     System.out.println("Escriba la calificacion del alumno " + (i + 1) + ": ");
        //     entrada = bufer.readLine();
        //     calificaciones[i] = Double.parseDouble(entrada);
        //     suma += calificaciones[i];
        // }
        // promedio = suma / N;


        System.out.println("Las calificaciones del grupo son: ");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println(calificaciones[i]);
        }
        System.out.println("El promedio del grupo es: " + promedio);
    }
}