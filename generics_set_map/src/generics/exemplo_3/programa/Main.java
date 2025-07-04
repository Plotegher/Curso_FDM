package generics.exemplo_3.programa;

// Módulo 04 / Capítulo 16 / aula 03 - Generics, Set e Map
// Exemplo 3: Generics delimitados

import generics.exemplo_3.entidades.Produto;
import generics.exemplo_3.servicos.ServicoCalculo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main
{
   public static void main(String[] args)
   {
      Locale.setDefault(Locale.US);

      List<Produto> lista = new ArrayList<>();

      String caminho = "C:\\Projetos\\Java\\Curso_FDM\\Programacao_Moderna\\";
      caminho += "generics_set_map\\src\\generics\\exemplo_3\\entrada.txt";

      try (BufferedReader bfr = new BufferedReader(new FileReader(caminho)))
      {
         String linha = bfr.readLine();
         while (linha != null)
         {
            String[] campos = linha.split(",");
            String nome = campos[0];
            double preco = Double.parseDouble(campos[1]);
            lista.add(new Produto(nome, preco));
            linha = bfr.readLine();
         }

         Produto p = ServicoCalculo.maximo(lista);
         System.out.println("Mais caro: " + p);
      }
      catch (IOException e)
      {
         System.out.println("Erro: " + e.getMessage());
      }
   }
}
