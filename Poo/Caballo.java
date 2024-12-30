package Poo;

public class Caballo {
    // Atributos
    String nombre;
    String color;
    String raza;
    String sexo;
    int edad;
    int carrerasGanadas;

    // Metodos
        // Constructor
        Caballo(String n, String c, String r, String s, int e){
            this.nombre = n;
            this.color = c;
            this.raza = r;
            this.sexo = s;
            this.edad = e;
        }
    
        public String getNombre(){
            return this.nombre;
        }

        public void relincha(){
            System.out.println("Hiiiiiiiieeeeeeee");
        }

        public void cabalga(){
            System.out.println("Tocotoc tocotoc tocotoc");
        }

        public void rumia(){
            System.out.println("Ñam ñam ñam");
        }
}
