package desafio_combate_poo.entidades;

public class Campeao
{
   private String nome;
   private int vida;
   private int ataque;
   private int armadura;

   public Campeao(String nome, int vida, int ataque, int armadura)
   {
      this.nome = nome;
      this.vida = vida;
      this.ataque = ataque;
      this.armadura = armadura;
   }

   public String getNome()
   {
      return nome;
   }

   public void setNome(String nome)
   {
      this.nome = nome;
   }

   public int getVida()
   {
      return vida;
   }

   public void setVida(int vida)
   {
      this.vida = vida;
   }

   public int getAtaque()
   {
      return ataque;
   }

   public void setAtaque(int ataque)
   {
      this.ataque = ataque;
   }

   public int getArmadura()
   {
      return armadura;
   }

   public void setArmadura(int armadura)
   {
      this.armadura = armadura;
   }

   public void receberDano(Campeao outroCampeao)
   {
      if (this.ataque > outroCampeao.armadura)
      {
         outroCampeao.vida -= this.ataque - outroCampeao.armadura;
      }
      else
      {
         outroCampeao.vida -= 1;
      }
   }

   public String status()
   {
      if (vida <= 0)
      {
         setVida(0);
         return nome
               + ": "
               + vida
               + " de vida (morreu)";
      }
      else
      {
         return nome
               + ": "
               + vida
               + " de vida";
      }
   }
}
