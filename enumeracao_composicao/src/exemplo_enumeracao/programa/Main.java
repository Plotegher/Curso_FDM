package exemplo_enumeracao.programa;

// Módulo 04 / Capítulo 11 / aula 02 - Enumeração e Composição
// Exemplo e enumeração

import exemplo_enumeracao.entidades.Pedido;
import exemplo_enumeracao.enumeracao.Status;

import java.util.Date;

public class Main
{
   public static void main(String[] args)
   {
      Pedido pedido_1 = new Pedido(1, new Date(), Status.RECEBIDO);
      System.out.println(pedido_1);

      // Conversão de Enum para String

      Status status_1 = Status.APROVADO;
      Status status_2 = Status.valueOf("SEPARADO");

      System.out.println(status_1);
      System.out.println(status_2);
   }
}
