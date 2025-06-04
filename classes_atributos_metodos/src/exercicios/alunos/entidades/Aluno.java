package exercicios.alunos.entidades;

public class Aluno
{
   public String nome;
   public double nota1;
   public double nota2;
   public double nota3;

   public double notaFinal()
   {
      return nota1 + nota2 + nota3;
   }

   public void aprovacao()
   {
      if (notaFinal() < 60)
      {
         System.out.println("REPROVADO");
         System.out.printf("FALTARAM %.2f PONTOS", (60.0 - notaFinal()));
      }
      else
      {
         System.out.println("APROVADO");
      }
   }
}
