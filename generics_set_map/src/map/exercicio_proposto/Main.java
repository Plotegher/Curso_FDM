package map.exercicio_proposto;

// Módulo 04 / Capítulo 16 / aula 12 - Generics, Set e Map
// Exercício proposto

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main
{
   public static void main(String[] args)
   {
      String caminho = "C:\\Projetos\\Java\\Curso_FDM\\Programacao_Moderna\\" +
            "generics_set_map\\src\\map\\exercicio_proposto\\entrada.csv";

      Map<String, Integer> mapa = new LinkedHashMap<>();

      try (BufferedReader bfr = new BufferedReader(new FileReader(caminho)))
      {
         String linha = bfr.readLine();

         while (linha != null)
         {
            String[] campos = linha.split(",");
            String nome = campos[0];
            int votos = Integer.parseInt(campos[1]);

            int subtotal = 0;
            if (mapa.containsKey(nome))
            {
               subtotal = mapa.get(nome);
               mapa.put(nome, votos + subtotal);
            }
            else
            {
               mapa.put(nome, votos);
            }

            linha = bfr.readLine();
         }
         System.out.println("Total de candidatos: " + mapa.size());

         for (String k : mapa.keySet())
         {
            System.out.println(k + ": " + mapa.get(k));
         }
      }
      catch (IOException e)
      {
         System.out.println("Erro: " + e.getMessage());
      }
   }
}
