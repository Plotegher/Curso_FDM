package exemplo_4.entidades;

public abstract class Dispositivo
{
   private String serial;

   public Dispositivo(String serial)
   {
      this.serial = serial;
   }

   public String getSerial()
   {
      return serial;
   }

   public void setSerial(String serial)
   {
      this.serial = serial;
   }

   public abstract void processaDocumento(String documento);
}
