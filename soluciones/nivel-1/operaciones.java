public class Operaciones {

 public static void main(String[] args) {

  //  Hemos creado las variables con los parámetros con los que vamos a operar
  int a=10;
  int b=5;

  // Creamos las variables con los resultados de dichas operaciones
  int suma=a+b;
  int resta=a-b;
  int multiplicacion=a*b;
  int division=a/b;

  // Imprimimos los resultados en la pantalla
  System.out.println("La suma de " + a + " más "  + b + " es igual a "  + suma);
  System.out.println("La resta de " + a + " menos "  + b + " es igual a "  + resta);
  System.out.println("La multipación de " + a + " por "  + b + " es igual a "  + multiplicacion);
  System.out.println("La division de " + a + " entre "  + b + " es igual a "  + division);
 }
}
