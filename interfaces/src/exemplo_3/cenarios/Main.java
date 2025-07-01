package exemplo_3.cenarios;

// Módulo 04 / Capítulo 15 / aula 10 - Interfaces
// Exemplo 3: Solução com interface e classe abstrata / Herdar x Cumprir contrato

import exemplo_3.modelos.entidades.Circulo;
import exemplo_3.modelos.entidades.Figura;
import exemplo_3.modelos.entidades.FiguraAbstrata;
import exemplo_3.modelos.entidades.Retangulo;
import exemplo_3.modelos.enumeracoes.Cor;

public class Main
{
   public static void main(String[] args)
   {
      // Objetos instanciados a partir da classe abstrata
      // "FiguraAbstrata" (Herança)
      FiguraAbstrata figura_1 = new Circulo(Cor.PRETO, 2.0);
      FiguraAbstrata figura_2 = new Retangulo(Cor.BRANCO, 3.0, 4.0);

      // Objeto instanciado sem definir uma cor a partir
      // da interface "Figura" (Cumpriu o contrato)
      Figura figura_3 = new Circulo(null, 5.0);

      System.out.println("Círculo cor: " + figura_1.getCor());
      System.out.println("Área do círculo: " + String.format("%.3f", figura_1.area()));
      System.out.println("Retângulo cor: " + figura_2.getCor());
      System.out.println("Área do retângulo: " + String.format("%.3f", figura_2.area()));

      System.out.println("Área do círculo sem cor: " + String.format("%.3f", figura_3.area()));
   }
}
