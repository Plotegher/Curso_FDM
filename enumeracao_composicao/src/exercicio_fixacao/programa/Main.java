package exercicio_fixacao.programa;

// Módulo 04 / Capítulo 11 / aula 08 - Enumeração e Composição
// Exercício de fixação

import exercicio_fixacao.entidades.Cliente;
import exercicio_fixacao.entidades.Item;
import exercicio_fixacao.entidades.Pedido;
import exercicio_fixacao.entidades.Produto;
import exercicio_fixacao.enumeracoes.Status;

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

      System.out.println("\nDigite os dados do cliente:");
      System.out.print("Nome: ");
      String nomeCliente = scanner.nextLine();
      System.out.print("E-mail: ");
      String email = scanner.nextLine();
      System.out.print("Aniversário (DD/MM/YYYY): ");
      Date aniversario = sdf.parse(scanner.next());

      Cliente cliente = new Cliente(nomeCliente, email, aniversario);

      System.out.println("\nDigite os dados do pedido:");
      System.out.print("Status: ");
      scanner.nextLine();
      String status = scanner.nextLine();

      Pedido pedido = new Pedido(new Date(), Status.PROCESSANDO, cliente);

      System.out.print("Quantos itens haverão nesse pedido? ");
      int n = scanner.nextInt();
      double soma = 0.0;
      for (int i = 0; i < n; i++)
      {
         System.out.println("\nDigite os dados do item n° " + (i + 1) + ":");
         System.out.print("Nome do produto: ");
         scanner.nextLine();
         String nomeProduto = scanner.nextLine();
         System.out.print("Preço do produto: ");
         double precoProduto = scanner.nextDouble();
         System.out.print("Quantidade: ");
         int quantidade = scanner.nextInt();

         Produto produto = new Produto(nomeProduto, precoProduto);
         Item item = new Item(quantidade, precoProduto, produto);

         pedido.adicionarItem(item);
         soma += item.subTotal();
      }

      System.out.print(pedido.toString());
      System.out.printf("Valor total: R$ %.2f", soma);

      scanner.close();
   }
}
