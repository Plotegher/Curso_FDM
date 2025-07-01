package interface_comparable.exemplo_2.programa;

// Módulo 04 / Capítulo 15 / aula 12 - Interfaces
// Problema 2: Faça um programa para ler um arquivo contendo funcionários (nome e salário) no
// formato.csv, armazenando-os em uma lista. Depois, ordenar a lista por nome e mostrar
// o resultado na tela. Nota: o caminho do arquivo pode ser informado "hardcode".

import interface_comparable.exemplo_2.entidades.Funcionario;

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
      caminho += "interfaces\\src\\interface_comparable\\exemplo_2\\entrada.csv";

      List<Funcionario> funcionarios = new ArrayList<>();

      try (BufferedReader bfr = new BufferedReader(new FileReader(caminho)))
      {
         String funcionarioCSV = bfr.readLine();
         while (funcionarioCSV != null)
         {
            String[] campos = funcionarioCSV.split(",");
            funcionarios.add(new Funcionario(campos[0], Double.parseDouble(campos[1])));
            funcionarioCSV = bfr.readLine();
         }
         // Utilizou-se a classe Collections juntamente com o método compareTo() para
         // ordenar uma lista.

         Collections.sort(funcionarios);

         for (Funcionario f : funcionarios)
         {
            System.out.println(f.getNome() + ", " + f.getSalario());
         }
      }
      catch (IOException e)
      {
         System.out.println("Erro: " + e.getMessage());
      }
   }
}
