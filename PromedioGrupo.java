import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioGrupo{

    /*Programa que calcula el promedio de un grupo
    *El tamaño del grupo es N
    *Las calificaciones se leen y se almacenan en un arreglo de tamaño N
    */

        //arreglo de un tipo de dato abstracto
    public static estudiante[] estudiante;

        //Para lectura de datos
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    public static void leer_estudiante() throws IOException{
        String matricula, nombre;
        for ( int i = 0; i < estudiante.length; i++){
            System.out.println("------------------------------------------------------------------");
            System.out.println("Informacion del estudiante: [" + (i+0) + "]");
            System.out.println("Maticula: ");
            entrada = bufer.readLine();
            matricula = entrada;
            System.out.println("Nombre: ");
            entrada = bufer.readLine();
            nombre = entrada;
            estudiante e = new estudiante(matricula, nombre);
            System.out.println("Escriba calificaciones de estructura de datos: ");
            entrada = bufer.readLine();
            e.setEstructuras(Double.parseDouble(entrada));
            System.out.println("Escriba calificacion de evaluacion: ");
            entrada = bufer.readLine();
            e.setEvaluacion(Double.parseDouble(entrada));
            System.out.println("Escriba calificacion de ingles: ");
            entrada = bufer.readLine();
            e.setIngles(Double.parseDouble(entrada));
            e.setPromedio();
            estudiante[i] = e; //Agregamos un objeto Estudiante al arreglo 
        }
    }

    public static void main (String[] args) throws IOException{
    int N;
    //arreglo de tipo de dato primitivo (double)
    double[] calificaciones; //arreglo de calificaciones
    double suma = 0; //para sumar calificaciones
    double promedio; //El promedio del grupo
    }
        

        System.out. println("Programma que calcula el promedio de un grupo");
        System.out.println("Escribe tamaño del grupo: ");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);

        //construyendo el arreglo de estudiantes
        estudiante = new estudiante[N];

        //construimos el arreglo de calificaciones
        calificaciones = new double[N];
        //Leer as calificaciones de cada alumno
        // for ( int i = 0; i < calificaciones.length; i++ ){
        //     System.out.println("Escriba la calificacion del alumno " + (i+1) + ": " );
        //     entrada = bufer.readLine();
        //     calificaciones[i] = Double.parseDouble(entrada);
        //     suma += calificaciones[i];
        //     }
        //     promedio = suma / N;



        
        System.out.println("Las calificaciones del grupo son: ");
        for (int i = 0; i < calificaciones.length; i++){
                System.out.println(calificaciones[i]);
            }
            
            System.out.println("El promedio del grupo es: " + promedio);

    }
}