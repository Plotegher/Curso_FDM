package desafio_bar_poo.entidades;

public class Conta
{
   public char genero;
   public int cerveja;
   public int espetinho;
   public int refrigerante;

   public double consumo()
   {
      return cerveja * 5.0 + espetinho * 7.0 + refrigerante * 3.0;
   }

   public double couvert()
   {
      return (consumo() > 30.0) ? 0.0 : 4.0;
   }

   public double ingresso()
   {
      return (genero == 'M') ? 10.0 : 8.0;
   }

   public double total()
   {
      return consumo() + couvert() + ingresso();
   }
}
