package operacoes_basicas;

import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);

      System.out.println("\nEntradas -------------------------");
      System.out.print("Digite um valor inteiro para A: ");
      int varA = scanner.nextInt();
      System.out.print("Digite um valor inteiro para B: ");
      int varB = scanner.nextInt();

      System.out.println("\nProcessamento --------------------");

      System.out.println("\nSaídas ---------------------------");
      System.out.println("A + B = " + (varA + varB));
      System.out.println("A - B = " + (varA - varB));
      System.out.println("A * B = " + (varA * varB));
      System.out.println("A / B = " + (varA / varB));
      System.out.println("----------------------------------");

      scanner.close();
   }
}
