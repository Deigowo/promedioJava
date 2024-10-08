import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PromedioGrupo {


     public static Estudiante[] estudiantes;
     public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
     public static String entrada;

     public static void leerEstudiantes() throws IOException{
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

     public static void imprimirEstudiantes() {
        for ( Estudiante e : estudiantes) {
            System.out.println(e.toString());
        }
     }

     public static double calcularpromedioGrupo() {
        double suma = 0;
        for (Estudiante e : estudiantes) {
            suma += e.getPromedio();
        }
        return suma / estudiantes.length;
     }

    public static void main(String[] args) throws IOException {
        int N; // El tamaño del arreglo
        double[] calificaciones; // arreglo de calificaciones
        double suma = 0; // para sumar calificaciones
        double promedio; // El promedio del grupo

        System.out.println("Programa que calcula el primedio de un grupo");
        System.out.println("Escribe el tamaño del grupo: ");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);

        // construyendo el arreglo de estudiantes
        estudiantes = new Estudiante[N];

        // Lectura de la información de estudiantes
        leerEstudiantes();

        // Imprimir el contenido del arreglo estudiantes
        imprimirEstudiantes();

        // Calcular primedio grupo
        promedio = calcularpromedioGrupo();

        // construimos el arreglo de calificaiones
        calificaciones = new double[N];

        System.out.println("El promedio del grupo es: " + promedio);
    }
}