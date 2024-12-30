package Poo;

public class Gato {
 //Atributos
 String color, raza, sexo;
 int edad;
 double peso;
 
 //Metodos

 //Constructor
 Gato(String s, String c, String r, int e, double p){
    this.sexo = s;
    this.color = c;
    this.raza = r;
    this.edad = e;
    this.peso = p;
 }

 //getter
 String getSexo(){
    return this.sexo;
 }
 String getColor(){
    return this.color;
 }

 //Haz que el gato maulle
 void maullar(){
    System.out.println("Miauuuuu, Miauuuu");
 }

 //haz que gato ronronee
 void ronronear(){
    System.out.println("mrrrrrr, mrrrrr");
 }

 //Haz que el gato coma
 /*
  * A los gatos les gusta el pescado, si le das otra 
  * comida lo rechaza
  */
  void come(String comida){
    if (comida.equals("pescado")) {
        System.out.println("Ñam ñam!!!");
    } else {
        System.out.println("Guacala!!!");
    }
  }

  //Pon a pelear a dos gatos
  //Solo se pelean si ambos son machos

  void peleaCon(Gato contrincante){
   if (this.sexo.equals("macho")) {
      System.out.println("Ven aqui que te voy moler a palos!!!!");
   } else {
      System.out.println("Vamos a ronronear!!!!");
   }
  }


}
