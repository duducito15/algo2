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

}
