package exemplo_4.entidades;

public class Escaneador extends Dispositivo implements InterfaceEscaneador
{
   public Escaneador(String serial)
   {
      super(serial);
   }

   @Override
   public void processaDocumento(String documento)
   {
      System.out.println("Processando escaneamento no Escaneador: " + documento);
   }

   @Override
   public String escanear()
   {
      return "Conteúdo escaneado no Escaneador!";
   }
}
