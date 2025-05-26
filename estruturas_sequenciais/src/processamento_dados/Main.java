package processamento_dados;

// Módulo 04 / Capítulo 02 / aula 06 - Processamento de dados e casting em Java

public class Main
{
   public static void main(String[] args)
   {
      int a, b;
      double resultado;

      a = 5;
      b = 2;

      resultado = (double) a / b;

      System.out.println(resultado);

      double c = 5.0;
      int d;

      d = (int) a;

      System.out.println(d);
   }
}
