package exemplo_4.entidades;

public class Multifuncional extends Dispositivo implements InterfaceEscaneador, InterfaceImpressora
{

   public Multifuncional(String serial)
   {
      super(serial);
   }

   @Override
   public void processaDocumento(String documento)
   {
      System.out.println("Processando impressão na multifuncional: " + documento);
   }

   @Override
   public String escanear()
   {
      return "Conteúdo escaneado na multifuncional!";
   }

   @Override
   public void imprimir(String documento)
   {
      System.out.println("Imprimindo na multifuncional: " + documento);
   }
}
