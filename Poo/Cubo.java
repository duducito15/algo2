package Poo;

public class Cubo {
    // Atributos
    private int capacidad; // litros maximo
    int contenido; // litros actuales

    // Metodos
    // Construtor
    Cubo(int c) {
        this.capacidad = c;
    }

    // getter
    int getCapacidad() {
        return this.capacidad;
    }

    int getContenido() {
        return this.contenido;
    }

    // Setter
    void setCapacidad(int litros) {
        this.capacidad = litros;
    }

    void setContenido(int litros) {
        this.contenido = litros;
    }

    // otros metodos
    void vacia() {
        this.contenido = 0;
    }

    void llena() {
        this.contenido = this.capacidad;
    }

    // Pinta cubo en la pantalla
    void pintaCubo() {
        for (int nivel = this.capacidad; nivel > 0; nivel--) {
            if (this.contenido >= nivel) {
                System.out.println("#~~~~#");
            } else {
                System.out.println("#    #");
            }
        }
        System.out.println("######");
    }

    // Volcar el contenido de un cubo sobre otro
    void vuelvaEn(Cubo destino) {
        int libres = destino.getCapacidad() - destino.getContenido();

        if (libres > 0) {
            if (this.contenido <= libres) {
                destino.setContenido(destino.getContenido() + this.contenido);
                this.vacia();
            } else {
                this.contenido -= libres; // this.contenido = this.contenido - libres;
                destino.llena();
            }
        }
    }
}
