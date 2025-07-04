package set.exercicio_resolvido.programa;

// Módulo 04 / Capítulo 16 / aula 10 - Generics, Set e Map
// Exercício resolvido de Set

import set.exercicio_resolvido.entidades.Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main
{
   public static void main(String[] args)
   {
      String caminho = "C:\\Projetos\\Java\\Curso_FDM\\Programacao_Moderna\\";
      caminho += "generics_set_map\\src\\set\\exercicio_resolvido\\entrada.txt";

      Scanner scanner = new Scanner(System.in);

      try (BufferedReader bfr = new BufferedReader(new FileReader(caminho)))
      {
         Set<Log> set = new HashSet<>();

         String linha = bfr.readLine();
         while (linha != null)
         {
            String[] campos = linha.split(" ");
            String login = campos[0];
            Date momento = Date.from(Instant.parse(campos[1]));
            set.add(new Log(login, momento));
            linha = bfr.readLine();
         }
         System.out.println("Total de usuários: " + set.size());
      }
      catch (IOException e)
      {
         System.out.println("Erro: " + e.getMessage());
      }
      scanner.close();
   }
}
