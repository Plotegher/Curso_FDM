package exemplo_composicao_1.entidades;

import exemplo_composicao_1.enumeracoes.Nivel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Colaborador
{
   // ATRIBUTOS
   private String nome;
   private Nivel nivel;
   private Double salarioBase;

   // ASSOCIAÇÕES
   // Composição tem um
   private Departamento departamento;
   // Composição tem muitos
   private List<Contrato> contratos = new ArrayList<>();

   // CONSTRUTOR
   public Colaborador(String nome, Nivel nivel, Double salarioBase, Departamento departamento)
   {
      this.nome = nome;
      this.nivel = nivel;
      this.salarioBase = salarioBase;
      this.departamento = departamento;
   }

   // MÉTODOS DE ACESSO GETTERS E SETTERS
   public String getNome()
   {
      return nome;
   }

   public void setNome(String nome)
   {
      this.nome = nome;
   }

   public Nivel getNivel()
   {
      return nivel;
   }

   public void setNivel(Nivel nivel)
   {
      this.nivel = nivel;
   }

   public Double getSalarioBase()
   {
      return salarioBase;
   }

   public void setSalarioBase(Double salarioBase)
   {
      this.salarioBase = salarioBase;
   }

   public Departamento getDepartamento()
   {
      return departamento;
   }

   public void setDepartamento(Departamento departamento)
   {
      this.departamento = departamento;
   }

   public List<Contrato> getContratos()
   {
      return contratos;
   }

   // MÉTODOS ESPECIAIS
   // Associa um contrato com um colaborador
   public void inserirContrato(Contrato contrato)
   {
      contratos.add(contrato);
   }

   // Desassocia um contrato de um colaborador
   public void removerContrato(Contrato contrato)
   {
      contratos.remove(contrato);
   }

   public double remuneracao(int mes, int ano)
   {
      double soma = salarioBase;
      Calendar calendario = Calendar.getInstance();
      for (Contrato c : contratos)
      {
         calendario.setTime(c.getData());
         int cMes = 1 + calendario.get(Calendar.MONTH); //Mês do calendar começa com 0
         int cAno = calendario.get(Calendar.YEAR);
         if (mes == cMes && ano == cAno)
         {
            soma += c.valorTotal();
         }
      }
      return soma;
   }

   /* OBSERVAÇÕES
      # A variável soma começa com salarioBase porque remuneração é o salarioBase
        mais a soma dos contratos que atendem ao período;
      # Um calendário é instanciado com a data-hora atual;
      # Variáveis cMes e cAno capturam mês e ano da variável data;
      # A variável cMes recebe mais 1 porque Calendar.MONTH inicia contagem em 0.
   */
}
