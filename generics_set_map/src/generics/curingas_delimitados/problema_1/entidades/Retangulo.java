package generics.curingas_delimitados.problema_1.entidades;

public class Retangulo implements Forma
{
   private double altura;
   private double largura;

   public Retangulo(double altura, double largura)
   {
      this.altura = altura;
      this.largura = largura;
   }

   @Override
   public double area()
   {
      return altura * largura;
   }
}
