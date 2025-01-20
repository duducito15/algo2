package Poo;

public class Gato {
   // Atributos
   public String nombre, color, raza, sexo;
   public int edad;
   public double peso;

   // Metodos

   // Constructor
   public Gato(String n, String s, String c, String r, int e, double p) {
      this.nombre = n;
      this.sexo = s;
      this.color = c;
      this.raza = r;
      this.edad = e;
      this.peso = p;
   }

   // getter

   public String getNombre() {
      return this.nombre;
   }

   // Haz que el gato maulle
   public String maullar() {
      String maullido = "Miauuuuu, Miauuuu";
      return maullido;
   }

   // haz que gato ronronee
   void ronronear() {
      System.out.println("mrrrrrr, mrrrrr");
   }

   // Haz que el gato coma
   /*
    * A los gatos les gusta el pescado, si le das otra
    * comida lo rechaza
    */
   void come(String comida) {
      if (comida.equals("pescado")) {
         System.out.println("Ñam ñam!!!");
      } else {
         System.out.println("Guacala!!!");
      }
   }

   // Pon a pelear a dos gatos
   // Solo se pelean si ambos son machos

   // void peleaCon(Gato contrincante){
   // if (this.sexo.equals("hembra")) {
   // System.out.println("Vamos a ronronear!!!!");
   // } else {
   // if (contrincante.getSexo().equals("hembra")) {
   // System.out.println("Vamos a ronronear!!!!");
   // } else {
   // System.out.println("Ven aqui que te voy moler a palos!!!!");
   // }
   // }
   // }

}
