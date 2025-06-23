package heranca.exemplo_2.entidades;

public class Retangulo extends Forma
{
   private Double lado_1;
   private Double lado_2;

   public Retangulo(Double lado_1, Double lado_2)
   {
      this.lado_1 = lado_1;
      this.lado_2 = lado_2;
   }

   public Double getLado_1()
   {
      return lado_1;
   }

   public void setLado_1(Double lado_1)
   {
      this.lado_1 = lado_1;
   }

   public Double getLado_2()
   {
      return lado_2;
   }

   public void setLado_2(Double lado_2)
   {
      this.lado_2 = lado_2;
   }

   // Método concreto implementado na subclasse concreta.
   @Override
   public Double area()
   {
      return lado_1 * lado_2;
   }
}
