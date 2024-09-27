import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PromedioGrupo {

    /*
     * Programa que calcula el primedio de un grupo
     * El tamaño del grupo es N
     * Las calificaciones se leen y se almacenan en un arreglo de tamaño N
     */

    public static void main(String[] args) throws IOException {
        int N; // El tamaño del arreglo
        // Para lectura de datos
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double[] calificaciones; // arreglo de calificaciones
        double suma = 0; // para sumar calificaciones
        double promedio; // El primedio del grupo

        System.out.println("Programa que calcula el primedio de un grupo");
        System.out.println("Escribe el tamaño del grupo: ");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);

        // construimos el arreglo de calificaiones
        calificaciones = new double[N];

        // Leer las calificaiciones de cada alumno
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Escriba la calificacion del alumno " + (i + 1) + ": ");
            entrada = bufer.readLine();
            calificaciones[i] = Double.parseDouble(entrada);
            suma += calificaciones[i];
        }
        promedio = suma / N;
        System.out.println("Las calificaciones del grupo son: ");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println(calificaciones[i]);
        }
        System.out.println("El promedio del grupo es: " + promedio);
    }
}