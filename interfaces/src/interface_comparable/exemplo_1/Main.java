package interface_comparable.exemplo_1;

// Módulo 04 / Capítulo 15 / aula 12 - Interfaces
// Problema 1: Faça um programa para ler um arquivo contendo nomes de pessoas (um nome por
// linha), armazenando-os em uma lista. Depois, ordenar os dados dessa lista e mostrá-los
// ordenadamente na tela. Nota: o caminho do arquivo pode ser informado "hardcode".

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
   public static void main(String[] args)
   {
      String caminho = "C:\\Projetos\\Java\\Curso_FDM\\Programacao_Moderna\\";
      caminho += "interfaces\\src\\interface_comparable\\exemplo_1\\entrada.txt";

      List<String> lista = new ArrayList<>();

      try (BufferedReader bfr = new BufferedReader(new FileReader(caminho)))
      {
         String nome = bfr.readLine();
         while (nome != null)
         {
            lista.add(nome);
            nome = bfr.readLine();
         }
         // Utilizou-se somente a classe Collections para ordenar os nomes de uma lista.
         Collections.sort(lista);

         for (String s : lista)
         {
            System.out.println(s);
         }
      }
      catch (IOException e)
      {
         System.out.println("Erro: " + e.getMessage());
      }
   }
}
