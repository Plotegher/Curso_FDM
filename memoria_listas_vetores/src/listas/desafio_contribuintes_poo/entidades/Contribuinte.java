package listas.desafio_contribuintes_poo.entidades;

import javax.swing.*;

public class Contribuinte
{
   private Double salario;
   private Double servico;
   private Double capital;
   private Double despesaSaude;
   private Double despesaEducacao;

   public Contribuinte(Double salario, Double servico, Double capital, Double despesaSaude, Double despesaEducacao)
   {
      this.salario = salario;
      this.servico = servico;
      this.capital = capital;
      this.despesaSaude = despesaSaude;
      this.despesaEducacao = despesaEducacao;
   }

   public Double getSalario()
   {
      return salario;
   }

   public void setSalario(Double salario)
   {
      this.salario = salario;
   }

   public Double getServico()
   {
      return servico;
   }

   public void setServico(Double servico)
   {
      this.servico = servico;
   }

   public Double getCapital()
   {
      return capital;
   }

   public void setCapital(Double capital)
   {
      this.capital = capital;
   }

   public Double getDespesaSaude()
   {
      return despesaSaude;
   }

   public void setDespesaSaude(Double despesaSaude)
   {
      this.despesaSaude = despesaSaude;
   }

   public Double getDespesaEducacao()
   {
      return despesaEducacao;
   }

   public void setDespesaEducacao(Double despesaEducacao)
   {
      this.despesaEducacao = despesaEducacao;
   }

   // Imposto sobre salários
   public Double impostoSalario()
   {
      if (salario < 36000.0)
      {
         return 0.0;
      }
      else if (salario >= 36000.0 && salario < 60000.0)
      {
         return salario * 0.10;
      }
      else
      {
         return salario * 0.20;
      }
   }

   // Imposto sobre serviços
   public Double impostoServico()
   {
      return (servico != 0.0) ? servico * 0.15 : 0.0;
   }

   // Imposto sobre ganhos de capital
   public Double impostoCapital()
   {
      return (capital > 0.0) ? capital * 0.20 : 0.0;
   }

   // Imposto bruto
   public Double impostoBruto()
   {
      return impostoSalario() + impostoServico() + impostoCapital();
   }

   // Método auxiliar para gastos dedutíveis
   public Double gastosDedutiveis()
   {
      return despesaSaude + despesaEducacao;
   }

   // Método auxiliar para máximo dedutível
   public Double maximoDedutivel()
   {
      return impostoBruto() * 0.30;
   }

   // Abatimento de impostos
   public Double abatimento()
   {
      if (gastosDedutiveis() < maximoDedutivel())
      {
         return gastosDedutiveis();
      }
      else
      {
         return maximoDedutivel();
      }
   }

   // Imposto líquido
   public Double impostoLiquido()
   {
      return impostoBruto() - abatimento();
   }
}
