package Poo;

public abstract class Animal {
    private Sexo sexo;

    public Animal() {
        sexo = sexo.PANSEXUAL;
    }

    public Animal(Sexo s) {
        sexo = s;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public String toString() {
        return "Sexo: " + this.sexo + "\n";
    }

    //
    public void duerme(){
        System.out.println("Zzzzzzzzzz");
    }

}
