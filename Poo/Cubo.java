package Poo;

public class Cubo {
    //Atributos
    int capacidad; // litros maximo
    int contenido; // litros actuales

    //Metodos
        //Construtor
        Cubo(int c){
            this.capacidad = c;
        }

        //getter
        int getCapacidad(){
            return this.capacidad;
        }
        int getContenido(){
            return this.contenido;
        }

        //Setter
        void setCapacidad(int litros){
            this.capacidad = litros;
        }

        void setContenido(int litros){
            this.contenido = litros;
        }
}
