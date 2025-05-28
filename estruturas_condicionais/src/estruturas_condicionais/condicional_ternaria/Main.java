package estruturas_condicionais.condicional_ternaria;

// Módulo 04 / Capítulo 03 / aula 08 - Estruturas condicionais em Java
// Condicional ternária

import java.util.Random;

public class Main
{
   public static void main(String[] args)
   {
      Random random = new Random();
      // Gera números aleatórios entre 0 e 3
      int numero = random.nextInt(4);

      String resposta = (numero <= 1) ? "Cara" : "Coroa";
      System.out.println(resposta);
   }
}
