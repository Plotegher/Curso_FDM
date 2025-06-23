package heranca.exemplo_1.programa;

// Módulo 04 / Capítulo 12 / aulas 02, 03, 04 e 05 - Herança e Polimorfismo
// Exemplo: Herança, upcasting, downcasting, sobreposição, super,
// @Override, classes e métodos finais

import heranca.exemplo_1.entidades.Conta;
import heranca.exemplo_1.entidades.ContaEmpresa;
import heranca.exemplo_1.entidades.ContaPoupanca;

public class Main
{
   public static void main(String[] args)
   {
      Conta conta1 = new Conta(1, "Pedro", 200.0);
      System.out.println(conta1);

      ContaEmpresa contaPJ1 = new ContaEmpresa(2, "Maria", 100.0, 50.0);
      System.out.println(contaPJ1);

      // Upcasting - objeto da subclasse atribuído a um objeto da superclasse.

      conta1 = contaPJ1;
      System.out.println(conta1);

      contaPJ1 = (ContaEmpresa) conta1;
      contaPJ1.emprestimo(50.0);
      System.out.println(contaPJ1);

      // Downcasting - objeto da superclasse atribuído a um objeto da subclasse.

      // Operação não permitida. ContaPoupança não é uma ContaPJ.
      // Compilador acusa erro de casting.
      // ContaPJ contaPJ = (ContaPJ) contaPoupanca;

      // Exemplo de sobreposição

      Conta conta2 = new Conta(3, "José", 200.0);
      System.out.println(conta2);

      conta2.saque(25.0);
      System.out.println(conta2);

      ContaPoupanca contaPoupanca1 = new ContaPoupanca(4, "João", 200.0, 0.1);
      System.out.println(contaPoupanca1);

      contaPoupanca1.saque(20.0);
      System.out.println(contaPoupanca1);

      Conta contaPJ2 = new ContaEmpresa(5, "Felipe", 200.0, 100.0);
      contaPJ2.saque(20.0);
      System.out.println(contaPJ2);
   }
}
