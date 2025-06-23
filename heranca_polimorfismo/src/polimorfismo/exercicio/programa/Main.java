package polimorfismo.exercicio.programa;

// Módulo 04 / Capítulo 12 / aula 08 - Herança e Polimorfismo
// Exercício: Polimorfismo

import polimorfismo.exercicio.entidades.Importado;
import polimorfismo.exercicio.entidades.Produto;
import polimorfismo.exercicio.entidades.Usado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main
{
   public static void main(String[] args) throws ParseException
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

      System.out.print("\nDigite o número de produtos: ");
      int n = scanner.nextInt();

      List<Produto> produtos = new ArrayList<>();

      for (int i = 0; i < n; i++)
      {
         System.out.println("Dados do produto n° " + (i + 1) + ":");

         System.out.print("Comum, Importado ou Usado (C/I/U)? ");
         char opcao = scanner.next().toUpperCase().charAt(0);

         System.out.print("Nome: ");
         scanner.nextLine();
         String nome = scanner.nextLine();
         System.out.print("Preço: ");
         double preco = scanner.nextDouble();

         if (opcao == 'C')
         {
            Produto produto = new Produto(nome, preco);
            produtos.add(produto);
         }
         else if (opcao == 'I')
         {
            System.out.print("Custo alfandegário: ");
            double alfandegario = scanner.nextDouble();
            Produto importado = new Importado(nome, preco, alfandegario);
            produtos.add(importado);
         }
         else if (opcao == 'U')
         {
            System.out.print("Data de fabricação (DD/MM/YYYY): ");
            Date data = sdf.parse(scanner.next());
            Produto usado = new Usado(nome, preco, data);
            produtos.add(usado);
         }
      }
      System.out.println("\nETIQUETAS DE PREÇO:");

      for (Produto p : produtos)
      {
         System.out.println(p.etiqueta());
      }

      scanner.close();
   }
}
