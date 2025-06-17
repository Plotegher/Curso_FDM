package exemplo_composicao_1.programa;

// Módulo 04 / Capítulo 11 / aulas 05 e 06 - Enumeração e Composição
// Exemplo de composição

import exemplo_composicao_1.entidades.Colaborador;
import exemplo_composicao_1.entidades.Contrato;
import exemplo_composicao_1.entidades.Departamento;
import exemplo_composicao_1.enumeracoes.Nivel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args) throws ParseException
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

      System.out.print("Digite o nome do departamento: ");
      // Intanciação de um departamento
      Departamento departamento = new Departamento(scanner.nextLine());

      System.out.println("\nDigite os dados do colaborador:");
      System.out.print("Nome: ");
      String nome = scanner.nextLine();
      System.out.print("Nível: ");
      String nivel = scanner.nextLine();
      System.out.print("Salário base: ");
      Double salario = scanner.nextDouble();

      // Intanciação de um colaborador
      Colaborador colaborador = new Colaborador
            (nome, Nivel.valueOf(nivel), salario, departamento);

      System.out.print("\nQuantos contratos serão digitados? ");
      int n = scanner.nextInt();

      for (int i = 0; i < n; i ++)
      {
         System.out.println("\nDigite os dados do contrato n°" + (i + 1) + ":");
         System.out.print("Data (DD/MM/YYYY): ");
         // sdf.parse adicionou exceção ParseException na assinatura do main
         Date data = sdf.parse(scanner.next());
         System.out.print("Valor por hora: ");
         Double valor = scanner.nextDouble();
         System.out.print("Duração (horas): ");
         Integer horas = scanner.nextInt();
         // Intanciação de um contrato
         Contrato contrato = new Contrato(data, valor, horas);
         // Associação do contrato ao colaborador
         colaborador.inserirContrato(contrato);
      }

      System.out.print("\nDigite o mês e ano para calcular a remuneração (MM/YYYY): ");
      String periodo = scanner.next();
      int mes = Integer.parseInt(periodo.substring(0, 2));
      int ano = Integer.parseInt(periodo.substring(3));
      System.out.println("Nome: " + colaborador.getNome());
      System.out.println("Departamento: " + colaborador.getDepartamento().getNome());
      System.out.println("Remuneração para " + periodo + ": "
         + String.format("%.2f", colaborador.remuneracao(mes, ano)));

      scanner.close();
   }
}
