package desafio_plataforma_de_ensino_poo.programa;

// Módulo 04 / Capítulo 12 / aula 12 - Herança e Polimorfismo
// Desafio: Plataforma de ensino POO

import desafio_plataforma_de_ensino_poo.entidades.Aula;
import desafio_plataforma_de_ensino_poo.entidades.Tarefa;
import desafio_plataforma_de_ensino_poo.entidades.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);
      Scanner scanner = new Scanner(System.in);

      List<Aula> aulas = new ArrayList<>();

      System.out.print("Quantas aulas tem o curso? ");
      int n = scanner.nextInt();

      for (int i = 0; i < n; i++)
      {
         System.out.println("\nDados da " + (i + 1) + "ª aula:");
         System.out.print("Vídeo ou tarefa (V/T)? ");
         char opcao = scanner.next().toUpperCase().charAt(0);

         System.out.print("Título: ");
         scanner.nextLine();
         String titulo = scanner.nextLine();

         if (opcao == 'V')
         {
            System.out.print("URL do vídeo: ");
            String url = scanner.nextLine();
            System.out.print("Duração em segundos: ");
            int segundos = scanner.nextInt();
            Aula video = new Video(titulo, url, segundos);
            aulas.add(video);
         }

         if (opcao == 'T')
         {
            System.out.print("Descrição: ");
            String descricao = scanner.nextLine();
            System.out.print("Quantidade de questões: ");
            int questoes = scanner.nextInt();
            Aula tarefa = new Tarefa(titulo, descricao, questoes);
            aulas.add(tarefa);
         }
      }

      int soma = 0;
      for (Aula a : aulas)
      {
         soma += a.duracao();
      }
      System.out.println("\nDURAÇÃO TOTAL DO CURSO = " + soma + " segundos");

      scanner.close();
   }
}
