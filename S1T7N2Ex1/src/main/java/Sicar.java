import java.io.Serializable;

     public class Sicar implements Serializable {

          private String nom;
          private int rate;

          public Sicar(String nom,int rate){
               this.nom = nom;

               this.rate = rate;
          }

          public String getNom() {
               return this.nom;
          }

          public void setNom(String nom) {
               this.nom = nom;
          }

          public int getRate() {
               return this.rate;
          }

          public void setRate(int rate) {
               this.rate = rate;
          }

          public String toString(){
               return this.nom + " té un percentatge d´èxit del " + this.rate + " %.";
          }
     }
