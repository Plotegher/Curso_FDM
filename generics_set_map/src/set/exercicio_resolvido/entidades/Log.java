package set.exercicio_resolvido.entidades;

import java.util.Date;
import java.util.Objects;

public class Log
{
   private String login;
   private Date momento;

   public Log(String login, Date momento)
   {
      this.login = login;
      this.momento = momento;
   }

   public String getLogin()
   {
      return login;
   }

   public void setLogin(String login)
   {
      this.login = login;
   }

   public Date getMomento()
   {
      return momento;
   }

   public void setMomento(Date momento)
   {
      this.momento = momento;
   }

   @Override
   public boolean equals(Object o)
   {
      if (o == null || getClass() != o.getClass()) return false;
      Log log = (Log) o;
      return Objects.equals(login, log.login);
   }

   @Override
   public int hashCode()
   {
      return Objects.hashCode(login);
   }
}
