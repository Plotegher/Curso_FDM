package exemplo_4.entidades;

public class Impressora extends Dispositivo implements InterfaceImpressora
{

   public Impressora(String serial)
   {
      super(serial);
   }

   @Override
   public void processaDocumento(String documento)
   {
      System.out.println("Processando impressão na impressora: " + documento);
   }

   @Override
   public void imprimir(String documento)
   {
      System.out.println("Imprimindo na impressora: " + documento);
   }
}
