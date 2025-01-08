package Poo;

public class PruebaAnimal extends Animal {
    private String raza;

    public PruebaAnimal (Sexo s, String r){
        super(s);
        raza = r;
    }

    public PruebaAnimal(Sexo s){
        super(s);
        raza = "pelo corto";
    }

    public PruebaAnimal(String r){
        super(Sexo.HEMBRA);
        raza = r;
    }

    public PruebaAnimal(){
        super(Sexo.HEMBRA);
        raza = "Siames";
    }

    


}
