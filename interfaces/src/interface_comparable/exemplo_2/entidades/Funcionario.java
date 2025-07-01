package interface_comparable.exemplo_2.entidades;

public class Funcionario implements Comparable<Funcionario>
{
   private String nome;
   private Double salario;

   public Funcionario(String nome, Double salario)
   {
      this.nome = nome;
      this.salario = salario;
   }

   public String getNome()
   {
      return nome;
   }

   public void setNome(String nome)
   {
      this.nome = nome;
   }

   public Double getSalario()
   {
      return salario;
   }

   public void setSalario(Double salario)
   {
      this.salario = salario;
   }

   /*
     Retorna um inteiro negativo, zero ou um inteiro positivo, pois este
     objeto é menor que, igual a ou maior que o objeto especificado.
    */
   @Override
   public int compareTo(Funcionario outro)
   {
      // Lista ordenada por ordem descrescente (-) de salário.
      return -salario.compareTo(outro.getSalario());
   }
}
