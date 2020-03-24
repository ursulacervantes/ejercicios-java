import java.util.Scanner;

public class Alumno {
  public static void main(String[] args) {

    Scanner entrada = new Scanner (System.in);

    System.out.print("¿Qué nota has sacado en el último examen? ");
    String line = entrada.nextInt();
    double nota = entrada.nextDouble();

    if (nota >= 13) {
      System.out.println("¡Enhorabuena!, ¡has aprobado!");
    } else {
      System.out.println("Lo siento, has reprobado.");
    }
  }
}
