package generics.curingas_delimitados.problema_1.entidades;

public class Circulo implements Forma
{
   private double raio;

   public Circulo(double raio)
   {
      this.raio = raio;
   }

   @Override
   public double area()
   {
      return Math.PI * Math.pow(raio, 2);
   }
}
