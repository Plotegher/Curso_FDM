package desafio_empregados_poo.entidades;

import java.util.ArrayList;
import java.util.List;

public class Departamento
{
   private String nomeDepartamento;
   private Integer diaPagamento;

   private Endereco endereco;
   private List<Empregado> empregados = new ArrayList<>();

   public Departamento(String nomeDepartamento, Integer diaPagamento, Endereco endereco)
   {
      this.nomeDepartamento = nomeDepartamento;
      this.diaPagamento = diaPagamento;
      this.endereco = endereco;
   }

   public String getNomeDepartamento()
   {
      return nomeDepartamento;
   }

   public void setNomeDepartamento(String nomeDepartamento)
   {
      this.nomeDepartamento = nomeDepartamento;
   }

   public Integer getDiaPagamento()
   {
      return diaPagamento;
   }

   public void setDiaPagamento(Integer diaPagamento)
   {
      this.diaPagamento = diaPagamento;
   }

   public Endereco getEndereco()
   {
      return endereco;
   }

   public void setEndereco(Endereco endereco)
   {
      this.endereco = endereco;
   }

   public List<Empregado> getEmpregados()
   {
      return empregados;
   }

   public void adicionarEmpregado(Empregado empregado)
   {
      empregados.add(empregado);
   }

   public void removerEmpregado(Empregado empregado)
   {
      empregados.remove(empregado);
   }

   public double totalFolha()
   {
      double soma = 0.0;
      for (Empregado e : empregados)
      {
         soma += e.getSalario();
      }
      return soma;
   }

   @Override
   public String toString()
   {
      StringBuilder sbd = new StringBuilder();
      sbd.append("\n");
      sbd.append("FOLHA DE PAGAMENTO:");
      sbd.append("\n");
      sbd.append("Departamento ");
      sbd.append(nomeDepartamento);
      sbd.append(" = R$ ");
      sbd.append(String.format("%.2f", totalFolha()));
      sbd.append("\n");
      sbd.append("Pagamento realizado no dia ");
      sbd.append(diaPagamento);
      sbd.append("\n");
      sbd.append("Funcionários:");
      sbd.append("\n");
      for (Empregado e : empregados)
      {
         sbd.append(e.getNomeEmpregado());
         sbd.append("\n");
      }
      sbd.append("Para dúvidas favor entrar em contato: vendas@lojatop.com");
      return sbd.toString();
   }
}
