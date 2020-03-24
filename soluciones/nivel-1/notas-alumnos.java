import java.util.Scanner;

public class Alumno {

 public static void main(String[] args) {

  Scanner entrada = new Scanner (System.in);

  String nombreAlumno;
  double evaluacion1;
  double evaluacion2;
  double evaluacion3;
  double evaluacionFinal;

  System.out.println("Nombre alumno: ");
  nombreAlumno = entrada.nextLine();

  System.out.println("Nota primera evaluación: ");
  evaluacion1 = entrada.nextDouble();

  System.out.println("Nota segunda evaluación: ");
  evaluacion2 = entrada.nextDouble();

  System.out.println("Nota tercera evaluación: ");
  evaluacion3 = entrada.nextDouble();

  evaluacionFinal = (evaluacion1 + evaluacion2 + evaluacion3)/3;

  System.out.println("La nota promedio de " + nombreAlumno + " es " + evaluacionFinal);
 }
}
