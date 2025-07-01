package default_methods.programa;

// Módulo 04 / Capítulo 15 / aula 13 - Interfaces
// Exemplo de Default methods

import default_methods.entidades.ServicoJuros;
import default_methods.servicos.JurosAmerica;
import default_methods.servicos.JurosBrasil;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      System.out.print("Montante: ");
      double montante = scanner.nextDouble();
      System.out.print("Meses: ");
      int meses = scanner.nextInt();

      ServicoJuros impostoBrasil = new JurosBrasil(2.0);
      double pagamento_1 = impostoBrasil.pagamento(montante, meses);

      System.out.println("Pagamento BRL após " + meses + " meses:");
      System.out.println(String.format("%.2f", pagamento_1));

      ServicoJuros impostoAmerica = new JurosAmerica(1.0);
      double pagamento_2 = impostoAmerica.pagamento(montante, meses);

      System.out.println("Pagamento USA após " + meses + " meses:");
      System.out.println(String.format("%.2f", pagamento_2));

      scanner.close();
   }
}
