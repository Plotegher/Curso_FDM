package exercicio_proposto.cenarios;

// Módulo 04 / Capítulo 14 / aula 08 - Trabalhando com arquivos
// Exercício proposto

import exercicio_proposto.modelos.entidades.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main
{
   public static void main(String[] args)
   {
      //Scanner scanner = new Scanner(System.in);
      Locale.setDefault(Locale.US);
      List<Produto> produtos = new ArrayList<>();

      //System.out.println("Digite a origem do arquivo de entrada: ");
      //String origem = scanner.nextLine();
      String caminho = "C:\\Projetos\\Java\\Curso_FDM\\Programacao_Moderna\\";
      caminho += "trabalhando_arquivos\\src\\exercicio_proposto\\vendas.csv";

      File origem = new File(caminho);
      // getParent() retorna o diretório pai de um caminho especificado.
      String pastaDestino = origem.getParent();
      System.out.println(pastaDestino);

      // Cria uma pasta num caminho especificado
      boolean criaPasta = new File(pastaDestino + "\\saida").mkdir();

      String arquivoDestino = pastaDestino + "\\saida\\resumo.csv";

      try (BufferedReader bufferedReader = new BufferedReader(new FileReader(caminho)))
      {
         String linha = bufferedReader.readLine();
         while (linha != null)
         {
            String[] vetor = linha.split(",");
            String nome = vetor[0];
            double preco = Double.parseDouble(vetor[1]);
            int quantidade = Integer.parseInt(vetor[2]);

            produtos.add(new Produto(nome, preco, quantidade));
            linha = bufferedReader.readLine();
         }

         // BufferedWriter(new FileWriter(arquivoDestino, true))
         try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivoDestino)))
         {
            for (Produto p : produtos)
            {
               bufferedWriter.write(p.getNome() + "," + String.format("%.2f", p.subTotal()));
               bufferedWriter.newLine();
            }
         }
         catch (IOException e)
         {
            System.out.println("Erro na escrita do arquivo! " + e.getMessage());
         }
      }
      catch (IOException e)
      {
         System.out.println("Erro na leitura do arquivo: " + e.getMessage());
      }
      //scanner.close();
   }
}
