package exercicios.cambio.utilitarios;

public class ConverterMoeda
{
   public static final double IOF = 0.06;
   public static double cotacao;

   public static double dolarParaReal(double dolares)
   {
      double subtotal = dolares * cotacao;
      return subtotal + (subtotal * IOF);
   }
}
